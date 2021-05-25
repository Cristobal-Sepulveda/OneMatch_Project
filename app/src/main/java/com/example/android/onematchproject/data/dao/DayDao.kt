package com.example.android.onematchproject.data.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.android.onematchproject.data.dataclass.dbo.DayDBO
import com.example.android.onematchproject.data.dataclass.dbo.FieldDBO

@Dao
interface DayDao {

    /**
     * @return all DAYS in the DB.
     */

    @Query("SELECT * FROM CALENDAR_DAY")
    fun gettingAvailableDaysFromDatabase(): List<DayDBO>

    /**
     * Insert a DayDBO in the database. If the DayDBO already exists, replace it.
     *
     * @param dayDBO the DayDBO to be inserted.
     */
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun saveDayDBO(dayDBO: DayDBO)

    /**
     * Delete all dayDBO's.
     */
    @Query("DELETE FROM CALENDAR_DAY")
    fun deleteAllDays()
}