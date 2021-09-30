package com.example.android.onematchproject.ui.singleField

import android.app.Application
import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.example.android.onematchproject.base.BaseViewModel
import com.example.android.onematchproject.data.AppDataSource
import com.google.firebase.firestore.DocumentSnapshot
import com.google.firebase.firestore.EventListener
import com.google.firebase.firestore.FirebaseFirestore
import kotlinx.coroutines.launch

class SingleFieldViewModel(val app: Application,
                           val dataSource: AppDataSource, ) : BaseViewModel(app) {

    val cloudDB = FirebaseFirestore.getInstance()
    data class user(
        val name: String,
        val mail: String
    )

    private val _selectedDate = MutableLiveData(1)
    val selectedDate: LiveData<Int>
        get() = _selectedDate

    private val _listOfPlayers = MutableLiveData<List<user>>()
    val listOfPlayers: LiveData<List<user>>
        get() = _listOfPlayers


    fun gettingListOfPlayersToHourAndDateSelected_FromCloudFirestore(position: Int, hour: String) {
        viewModelScope.launch {
            val daysAvailableInCalendar = cloudDB.collection("MAIPU")
                .document("2")
                .collection("CALENDARIO")
                .document(position.toString())

            //addSnapshotListener to that exactly root in the Cloud Firestore
            daysAvailableInCalendar.addSnapshotListener { snapshot, e ->

                if (e != null) {
                    Log.w("Launched", "Listen failed.", e)
                    return@addSnapshotListener
                }

                if (snapshot != null && snapshot.exists()) {
                    Log.d("Launched", "Current data: ${snapshot.data}")
                } else {
                    Log.d("Launched", "Current data: null")
                }
            }
        }
    }
}
