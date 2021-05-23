package com.example.android.onematchproject.ui.map

import android.app.Application
import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.example.android.onematchproject.base.BaseViewModel
import com.example.android.onematchproject.data.dbo.FieldDBO
import com.example.android.onematchproject.data.dto.FieldDTO
import com.example.android.onematchproject.data.dto.asDataBaseModel
import com.example.android.onematchproject.data.local.AppDataSource
import com.example.android.onematchproject.data.local.AppDatabase
import com.example.android.onematchproject.data.local.LocalDB
import com.example.android.onematchproject.utils.Result
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.firestore.GeoPoint
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.ensureActive
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class MapViewModel(
    val app: Application, val dataSource: AppDataSource) : BaseViewModel(app) {
    var listOfFields: List<FieldDBO> = listOf()

    private val _listHaveData = MutableLiveData(false)
    val listHaveData: LiveData<Boolean>
        get() = _listHaveData

    val cloudDB = FirebaseFirestore.getInstance()
    fun getFields(){
        viewModelScope.launch{
            Log.i("Launched", "getFields")
            withContext(Dispatchers.IO) {
                listOfFields = dataSource.gettingFieldsFromDatabase()
                if (listOfFields.isNullOrEmpty()) {
                    Log.i("Launched", "list empty")
                    gettingFieldsFromCloudFirestore()
                }
            }
            if(!listOfFields.isNullOrEmpty()){
                Log.i("Launched", "list with data")
                _listHaveData.value = true
            }
            Log.i("Launched_listVALOR", "$listOfFields")
        }
    }

    /**
     * This code is used to get all the field coordinate's and mark them on googleMaps.
     *
     * This is made in the activity because if the user wants to navigate on the fragment container, we
     * never will lose this data, and the consults to the database are less
     * - we use this data in MapFragment, markingFields() method -
     **/
    suspend fun gettingFieldsFromCloudFirestore() {
        val comuna = cloudDB.collection("MAIPU").get()

        comuna.addOnSuccessListener {
            Log.i("Launched", "GettingFieldsFromCloudFirestore")
            var i = 0
            while (i < it.size()) {
                val singleFieldInfo = it.documents[i].get("field_info") as ArrayList<*>
                val fieldDTO = FieldDTO(
                   i + 1,
                    singleFieldInfo[0] as String,
                    singleFieldInfo[1] as String,
                    singleFieldInfo[2] as GeoPoint
                )
                viewModelScope.launch{
                    withContext(Dispatchers.IO) {
                        dataSource.savingFieldToLocalDatabase(fieldDTO.asDataBaseModel(fieldDTO))
                    }
                }
                i++
            }
            Log.i("Launched", "GettingFieldsFromCloudFirestore EXIT")
        }

        comuna.addOnFailureListener {
        }

    }

    fun onDrawComplete(){
        _listHaveData.value = false
    }
}