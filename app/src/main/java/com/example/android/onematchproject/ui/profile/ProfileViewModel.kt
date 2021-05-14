package com.example.android.onematchproject.ui.profile

import android.app.Application
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.android.onematchproject.base.BaseViewModel
import com.example.android.onematchproject.data.local.AppDataSource
import com.example.android.onematchproject.utils.CommonVariables.firebaseAuth

class ProfileViewModel(val app: Application, val dataSource: AppDataSource) : BaseViewModel(app) {

    val selectedMainPosition = MutableLiveData<String>()
    val selectedSecondaryPosition = MutableLiveData<String>()

}