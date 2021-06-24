package com.example.android.onematchproject.data

import com.example.android.onematchproject.data.data_objects.DBO.FIELD_DBO

interface AppDataSource {

    /**
     * Methods to interact with the local database
     * */
    suspend fun savingFieldToLocalDatabase(field: FIELD_DBO)
    suspend fun gettingFieldsFromDatabase(): List<FIELD_DBO>
    suspend fun deletingSavedFieldsInLocalDatabase()
}