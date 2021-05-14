package com.example.android.onematchproject.data.local

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.android.onematchproject.data.dbo.MatchDBO
import com.example.android.onematchproject.data.dbo.UserDBO

/**
 * The Room Database that contains the reminders table.
 */
@Database(entities = [MatchDBO::class, UserDBO::class], version = 1, exportSchema = false)
abstract class AppDatabase : RoomDatabase() {
    abstract fun matchesDao(): MatchesDao
    abstract fun userDao(): UserDao
}