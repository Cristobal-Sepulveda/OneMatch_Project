package com.example.android.onematchproject.ui.map

import android.app.Application
import android.os.Build
import android.util.Log
import androidx.fragment.app.FragmentTransaction
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.example.android.onematchproject.base.BaseViewModel
import com.example.android.onematchproject.data.AppDataSource
import com.example.android.onematchproject.data.data_objects.DBO.FIELD_DBO
import com.example.android.onematchproject.data.data_objects.DTO.FIELD_DTO
import com.example.android.onematchproject.data.data_objects.DTO.asDataBaseModel
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.firestore.GeoPoint
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

enum class CloudDownloadComplete{LOADING, ERROR, DONE}
class MapViewModel(val app: Application, val dataSource: AppDataSource) : BaseViewModel(app) {

    var listOfFields: List<FIELD_DBO> = listOf()

    private val _listHaveData = MutableLiveData(false)
    val listHaveData: LiveData<Boolean>
        get() = _listHaveData

    private val _downloadFromCloud = MutableLiveData(false)
    val downloadFromCloud: LiveData<Boolean>
        get()= _downloadFromCloud

    private val _status = MutableLiveData<CloudDownloadComplete>(CloudDownloadComplete.LOADING)
    val status: LiveData<CloudDownloadComplete>
        get()= _status

    val cloudDB = FirebaseFirestore.getInstance()

    fun getFields() {
        Log.i("Launched", "getFields")
        viewModelScope.launch {
            listOfFields = dataSource.gettingFieldsFromDatabase()
            if (listOfFields.isNullOrEmpty()) {
                Log.i("Launched", "list empty")
                gettingFieldsFromCloudFirestore()
            }
            if (!listOfFields.isNullOrEmpty()) {
                Log.i("Launched", "list with data")
                _status.value = CloudDownloadComplete.DONE
                _listHaveData.value = true
            }
            Log.i("Launched_listVALOR", "$listOfFields")
        }
    }

    /**
     * This methods is used to get field's data from a particular comuna saved in Cloud Firestore.
     * This method is only used if the user dont have that data in the APP_DATABASE.
     *
     * The logic behind getting the field's data in this way is to have an APP that
     * needs less MB to work and
     * also, after the app get the data we save the data in ROOM so the user will have this data to
     * reuse in future. That means less consults to CLOUD_FIRESTORE and less cost to me haha.
     * **/
    suspend fun gettingFieldsFromCloudFirestore() {

        Log.i("Launched", "GettingFieldsFromCloudFirestore")
        val comuna = cloudDB.collection("FIELD_S").get()

        comuna.addOnSuccessListener {
            Log.i("Launched", "requestSuccess")
            var i = 0
            while (i < it.size()) {
                val singleFieldId = it.documents[i].get("id")
                val singleFieldInfo = it.documents[i].get("field_info") as ArrayList<*>
                val fieldDTO = FIELD_DTO(
                    singleFieldInfo[0] as String,
                    singleFieldInfo[1] as String,
                    (singleFieldInfo[2] as GeoPoint).latitude,
                    (singleFieldInfo[2] as GeoPoint).longitude,
                    singleFieldId as String
                )
                viewModelScope.launch {
                    withContext(Dispatchers.IO) {
                        dataSource.savingFieldToLocalDatabase(fieldDTO.asDataBaseModel(fieldDTO))
                    }
                }
                i++
            }
            _status.value = CloudDownloadComplete.DONE
            Log.i("Launched", "GettingFieldsFromCloudFirestore EXIT")
            _downloadFromCloud.value = true
        }

        comuna.addOnFailureListener {
            Log.i("Launched", "requestFailed")
            Log.i("Launched", "GettingFieldsFromCloudFirestore EXIT")
            _status.value = CloudDownloadComplete.ERROR
            showSnackBar.value = "Cant download fields from Cloud, the map will be restarted.\n\t" +
                    " You need internet to download fields"
        }

    }

    fun onDrawComplete() {
        _listHaveData.value = false
    }

    fun onDownloadComplete() {
        _downloadFromCloud.value = false
    }
}
