package com.example.android.onematchproject.ui.profile

import androidx.lifecycle.ViewModel
import com.example.android.onematchproject.utils.CommonVariables.firebaseAuth

class ProfileViewModel : ViewModel() {

    val userName = if(firebaseAuth.currentUser != null){
        "Welcome ${firebaseAuth.currentUser!!.displayName}"
    } else{
        "Welcome"
    }

}