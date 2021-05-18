package com.example.android.onematchproject.ui.profile

import android.app.Application
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.android.onematchproject.R
import com.example.android.onematchproject.base.BaseViewModel
import com.example.android.onematchproject.data.local.AppDataSource
import com.example.android.onematchproject.utils.CommonVariables.firebaseAuth
import com.google.android.gms.maps.model.BitmapDescriptor
import com.google.android.gms.maps.model.BitmapDescriptorFactory
import com.google.firebase.firestore.FirebaseFirestore
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.launch

class ProfileViewModel(val app: Application, val dataSource: AppDataSource) : BaseViewModel(app) {

    val selectedMainPosition = MutableLiveData<String>()
    val selectedSecondaryPosition = MutableLiveData<String>()

}