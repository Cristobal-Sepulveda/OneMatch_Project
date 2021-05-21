package com.example.android.onematchproject.data.dto

import androidx.room.Entity
import com.example.android.onematchproject.data.dbo.FieldDBO
import com.google.firebase.firestore.GeoPoint

@Entity
data class FieldDTO(
    val entry_id: Int,

    val field_name: String,

    val field_address: String,

    val field_geopoint: GeoPoint
)

fun FieldDTO.asDataBaseModel(fieldDTO: FieldDTO): FieldDBO {
    return FieldDBO(
        entry_id = fieldDTO.entry_id,
        field_name = fieldDTO.field_name,
        field_address = fieldDTO.field_address,
        field_geopoint = fieldDTO.field_geopoint
    )
}