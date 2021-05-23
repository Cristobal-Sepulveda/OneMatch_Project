package com.example.android.onematchproject.data.local

import android.content.Context
import androidx.room.Room


/**
 * Singleton class that is used to create the app db
 */
object LocalDB {
    /**
     * static method that creates the app class and returns the DAO's
     */
    fun createAppDB(context: Context): AppDatabase {
        return Room.databaseBuilder(
            context.applicationContext,
            AppDatabase::class.java, "app_database.db"
        ).build()
    }

}