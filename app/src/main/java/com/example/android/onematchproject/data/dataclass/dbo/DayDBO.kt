package com.example.android.onematchproject.data.dataclass.dbo

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "CALENDAR_DAY")
data class DayDBO(
    @PrimaryKey
    val dayPosition_inListr: Int,

    val fecha: String,

    val five_to_six: Array<String>,

    val six_to_seven: Array<String>,

    val seven_to_eight: Array<String>,

    val eight_to_nine: Array<String>,

    val nine_to_ten: Array<String>,

)
