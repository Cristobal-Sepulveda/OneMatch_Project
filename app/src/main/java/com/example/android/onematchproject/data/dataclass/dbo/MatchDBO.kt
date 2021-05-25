package com.example.android.onematchproject.data.dataclass.dbo

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "matches")
data class MatchDBO(
    @PrimaryKey(autoGenerate = true)
    val entry_id: Long = 0L,

    val fieldName: String,

    val registeredPlayers: Int
    )