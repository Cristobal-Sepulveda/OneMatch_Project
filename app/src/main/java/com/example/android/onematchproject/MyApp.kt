package com.example.android.onematchproject

import android.app.Application
import android.app.NotificationManager
import androidx.core.content.ContextCompat
import com.example.android.onematchproject.data.AppRepository
import com.example.android.onematchproject.data.local.AppDataSource
import com.example.android.onematchproject.data.local.LocalDB
import com.example.android.onematchproject.ui.profile.ProfileViewModel
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.firestore.GeoPoint
import org.koin.dsl.module
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class MyApp : Application() {

    val cloudDB = FirebaseFirestore.getInstance()
    val arrayWithFields: ArrayList<GeoPoint> = ArrayList()

    override fun onCreate() {
        super.onCreate()

        /**
             * This method is used to get all the field coordinate's and mark them on googleMaps.
             *
             * This is made in the activity because if the user wants to navigate on the fragment container, we
             * never will lose this data, and the consults to the database are less
             * - we use this data in MapFragment, markingFields() method -
             * */
        fun gettingFieldsfromCloudFirestore(): ArrayList<GeoPoint> {
            val comuna = cloudDB.collection("MAIPU").get()
            comuna.addOnSuccessListener {
                var i = 0
                while(i< it.size()){
                    val singleFieldInfo = it.documents[i].get("field_info") as ArrayList<*>
                    val fieldGeoPoint = singleFieldInfo[2] as GeoPoint
                    arrayWithFields[i] = fieldGeoPoint
                    i++
                }
            }
            comuna.addOnFailureListener {
            }
            return arrayWithFields
        }

        val gettingTheList = gettingFieldsfromCloudFirestore()
        val ListOfFields = gettingTheList

        /**
         * using Koin Library as a service locator
         */
        val myModule = module {

            //Declare singleton definitions to be later injected using by inject()
            single {
                ProfileViewModel(
                    get(),
                    get() as AppDataSource,
                    ListOfFields
                )
            }
            single { LocalDB.createAppDB(this@MyApp).matchesDao() }
            single { LocalDB.createAppDB(this@MyApp).userDao() }
            single { AppRepository(get(), get()) }
            single {ListOfFields}
        }

        startKoin {
            androidContext(this@MyApp)
            modules(listOf(myModule))
        }

        val notificationManager = ContextCompat.getSystemService(
                applicationContext,
                NotificationManager::class.java
        ) as NotificationManager

    }
}
