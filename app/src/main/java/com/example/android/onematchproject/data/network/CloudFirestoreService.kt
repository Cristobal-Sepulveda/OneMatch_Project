package com.example.android.onematchproject.data.network

import android.util.Log
import android.widget.Toast
import com.example.android.onematchproject.data.DO.entities.FIELD_DBO_ENTITY
import com.example.android.onematchproject.utils.Result
import com.google.firebase.firestore.FirebaseFirestore
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

/**
 * This object is to interact with the Cloud Firestore from FireBase
 */
object CloudFirestoreService {
    suspend fun getFields_fromCloudFirestore(comuna: String): String {
        val cloudDB = FirebaseFirestore.getInstance()

        var a = "1"
        GlobalScope.launch(Dispatchers.IO) {
            var task = cloudDB.collection("MAIPU")
                .whereEqualTo("field_info", comuna).get()
            withContext(Dispatchers.Main){
                    a= task.result!!.documents[0].toString()
            }
        }
        toObject
        return a
        /*task.addOnCompleteListener {
            if(it.isSuccessful){
                return
            }else{

            }
        }
        return try {
            Log.i("Launched_listHaveData", "try")
            cloudDB.collection("MAIPU")
                .whereEqualTo("field_info", comuna)
                .get()

            } catch (e: Exception) {
                Log.i("Launched_listHaveData", "catch")
                return e.localizedMessage!!
            }
    }*/}
}
