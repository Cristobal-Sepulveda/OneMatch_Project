package com.example.android.onematchproject.utils

import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.firestore.FirebaseFirestore

object CommonVariables {
    val firebaseAuth = FirebaseAuth.getInstance()
    const val TAG = "AuthenticationActivity"
    const val SIGN_IN_RESULT_CODE = 1001
    const val REQUEST_TURN_DEVICE_LOCATION_ON = 29
    enum class ProviderType{
        BASIC,
        GOOGLE
    }
}