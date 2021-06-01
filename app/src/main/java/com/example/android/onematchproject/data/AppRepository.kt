package com.example.android.onematchproject.data

import android.util.Log
import com.example.android.onematchproject.utils.EspressoIdlingResource.wrapEspressoIdlingResource
import com.google.firebase.firestore.FirebaseFirestore

class AppRepository(): AppDataSource{

    val cloudDB = FirebaseFirestore.getInstance()
    val listOfFields = ArrayList<Any>()

    override suspend fun deleteUser() {
        TODO("Not yet implemented")
    }

    /**
     * Getting Methods
     */
    override suspend fun getFieldsOnComuna_from_CloudFirestore(comuna: String){
        wrapEspressoIdlingResource {
            val fieldsInThatComuna = cloudDB.collection(comuna)
                .whereEqualTo("comuna", comuna).add

            val postListener = object : ValueEvent {
                override fun onDataChange(dataSnapshot: DataSnapshot) {
                    // Get Post object and use the values to update the UI
                    val post = dataSnapshot.getValue<Post>()
                    // ...
                }

                override fun onCancelled(databaseError: DatabaseError) {
                    // Getting Post failed, log a message
                    Log.w(TAG, "loadPost:onCancelled", databaseError.toException())
                }
            }
            postReference.addValueEventListener(postListener)



            fieldsInThatComuna.addOnSuccessListener {
                    // Write was successful!
                    // ...
                }
                .addOnFailureListener {
                    // Write failed
                    // ...
                }
            fieldsList.addSnapshotListener { snapshot, e ->
                if (e != null) {
                    Log.w("Launched gettingFields", "Listen failed.", e)
                    return@addSnapshotListener
                }
            }

            Log.d("Launched gettingFields", "fields_on_Maipu: ${listOfFields}")
        }
    }
}
