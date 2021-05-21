package com.example.android.onematchproject.ui.home

import androidx.lifecycle.ViewModel
import com.example.android.onematchproject.utils.CommonVariablesToUseinDifferentClasses.firebaseAuth

class HomeViewModel : ViewModel() {

    val userName = if(firebaseAuth.currentUser != null){
        "Welcome ${firebaseAuth.currentUser!!.displayName}"
    } else{
        "Welcome"
    }

}