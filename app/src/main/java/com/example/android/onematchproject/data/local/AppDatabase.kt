package com.example.android.onematchproject.data.local

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.android.onematchproject.data.dao.DayDao
import com.example.android.onematchproject.data.dao.FieldDao
import com.example.android.onematchproject.data.dao.MatchesDao
import com.example.android.onematchproject.data.dao.UserDao
import com.example.android.onematchproject.data.dataclass.dbo.FieldDBO
import com.example.android.onematchproject.data.dataclass.dbo.MatchDBO
import com.example.android.onematchproject.data.dataclass.dbo.UserDBO

/**
 * The Room Database that contains the reminders table.
 */
@Database(entities = [MatchDBO::class, UserDBO::class, FieldDBO::class], version = 1, exportSchema = false)
abstract class AppDatabase : RoomDatabase() {
    abstract fun matchesDao(): MatchesDao
    abstract fun userDao(): UserDao
    abstract fun fieldDao(): FieldDao
    abstract fun dayDao(): DayDao
}