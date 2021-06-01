package com.example.android.onematchproject.data

interface AppDataSource {

    /**
     * Methods to interact with the local database
     * */
/*    suspend fun getMatches(): Result<List<MatchDBO>>
    suspend fun getMatch(id: Long): Result<MatchDBO>
    suspend fun saveMatch(match: MatchDBO)
    suspend fun deleteAllMatches()
    suspend fun getUser(id: Long): Result<UserDBO>
    suspend fun saveUser(user: UserDBO)*/
    suspend fun deleteUser()
    suspend fun getFieldsOnComuna_from_CloudFirestore(comuna: String)
/*  suspend fun savingFieldToLocalDatabase(fieldDBO: FieldDBO)
    suspend fun gettingFieldsFromDatabase(): List<FieldDBO>
    suspend fun savingASingleDayOfTheCalendarFromCloudFirestore(dayDBO: DayDBO)*/
}