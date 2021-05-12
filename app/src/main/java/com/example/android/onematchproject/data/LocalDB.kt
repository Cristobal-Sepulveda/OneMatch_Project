package com.example.android.onematchproject.data

import android.content.Context
import androidx.room.Room


/**
 * Singleton class that is used to create a reminder db
 */
object LocalDB {
    /**
     * static method that creates a reminder class and returns the DAO of the reminder
     */
    fun createMatchesDao(context: Context): MatchesDao {
        return Room.databaseBuilder(
            context.applicationContext,
            MatchesDatabase::class.java, "matches_database.db"
        ).build().matchesDao()
    }

}