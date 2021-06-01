package com.example.android.onematchproject.data.app_database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.android.onematchproject.data.DO.entities.FIELD_DBO_ENTITY
import com.example.android.onematchproject.data.daos.FieldDao


/**
 * Here is the instance of the APP_DATABASE and the method that create the DB when the user start
 * the app.
 */
@Database(entities = [FIELD_DBO_ENTITY::class], version = 1, exportSchema = false)
abstract class DATABASE: RoomDatabase() {
    abstract val fieldDao: FieldDao
}

private lateinit var INSTANCE: DATABASE

fun getDatabase(context: Context): DATABASE {
    synchronized(DATABASE::class.java) {
        if (!::INSTANCE.isInitialized) {
            INSTANCE = Room.databaseBuilder(context.applicationContext,
                DATABASE::class.java,
                "database").build()
        }
    }
    return INSTANCE
}