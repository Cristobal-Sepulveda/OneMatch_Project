package com.example.android.onematchproject

import android.app.Application
import android.app.NotificationManager
import androidx.core.content.ContextCompat
import com.example.android.onematchproject.data.LocalDB
import com.google.firebase.auth.FirebaseAuth
import org.koin.dsl.module
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class MyApp : Application() {

    override fun onCreate() {
        super.onCreate()

        val myModule = module {
            single { LocalDB.createMatchesDao(this@MyApp) }
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
