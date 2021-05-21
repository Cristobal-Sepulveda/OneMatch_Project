package com.example.android.onematchproject.data.local

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.android.onematchproject.data.dbo.FieldDBO

@Dao
interface FieldDao {

    /**
     * @return all Fields in the DB.
     */

    @Query("SELECT * FROM fields")
    fun getFields(): List<FieldDBO>

    /**
     * Insert a FieldDBO in the database. If the FieldDBO already exists, replace it.
     *
     * @param fieldDBO the reminder to be inserted.
     */
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun saveFieldDBO(fieldDBO: FieldDBO)

    /**
     * Delete all fieldDBO's.
     */
    @Query("DELETE FROM fields")
    fun deleteAllFields()
}