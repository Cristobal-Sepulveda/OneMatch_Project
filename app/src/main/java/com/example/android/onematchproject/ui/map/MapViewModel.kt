package com.example.android.onematchproject.ui.map

import android.app.Application
import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.example.android.onematchproject.base.BaseViewModel
import com.example.android.onematchproject.data.AppDataSource
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking


class MapViewModel( val app: Application, val dataSource: AppDataSource) : BaseViewModel(app) {

    private val _listHaveData = MutableLiveData(false)
    val listHaveData: LiveData<Boolean>
        get() = _listHaveData

    private val _listOfFields = MutableLiveData<ArrayList<Any>>()
    val listOfFields: LiveData<ArrayList<Any>>
        get() = _listOfFields

    fun gettingListOfFields_FromCloudFirestore(comuna: String) {
        _listOfFields.value?.clear()
        viewModelScope.launch {
            Log.i("Launched", "gettingListOfFields_FromCloudFirestore")
            val newListValue = dataSource.getFieldsOnComuna_from_CloudFirestore(comuna)
            _listOfFields.value = newListValue
        }
    }

    fun onDrawComplete(){
        _listHaveData.value = false
    }
}
