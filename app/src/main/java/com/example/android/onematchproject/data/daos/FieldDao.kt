package com.example.android.onematchproject.data.daos

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.android.onematchproject.data.DO.entities.FIELD_DBO_ENTITY

@Dao
interface FieldDao {

    /**
     * Insert a FIELD in the APP_DATABASE. If the FIELD already exists, replace it.
     *
     * @param field is the FIELD to be inserted.
     */
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun saveField(field: FIELD_DBO_ENTITY)

    /**
     * @param field_id the id of the FIELD
     * @return the field object with the field_id
     */
    @Query("select * from DB_FIELDS where uid = :field_id")
    fun getField(field_id: String): FIELD_DBO_ENTITY

    /**
     * @return all fields.
     */
    @Query("select * from DB_FIELDS")
    fun getFields(): List<FIELD_DBO_ENTITY>

    /**
     * Delete all fields.
     */
    @Query("delete from DB_FIELDS")
    fun deleteFields()
}