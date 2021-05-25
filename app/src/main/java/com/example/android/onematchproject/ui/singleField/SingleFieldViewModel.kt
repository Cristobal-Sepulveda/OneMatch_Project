package com.example.android.onematchproject.ui.singleField

import android.app.Application
import android.util.Log
import androidx.lifecycle.viewModelScope
import com.example.android.onematchproject.base.BaseViewModel
import com.example.android.onematchproject.data.dataclass.dbo.DayDBO
import com.example.android.onematchproject.data.dataclass.dto.FieldDTO
import com.example.android.onematchproject.data.dataclass.dto.asDataBaseModel
import com.example.android.onematchproject.data.local.AppDataSource
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.firestore.GeoPoint
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class SingleFieldViewModel(val app: Application,
                           val dataSource: AppDataSource, ) : BaseViewModel(app) {

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
    fun gettingDaysCalendarFromCloudFirestore(day: Int, date: String) {
        Log.i("Launched", "GettingDaysCalendarFromCloudFirestore")
        val daysAvailableInCalendar = cloudDB.collection("MAIPU")
            .document("2")
            .collection("CALENDARIO").get()

        daysAvailableInCalendar.addOnSuccessListener {
            val singleDayCalendar = it.documents[day]
            val dayDBO = DayDBO(
                day,
                date,
                singleDayCalendar.get("five_to_six") as Array<String>,
                singleDayCalendar.get("six_to_seven") as Array<String>,
                singleDayCalendar.get("seven_to_eight") as Array<String>,
                singleDayCalendar.get("eight_to_nine") as Array<String>,
                singleDayCalendar.get("nine_to_eight") as Array<String>
            )

            viewModelScope.launch {
                dataSource.savingASingleDayOfTheCalendarFromCloudFirestore(dayDBO)
            }
        }

        daysAvailableInCalendar.addOnFailureListener {
        }
    }
}