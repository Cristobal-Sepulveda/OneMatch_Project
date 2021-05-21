package com.example.android.onematchproject.ui.profile

import android.app.Application
import androidx.lifecycle.MutableLiveData
import com.example.android.onematchproject.base.BaseViewModel
import com.example.android.onematchproject.data.local.AppDataSource
import com.google.firebase.firestore.GeoPoint

class ProfileViewModel(val app: Application, val dataSource: AppDataSource,
                       val ListOfFields: ArrayList<GeoPoint>, ) : BaseViewModel(app) {

    val selectedMainPosition = MutableLiveData<String>()
    val selectedSecondaryPosition = MutableLiveData<String>()

}