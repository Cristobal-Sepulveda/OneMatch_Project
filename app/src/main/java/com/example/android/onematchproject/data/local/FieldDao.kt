package com.example.android.onematchproject.data.local

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.android.onematchproject.data.dbo.FieldDBO
import com.example.android.onematchproject.data.dto.FieldDTO

@Dao
interface FieldDao {

    /**
     * @return all Fields in the DB.
     */

    @Query("SELECT * FROM fields")
    fun gettingFieldsFromDatabase(): List<FieldDBO>

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