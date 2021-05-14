package com.example.android.onematchproject.data.local

import com.example.android.onematchproject.data.dbo.MatchDBO
import com.example.android.onematchproject.data.dbo.UserDBO
import com.example.android.onematchproject.utils.Result

interface AppDataSource {
    suspend fun getMatches(): Result<List<MatchDBO>>
    suspend fun getMatch(id: Long): Result<MatchDBO>
    suspend fun saveMatch(match: MatchDBO)
    suspend fun deleteAllMatches()
    suspend fun getUser(id: Long): Result<UserDBO>
    suspend fun saveUser(user: UserDBO)
    suspend fun deleteUser()
}
