package com.example.android.onematchproject.data

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.android.onematchproject.data.local.MatchDBO

/**
 * The Room Database that contains the reminders table.
 */
@Database(entities = [MatchDBO::class], version = 1, exportSchema = false)
abstract class MatchesDatabase : RoomDatabase() {
    abstract fun matchesDao(): MatchesDao
}