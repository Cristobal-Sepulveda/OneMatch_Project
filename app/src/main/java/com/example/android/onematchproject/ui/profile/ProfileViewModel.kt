package com.example.android.onematchproject.ui.profile

import android.app.Application
import androidx.lifecycle.MutableLiveData
import com.example.android.onematchproject.base.BaseViewModel
import com.example.android.onematchproject.data.local.AppDataSource

class ProfileViewModel(
    val app: Application, val dataSource: AppDataSource, ) : BaseViewModel(app) {

    val selectedMainPosition = MutableLiveData<String>()
    val selectedSecondaryPosition = MutableLiveData<String>()
}