package com.example.android.onematchproject.data.dataclass.dbo

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "fields")
data class FieldDBO(
    @PrimaryKey
    val entry_id: Int,

    val field_name: String,

    val field_address: String,

    val field_geopoint_latitude: Double,

    val field_geopoint_longitude: Double
)