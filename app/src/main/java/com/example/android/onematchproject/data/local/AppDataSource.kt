package com.example.android.onematchproject.data.local

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.android.onematchproject.data.dbo.FieldDBO
import com.example.android.onematchproject.data.dbo.MatchDBO
import com.example.android.onematchproject.data.dbo.UserDBO
import com.example.android.onematchproject.data.dto.FieldDTO
import com.example.android.onematchproject.utils.Result

interface AppDataSource {

    /**
     * Methods to interact with the local database
     * */
    suspend fun getMatches(): Result<List<MatchDBO>>
    suspend fun getMatch(id: Long): Result<MatchDBO>
    suspend fun saveMatch(match: MatchDBO)
    suspend fun deleteAllMatches()
    suspend fun getUser(id: Long): Result<UserDBO>
    suspend fun saveUser(user: UserDBO)
    suspend fun deleteUser()
    suspend fun savingFieldToLocalDatabase(fieldDBO: FieldDBO)
    suspend fun gettingFieldsFromDatabase(): List<FieldDBO>
}
