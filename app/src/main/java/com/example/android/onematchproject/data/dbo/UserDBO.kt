package com.example.android.onematchproject.data.dbo

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "user")
data class UserDBO(
    @PrimaryKey(autoGenerate = true)
    val entry_id: Long = 0L,
    val mainPosition: String,
    val secondaryPosition: String
)