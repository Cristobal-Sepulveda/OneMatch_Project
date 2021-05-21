package com.example.android.onematchproject.data.dbo

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.firebase.firestore.GeoPoint

@Entity(tableName = "fields")
data class FieldDBO(
    @PrimaryKey
    val entry_id: Int,

    val field_name: String,

    val field_address: String,

    val field_geopoint: GeoPoint
)