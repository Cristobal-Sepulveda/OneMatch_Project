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
import com.example.android.onematchproject.utils.CommonVariablesToUseinDifferentClasses
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

    private val _status = MutableLiveData<CloudDownloadComplete>(CloudDownloadComplete.LOADING)
    val status: LiveData<CloudDownloadComplete>
        get()= _status

    init{
        listOfFields = CommonVariablesToUseinDifferentClasses.canchas_maipu
    }
    fun onDrawComplete() {
        _listHaveData.value = false
    }
}
