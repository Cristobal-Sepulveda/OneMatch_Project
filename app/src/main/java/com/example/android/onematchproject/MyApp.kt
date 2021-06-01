package com.example.android.onematchproject

import android.app.Application
import android.app.NotificationManager
import androidx.core.content.ContextCompat
import com.example.android.onematchproject.data.AppDataSource
import com.example.android.onematchproject.data.AppRepository
import com.example.android.onematchproject.ui.map.MapViewModel
import com.example.android.onematchproject.ui.profile.ProfileViewModel
import com.example.android.onematchproject.ui.singleField.SingleFieldViewModel
import org.koin.dsl.module
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class MyApp : Application() {
    override fun onCreate() {
        super.onCreate()

        /**
         * using Koin Library as a service locator
         */
        val myModule = module {

            //Declare singleton definitions to be later injected using by inject()
            single {
                ProfileViewModel(
                    get(),
                    get() as AppDataSource
                )
            }
            single{
                MapViewModel(
                    get(),
                    get() as AppDataSource
                )
            }
            single{
                SingleFieldViewModel(
                    get(),
                    get() as AppDataSource
                )
            }
            single{ AppRepository() as AppDataSource}

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
