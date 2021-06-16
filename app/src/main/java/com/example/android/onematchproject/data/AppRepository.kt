package com.example.android.onematchproject.data

import android.content.Context
import android.graphics.Bitmap
import android.util.Log
import android.widget.Toast
import com.example.android.onematchproject.data.DO.entities.FIELD_DBO_ENTITY
import com.example.android.onematchproject.data.daos.FieldDao
import com.example.android.onematchproject.utils.EspressoIdlingResource.wrapEspressoIdlingResource
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.firestore.GeoPoint
import kotlinx.coroutines.*
import kotlinx.coroutines.flow.callbackFlow

class AppRepository(private val fieldDao: FieldDao,
                    private val context: Context,
                    private val ioDispatcher: CoroutineDispatcher = Dispatchers.IO): AppDataSource {

}
