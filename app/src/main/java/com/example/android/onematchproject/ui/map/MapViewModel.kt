package com.example.android.onematchproject.ui.map

import android.app.Application
import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.example.android.onematchproject.base.BaseViewModel
import com.example.android.onematchproject.data.AppDataSource
import com.example.android.onematchproject.data.network.CloudFirestoreService
import kotlinx.coroutines.launch


class MapViewModel(val app: Application, val dataSource: AppDataSource) : BaseViewModel(app) {

    private val _listHaveData = MutableLiveData(false)
    val listHaveData: LiveData<Boolean>
        get() = _listHaveData

    private val _listOfFields = MutableLiveData<String>()
    val listOfFields: LiveData<String>
        get() = _listOfFields

    fun onDrawComplete(){
        _listHaveData.value = false
    }
    init{
        viewModelScope.launch{
            _listOfFields.value= CloudFirestoreService.getFields_fromCloudFirestore("Maipu")
        }
    }
}
