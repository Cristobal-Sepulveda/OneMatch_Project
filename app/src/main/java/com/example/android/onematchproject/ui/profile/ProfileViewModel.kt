package com.example.android.onematchproject.ui.profile

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
import com.example.android.onematchproject.utils.Result
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.firestore.GeoPoint
import kotlinx.coroutines.launch

class ProfileViewModel(
    val app: Application, val dataSource: AppDataSource, ) : BaseViewModel(app) {

    val selectedMainPosition = MutableLiveData<String>()
    val selectedSecondaryPosition = MutableLiveData<String>()
}