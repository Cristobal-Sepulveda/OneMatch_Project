package com.example.android.onematchproject.data.DO.entities

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.firebase.firestore.GeoPoint
import java.util.*

/**
 * Immutable model class & attributes for a Field. In order to compile with Room
 *
 * @param id            id of the field
 * @param name          name of the field
 * @param address       address of the field
 * @param location      location GeoPoint of the field

 */

@Entity(tableName= "DB_FIELDS")
data class FIELD_DBO_ENTITY(
    val name: String,
    val address: String,
    val latitude: Double,
    val longitude: Double,
    @PrimaryKey val uid: String = UUID.randomUUID().toString(),
    )