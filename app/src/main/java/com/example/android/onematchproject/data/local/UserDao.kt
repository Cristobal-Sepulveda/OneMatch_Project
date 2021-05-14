package com.example.android.onematchproject.data.local

import androidx.room.*
import com.example.android.onematchproject.data.dbo.UserDBO

@Dao
interface UserDao {

    @Query("SELECT * FROM user")
    fun getUser(): UserDBO

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun saveUserDBO(userDBO: UserDBO)

    @Query("DELETE FROM user")
    fun deleteUser()
}