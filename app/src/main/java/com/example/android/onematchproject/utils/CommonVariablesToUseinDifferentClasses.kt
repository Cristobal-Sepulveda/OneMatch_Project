package com.example.android.onematchproject.utils

import com.example.android.onematchproject.data.data_objects.DBO.FIELD_DBO
import com.google.android.gms.tasks.Task
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.firestore.QuerySnapshot

object CommonVariablesToUseinDifferentClasses {
    val firebaseAuth = FirebaseAuth.getInstance()
    const val TAG = "AuthenticationActivity"
    const val SIGN_IN_RESULT_CODE = 1001
    const val REQUEST_TURN_DEVICE_LOCATION_ON = 29
    enum class ProviderType{
        BASIC,
        GOOGLE
    }
    val canchas_maipu = listOf(
        /** 1*/
        FIELD_DBO(
            "Multicancha Hermanos Carrera",
            "Hermanos Carrera con Rengifo",
            "Maipú",
            -33.51867788290727,
            -70.76054753427009
        ),
        /** 2*/
        FIELD_DBO(
            "Multicancha Milano",
            "Los Querubines con Milano",
            "Maipú",
            -33.52481055242347,
            -70.76407128486264
        ),
        /** 3*/
        FIELD_DBO(
            "Multicancha Los Tehuelches",
            "Los Tehuelches 858",
            "Maipú",
            -33.52049110273201,
            -70.77369057936286
        ),
        /** 4*/
        FIELD_DBO(
            "Multicancha Morelli",
            "Morelli con San José",
            "Maipú",
            -33.51600419437784,
            -70.77400346535848
        ),
        /** 5*/
        FIELD_DBO(
            "Multicancha El Cid",
            "El Cid con Campanario",
            "Maipú",
            -33.51933367958603,
            -70.77223430199489
        ),
        /** 6*/
        FIELD_DBO(
            "Multicancha Huascar",
            "Las Tinajas con Huascar",
            "Maipú",
            -33.51473660947719,
            -70.76829165000736
        ),
        /** 7*/
        FIELD_DBO(
            "Multicancha La Vendimia",
            "La Vendimia con Los Artilleros",
            "Maipú",
            -33.522987849773365,
            -70.76978568679647
        ),
        /** 8*/
        FIELD_DBO(
            "Multicancha Villa Rapa Nui",
            "Los Imperiales con Australia",
            "Maipú",
            -33.517312956648425,
            -70.7735621763455
        ),
        /** 9*/
        FIELD_DBO(
            "Multicancha Los Faisanes",
            "Los Faisanes 911",
            "Maipú",
            -33.52059680962636,
            -70.77688116646948
        ),
        /** 10*/
        FIELD_DBO(
            "Multicancha Ana Maria",
            "Ana Maria 1860",
            "Maipú",
            -33.5232417635501,
            -70.7761913650761
        ),
        FIELD_DBO(
            "Multicancha Hermanos Carrera",
            "Hermanos Carrera con Rengifo",
            "Maipú",
            -33.51867788290727,
            -70.76054753427009
        ),
        FIELD_DBO(
            "Multicancha Hermanos Carrera",
            "Hermanos Carrera con Rengifo",
            "Maipú",
            -33.51867788290727,
            -70.76054753427009
        ),
        FIELD_DBO(
            "Multicancha Hermanos Carrera",
            "Hermanos Carrera con Rengifo",
            "Maipú",
            -33.51867788290727,
            -70.76054753427009
        ),
        FIELD_DBO(
            "Multicancha Hermanos Carrera",
            "Hermanos Carrera con Rengifo",
            "Maipú",
            -33.51867788290727,
            -70.76054753427009
        ),
        FIELD_DBO(
            "Multicancha Hermanos Carrera",
            "Hermanos Carrera con Rengifo",
            "Maipú",
            -33.51867788290727,
            -70.76054753427009
        ),
        FIELD_DBO(
            "Multicancha Hermanos Carrera",
            "Hermanos Carrera con Rengifo",
            "Maipú",
            -33.51867788290727,
            -70.76054753427009
        ),
        FIELD_DBO(
            "Multicancha Hermanos Carrera",
            "Hermanos Carrera con Rengifo",
            "Maipú",
            -33.51867788290727,
            -70.76054753427009
        ),
        FIELD_DBO(
            "Multicancha Hermanos Carrera",
            "Hermanos Carrera con Rengifo",
            "Maipú",
            -33.51867788290727,
            -70.76054753427009
        ),
        FIELD_DBO(
            "Multicancha Hermanos Carrera",
            "Hermanos Carrera con Rengifo",
            "Maipú",
            -33.51867788290727,
            -70.76054753427009
        ),
        FIELD_DBO(
            "Multicancha Hermanos Carrera",
            "Hermanos Carrera con Rengifo",
            "Maipú",
            -33.51867788290727,
            -70.76054753427009
        ),
        FIELD_DBO(
            "Multicancha Hermanos Carrera",
            "Hermanos Carrera con Rengifo",
            "Maipú",
            -33.51867788290727,
            -70.76054753427009
        ),
        FIELD_DBO(
            "Multicancha Hermanos Carrera",
            "Hermanos Carrera con Rengifo",
            "Maipú",
            -33.51867788290727,
            -70.76054753427009
        ),
        FIELD_DBO(
            "Multicancha Hermanos Carrera",
            "Hermanos Carrera con Rengifo",
            "Maipú",
            -33.51867788290727,
            -70.76054753427009
        ),
        FIELD_DBO(
            "Multicancha Hermanos Carrera",
            "Hermanos Carrera con Rengifo",
            "Maipú",
            -33.51867788290727,
            -70.76054753427009
        ),
        FIELD_DBO(
            "Multicancha Hermanos Carrera",
            "Hermanos Carrera con Rengifo",
            "Maipú",
            -33.51867788290727,
            -70.76054753427009
        ),
        FIELD_DBO(
            "Multicancha Hermanos Carrera",
            "Hermanos Carrera con Rengifo",
            "Maipú",
            -33.51867788290727,
            -70.76054753427009
        ),
        FIELD_DBO(
            "Multicancha Hermanos Carrera",
            "Hermanos Carrera con Rengifo",
            "Maipú",
            -33.51867788290727,
            -70.76054753427009
        ),
        FIELD_DBO(
            "Multicancha Hermanos Carrera",
            "Hermanos Carrera con Rengifo",
            "Maipú",
            -33.51867788290727,
            -70.76054753427009
        ),
        FIELD_DBO(
            "Multicancha Hermanos Carrera",
            "Hermanos Carrera con Rengifo",
            "Maipú",
            -33.51867788290727,
            -70.76054753427009
        ),
        FIELD_DBO(
            "Multicancha Hermanos Carrera",
            "Hermanos Carrera con Rengifo",
            "Maipú",
            -33.51867788290727,
            -70.76054753427009
        ),
        FIELD_DBO(
            "Multicancha Hermanos Carrera",
            "Hermanos Carrera con Rengifo",
            "Maipú",
            -33.51867788290727,
            -70.76054753427009
        ),
        FIELD_DBO(
            "Multicancha Hermanos Carrera",
            "Hermanos Carrera con Rengifo",
            "Maipú",
            -33.51867788290727,
            -70.76054753427009
        ),
        FIELD_DBO(
            "Multicancha Hermanos Carrera",
            "Hermanos Carrera con Rengifo",
            "Maipú",
            -33.51867788290727,
            -70.76054753427009
        ),
        FIELD_DBO(
            "Multicancha Hermanos Carrera",
            "Hermanos Carrera con Rengifo",
            "Maipú",
            -33.51867788290727,
            -70.76054753427009
        ),
        FIELD_DBO(
            "Multicancha Hermanos Carrera",
            "Hermanos Carrera con Rengifo",
            "Maipú",
            -33.51867788290727,
            -70.76054753427009
        ),
        FIELD_DBO(
            "Multicancha Hermanos Carrera",
            "Hermanos Carrera con Rengifo",
            "Maipú",
            -33.51867788290727,
            -70.76054753427009
        ),
        FIELD_DBO(
            "Multicancha Hermanos Carrera",
            "Hermanos Carrera con Rengifo",
            "Maipú",
            -33.51867788290727,
            -70.76054753427009
        ),
        FIELD_DBO(
            "Multicancha Hermanos Carrera",
            "Hermanos Carrera con Rengifo",
            "Maipú",
            -33.51867788290727,
            -70.76054753427009
        ),
        FIELD_DBO(
            "Multicancha Hermanos Carrera",
            "Hermanos Carrera con Rengifo",
            "Maipú",
            -33.51867788290727,
            -70.76054753427009
        ),
        FIELD_DBO(
            "Multicancha Hermanos Carrera",
            "Hermanos Carrera con Rengifo",
            "Maipú",
            -33.51867788290727,
            -70.76054753427009
        ),
        FIELD_DBO(
            "Multicancha Hermanos Carrera",
            "Hermanos Carrera con Rengifo",
            "Maipú",
            -33.51867788290727,
            -70.76054753427009
        ),
        FIELD_DBO(
            "Multicancha Hermanos Carrera",
            "Hermanos Carrera con Rengifo",
            "Maipú",
            -33.51867788290727,
            -70.76054753427009
        ),
        FIELD_DBO(
            "Multicancha Hermanos Carrera",
            "Hermanos Carrera con Rengifo",
            "Maipú",
            -33.51867788290727,
            -70.76054753427009
        ),
        FIELD_DBO(
            "Multicancha Hermanos Carrera",
            "Hermanos Carrera con Rengifo",
            "Maipú",
            -33.51867788290727,
            -70.76054753427009
        ),
        FIELD_DBO(
            "Multicancha Hermanos Carrera",
            "Hermanos Carrera con Rengifo",
            "Maipú",
            -33.51867788290727,
            -70.76054753427009
        ),
        FIELD_DBO(
            "Multicancha Hermanos Carrera",
            "Hermanos Carrera con Rengifo",
            "Maipú",
            -33.51867788290727,
            -70.76054753427009
        ),
        FIELD_DBO(
            "Multicancha Hermanos Carrera",
            "Hermanos Carrera con Rengifo",
            "Maipú",
            -33.51867788290727,
            -70.76054753427009
        ),
        FIELD_DBO(
            "Multicancha Hermanos Carrera",
            "Hermanos Carrera con Rengifo",
            "Maipú",
            -33.51867788290727,
            -70.76054753427009
        ),
        FIELD_DBO(
            "Multicancha Hermanos Carrera",
            "Hermanos Carrera con Rengifo",
            "Maipú",
            -33.51867788290727,
            -70.76054753427009
        ),
        FIELD_DBO(
            "Multicancha Hermanos Carrera",
            "Hermanos Carrera con Rengifo",
            "Maipú",
            -33.51867788290727,
            -70.76054753427009
        ),
        FIELD_DBO(
            "Multicancha Hermanos Carrera",
            "Hermanos Carrera con Rengifo",
            "Maipú",
            -33.51867788290727,
            -70.76054753427009
        ),
        FIELD_DBO(
            "Multicancha Hermanos Carrera",
            "Hermanos Carrera con Rengifo",
            "Maipú",
            -33.51867788290727,
            -70.76054753427009
        ),
        FIELD_DBO(
            "Multicancha Hermanos Carrera",
            "Hermanos Carrera con Rengifo",
            "Maipú",
            -33.51867788290727,
            -70.76054753427009
        ),
        FIELD_DBO(
            "Multicancha Hermanos Carrera",
            "Hermanos Carrera con Rengifo",
            "Maipú",
            -33.51867788290727,
            -70.76054753427009
        ),
        FIELD_DBO(
            "Multicancha Hermanos Carrera",
            "Hermanos Carrera con Rengifo",
            "Maipú",
            -33.51867788290727,
            -70.76054753427009
        ),
        FIELD_DBO(
            "Multicancha Hermanos Carrera",
            "Hermanos Carrera con Rengifo",
            "Maipú",
            -33.51867788290727,
            -70.76054753427009
        ),
        FIELD_DBO(
            "Multicancha Hermanos Carrera",
            "Hermanos Carrera con Rengifo",
            "Maipú",
            -33.51867788290727,
            -70.76054753427009
        ),
        FIELD_DBO(
            "Multicancha Hermanos Carrera",
            "Hermanos Carrera con Rengifo",
            "Maipú",
            -33.51867788290727,
            -70.76054753427009
        ),
        FIELD_DBO(
            "Multicancha Hermanos Carrera",
            "Hermanos Carrera con Rengifo",
            "Maipú",
            -33.51867788290727,
            -70.76054753427009
        ),
        FIELD_DBO(
            "Multicancha Hermanos Carrera",
            "Hermanos Carrera con Rengifo",
            "Maipú",
            -33.51867788290727,
            -70.76054753427009
        ),
        FIELD_DBO(
            "Multicancha Hermanos Carrera",
            "Hermanos Carrera con Rengifo",
            "Maipú",
            -33.51867788290727,
            -70.76054753427009
        ),
        FIELD_DBO(
            "Multicancha Hermanos Carrera",
            "Hermanos Carrera con Rengifo",
            "Maipú",
            -33.51867788290727,
            -70.76054753427009
        ),
        FIELD_DBO(
            "Multicancha Hermanos Carrera",
            "Hermanos Carrera con Rengifo",
            "Maipú",
            -33.51867788290727,
            -70.76054753427009
        ),
        FIELD_DBO(
            "Multicancha Hermanos Carrera",
            "Hermanos Carrera con Rengifo",
            "Maipú",
            -33.51867788290727,
            -70.76054753427009
        ),
        FIELD_DBO(
            "Multicancha Hermanos Carrera",
            "Hermanos Carrera con Rengifo",
            "Maipú",
            -33.51867788290727,
            -70.76054753427009
        ),
        FIELD_DBO(
            "Multicancha Hermanos Carrera",
            "Hermanos Carrera con Rengifo",
            "Maipú",
            -33.51867788290727,
            -70.76054753427009
        ),
        FIELD_DBO(
            "Multicancha Hermanos Carrera",
            "Hermanos Carrera con Rengifo",
            "Maipú",
            -33.51867788290727,
            -70.76054753427009
        ),
        FIELD_DBO(
            "Multicancha Hermanos Carrera",
            "Hermanos Carrera con Rengifo",
            "Maipú",
            -33.51867788290727,
            -70.76054753427009
        ),
        FIELD_DBO(
            "Multicancha Hermanos Carrera",
            "Hermanos Carrera con Rengifo",
            "Maipú",
            -33.51867788290727,
            -70.76054753427009
        ),
        FIELD_DBO(
            "Multicancha Hermanos Carrera",
            "Hermanos Carrera con Rengifo",
            "Maipú",
            -33.51867788290727,
            -70.76054753427009
        ),
        FIELD_DBO(
            "Multicancha Hermanos Carrera",
            "Hermanos Carrera con Rengifo",
            "Maipú",
            -33.51867788290727,
            -70.76054753427009
        ),
        FIELD_DBO(
            "Multicancha Hermanos Carrera",
            "Hermanos Carrera con Rengifo",
            "Maipú",
            -33.51867788290727,
            -70.76054753427009
        ),
        FIELD_DBO(
            "Multicancha Hermanos Carrera",
            "Hermanos Carrera con Rengifo",
            "Maipú",
            -33.51867788290727,
            -70.76054753427009
        ),
        FIELD_DBO(
            "Multicancha Hermanos Carrera",
            "Hermanos Carrera con Rengifo",
            "Maipú",
            -33.51867788290727,
            -70.76054753427009
        ),
        FIELD_DBO(
            "Multicancha Hermanos Carrera",
            "Hermanos Carrera con Rengifo",
            "Maipú",
            -33.51867788290727,
            -70.76054753427009
        ),
        FIELD_DBO(
            "Multicancha Hermanos Carrera",
            "Hermanos Carrera con Rengifo",
            "Maipú",
            -33.51867788290727,
            -70.76054753427009
        ),
        FIELD_DBO(
            "Multicancha Hermanos Carrera",
            "Hermanos Carrera con Rengifo",
            "Maipú",
            -33.51867788290727,
            -70.76054753427009
        ),
        FIELD_DBO(
            "Multicancha Hermanos Carrera",
            "Hermanos Carrera con Rengifo",
            "Maipú",
            -33.51867788290727,
            -70.76054753427009
        ),
        FIELD_DBO(
            "Multicancha Hermanos Carrera",
            "Hermanos Carrera con Rengifo",
            "Maipú",
            -33.51867788290727,
            -70.76054753427009
        ),
        FIELD_DBO(
            "Multicancha Hermanos Carrera",
            "Hermanos Carrera con Rengifo",
            "Maipú",
            -33.51867788290727,
            -70.76054753427009
        ),
        FIELD_DBO(
            "Multicancha Hermanos Carrera",
            "Hermanos Carrera con Rengifo",
            "Maipú",
            -33.51867788290727,
            -70.76054753427009
        ),
        FIELD_DBO(
            "Multicancha Hermanos Carrera",
            "Hermanos Carrera con Rengifo",
            "Maipú",
            -33.51867788290727,
            -70.76054753427009
        ),
        FIELD_DBO(
            "Multicancha Hermanos Carrera",
            "Hermanos Carrera con Rengifo",
            "Maipú",
            -33.51867788290727,
            -70.76054753427009
        ),
        FIELD_DBO(
            "Multicancha Hermanos Carrera",
            "Hermanos Carrera con Rengifo",
            "Maipú",
            -33.51867788290727,
            -70.76054753427009
        ),
        FIELD_DBO(
            "Multicancha Hermanos Carrera",
            "Hermanos Carrera con Rengifo",
            "Maipú",
            -33.51867788290727,
            -70.76054753427009
        ),
        FIELD_DBO(
            "Multicancha Hermanos Carrera",
            "Hermanos Carrera con Rengifo",
            "Maipú",
            -33.51867788290727,
            -70.76054753427009
        ),
        FIELD_DBO(
            "Multicancha Hermanos Carrera",
            "Hermanos Carrera con Rengifo",
            "Maipú",
            -33.51867788290727,
            -70.76054753427009
        ),
        FIELD_DBO(
            "Multicancha Hermanos Carrera",
            "Hermanos Carrera con Rengifo",
            "Maipú",
            -33.51867788290727,
            -70.76054753427009
        ),
        FIELD_DBO(
            "Multicancha Hermanos Carrera",
            "Hermanos Carrera con Rengifo",
            "Maipú",
            -33.51867788290727,
            -70.76054753427009
        ),
        FIELD_DBO(
            "Multicancha Hermanos Carrera",
            "Hermanos Carrera con Rengifo",
            "Maipú",
            -33.51867788290727,
            -70.76054753427009
        ),
        FIELD_DBO(
            "Multicancha Hermanos Carrera",
            "Hermanos Carrera con Rengifo",
            "Maipú",
            -33.51867788290727,
            -70.76054753427009
        ),
        FIELD_DBO(
            "Multicancha Hermanos Carrera",
            "Hermanos Carrera con Rengifo",
            "Maipú",
            -33.51867788290727,
            -70.76054753427009
        ),
        FIELD_DBO(
            "Multicancha Hermanos Carrera",
            "Hermanos Carrera con Rengifo",
            "Maipú",
            -33.51867788290727,
            -70.76054753427009
        ),
        FIELD_DBO(
            "Multicancha Hermanos Carrera",
            "Hermanos Carrera con Rengifo",
            "Maipú",
            -33.51867788290727,
            -70.76054753427009
        ),
        FIELD_DBO(
            "Multicancha Hermanos Carrera",
            "Hermanos Carrera con Rengifo",
            "Maipú",
            -33.51867788290727,
            -70.76054753427009
        ),
        FIELD_DBO(
            "Multicancha Hermanos Carrera",
            "Hermanos Carrera con Rengifo",
            "Maipú",
            -33.51867788290727,
            -70.76054753427009
        ),
        FIELD_DBO(
            "Multicancha Hermanos Carrera",
            "Hermanos Carrera con Rengifo",
            "Maipú",
            -33.51867788290727,
            -70.76054753427009
        ),
        FIELD_DBO(
            "Multicancha Hermanos Carrera",
            "Hermanos Carrera con Rengifo",
            "Maipú",
            -33.51867788290727,
            -70.76054753427009
        ),
        FIELD_DBO(
            "Multicancha Hermanos Carrera",
            "Hermanos Carrera con Rengifo",
            "Maipú",
            -33.51867788290727,
            -70.76054753427009
        ),
        FIELD_DBO(
            "Multicancha Hermanos Carrera",
            "Hermanos Carrera con Rengifo",
            "Maipú",
            -33.51867788290727,
            -70.76054753427009
        ),
        FIELD_DBO(
            "Multicancha Hermanos Carrera",
            "Hermanos Carrera con Rengifo",
            "Maipú",
            -33.51867788290727,
            -70.76054753427009
        ),
        FIELD_DBO(
            "Multicancha Hermanos Carrera",
            "Hermanos Carrera con Rengifo",
            "Maipú",
            -33.51867788290727,
            -70.76054753427009
        ),
        FIELD_DBO(
            "Multicancha Hermanos Carrera",
            "Hermanos Carrera con Rengifo",
            "Maipú",
            -33.51867788290727,
            -70.76054753427009
        ),
        FIELD_DBO(
            "Multicancha Hermanos Carrera",
            "Hermanos Carrera con Rengifo",
            "Maipú",
            -33.51867788290727,
            -70.76054753427009
        ),
        FIELD_DBO(
            "Multicancha Hermanos Carrera",
            "Hermanos Carrera con Rengifo",
            "Maipú",
            -33.51867788290727,
            -70.76054753427009
        ),
        FIELD_DBO(
            "Multicancha Hermanos Carrera",
            "Hermanos Carrera con Rengifo",
            "Maipú",
            -33.51867788290727,
            -70.76054753427009
        ),
        FIELD_DBO(
            "Multicancha Hermanos Carrera",
            "Hermanos Carrera con Rengifo",
            "Maipú",
            -33.51867788290727,
            -70.76054753427009
        ),
        FIELD_DBO(
            "Multicancha Hermanos Carrera",
            "Hermanos Carrera con Rengifo",
            "Maipú",
            -33.51867788290727,
            -70.76054753427009
        ),
        FIELD_DBO(
            "Multicancha Hermanos Carrera",
            "Hermanos Carrera con Rengifo",
            "Maipú",
            -33.51867788290727,
            -70.76054753427009
        ),
        FIELD_DBO(
            "Multicancha Hermanos Carrera",
            "Hermanos Carrera con Rengifo",
            "Maipú",
            -33.51867788290727,
            -70.76054753427009
        ),
        FIELD_DBO(
            "Multicancha Hermanos Carrera",
            "Hermanos Carrera con Rengifo",
            "Maipú",
            -33.51867788290727,
            -70.76054753427009
        ),
        FIELD_DBO(
            "Multicancha Hermanos Carrera",
            "Hermanos Carrera con Rengifo",
            "Maipú",
            -33.51867788290727,
            -70.76054753427009
        ),
        FIELD_DBO(
            "Multicancha Hermanos Carrera",
            "Hermanos Carrera con Rengifo",
            "Maipú",
            -33.51867788290727,
            -70.76054753427009
        ),
        FIELD_DBO(
            "Multicancha Hermanos Carrera",
            "Hermanos Carrera con Rengifo",
            "Maipú",
            -33.51867788290727,
            -70.76054753427009
        ),
        FIELD_DBO(
            "Multicancha Hermanos Carrera",
            "Hermanos Carrera con Rengifo",
            "Maipú",
            -33.51867788290727,
            -70.76054753427009
        ),
        FIELD_DBO(
            "Multicancha Hermanos Carrera",
            "Hermanos Carrera con Rengifo",
            "Maipú",
            -33.51867788290727,
            -70.76054753427009
        ),
        FIELD_DBO(
            "Multicancha Hermanos Carrera",
            "Hermanos Carrera con Rengifo",
            "Maipú",
            -33.51867788290727,
            -70.76054753427009
        ),
        FIELD_DBO(
            "Multicancha Hermanos Carrera",
            "Hermanos Carrera con Rengifo",
            "Maipú",
            -33.51867788290727,
            -70.76054753427009
        ),
        FIELD_DBO(
            "Multicancha Hermanos Carrera",
            "Hermanos Carrera con Rengifo",
            "Maipú",
            -33.51867788290727,
            -70.76054753427009
        ),
        FIELD_DBO(
            "Multicancha Hermanos Carrera",
            "Hermanos Carrera con Rengifo",
            "Maipú",
            -33.51867788290727,
            -70.76054753427009
        ),
        FIELD_DBO(
            "Multicancha Hermanos Carrera",
            "Hermanos Carrera con Rengifo",
            "Maipú",
            -33.51867788290727,
            -70.76054753427009
        ),
        FIELD_DBO(
            "Multicancha Hermanos Carrera",
            "Hermanos Carrera con Rengifo",
            "Maipú",
            -33.51867788290727,
            -70.76054753427009
        ),
        FIELD_DBO(
            "Multicancha Hermanos Carrera",
            "Hermanos Carrera con Rengifo",
            "Maipú",
            -33.51867788290727,
            -70.76054753427009
        ),
        FIELD_DBO(
            "Multicancha Hermanos Carrera",
            "Hermanos Carrera con Rengifo",
            "Maipú",
            -33.51867788290727,
            -70.76054753427009
        ),
        FIELD_DBO(
            "Multicancha Hermanos Carrera",
            "Hermanos Carrera con Rengifo",
            "Maipú",
            -33.51867788290727,
            -70.76054753427009
        ),
        FIELD_DBO(
            "Multicancha Hermanos Carrera",
            "Hermanos Carrera con Rengifo",
            "Maipú",
            -33.51867788290727,
            -70.76054753427009
        ),
        FIELD_DBO(
            "Multicancha Hermanos Carrera",
            "Hermanos Carrera con Rengifo",
            "Maipú",
            -33.51867788290727,
            -70.76054753427009
        ),
        FIELD_DBO(
            "Multicancha Hermanos Carrera",
            "Hermanos Carrera con Rengifo",
            "Maipú",
            -33.51867788290727,
            -70.76054753427009
        ),
        FIELD_DBO(
            "Multicancha Hermanos Carrera",
            "Hermanos Carrera con Rengifo",
            "Maipú",
            -33.51867788290727,
            -70.76054753427009
        ),
        FIELD_DBO(
            "Multicancha Hermanos Carrera",
            "Hermanos Carrera con Rengifo",
            "Maipú",
            -33.51867788290727,
            -70.76054753427009
        ),
        FIELD_DBO(
            "Multicancha Hermanos Carrera",
            "Hermanos Carrera con Rengifo",
            "Maipú",
            -33.51867788290727,
            -70.76054753427009
        ),
        FIELD_DBO(
            "Multicancha Hermanos Carrera",
            "Hermanos Carrera con Rengifo",
            "Maipú",
            -33.51867788290727,
            -70.76054753427009
        ),
        FIELD_DBO(
            "Multicancha Hermanos Carrera",
            "Hermanos Carrera con Rengifo",
            "Maipú",
            -33.51867788290727,
            -70.76054753427009
        ),
        FIELD_DBO(
            "Multicancha Hermanos Carrera",
            "Hermanos Carrera con Rengifo",
            "Maipú",
            -33.51867788290727,
            -70.76054753427009
        ),
        FIELD_DBO(
            "Multicancha Hermanos Carrera",
            "Hermanos Carrera con Rengifo",
            "Maipú",
            -33.51867788290727,
            -70.76054753427009
        ),
        FIELD_DBO(
            "Multicancha Hermanos Carrera",
            "Hermanos Carrera con Rengifo",
            "Maipú",
            -33.51867788290727,
            -70.76054753427009
        ),
        FIELD_DBO(
            "Multicancha Hermanos Carrera",
            "Hermanos Carrera con Rengifo",
            "Maipú",
            -33.51867788290727,
            -70.76054753427009
        ),
        FIELD_DBO(
            "Multicancha Hermanos Carrera",
            "Hermanos Carrera con Rengifo",
            "Maipú",
            -33.51867788290727,
            -70.76054753427009
        ),
        FIELD_DBO(
            "Multicancha Hermanos Carrera",
            "Hermanos Carrera con Rengifo",
            "Maipú",
            -33.51867788290727,
            -70.76054753427009
        ),
        FIELD_DBO(
            "Multicancha Hermanos Carrera",
            "Hermanos Carrera con Rengifo",
            "Maipú",
            -33.51867788290727,
            -70.76054753427009
        ),
        FIELD_DBO(
            "Multicancha Hermanos Carrera",
            "Hermanos Carrera con Rengifo",
            "Maipú",
            -33.51867788290727,
            -70.76054753427009
        ),
        FIELD_DBO(
            "Multicancha Hermanos Carrera",
            "Hermanos Carrera con Rengifo",
            "Maipú",
            -33.51867788290727,
            -70.76054753427009
        ),
        FIELD_DBO(
            "Multicancha Hermanos Carrera",
            "Hermanos Carrera con Rengifo",
            "Maipú",
            -33.51867788290727,
            -70.76054753427009
        ),
        FIELD_DBO(
            "Multicancha Hermanos Carrera",
            "Hermanos Carrera con Rengifo",
            "Maipú",
            -33.51867788290727,
            -70.76054753427009
        ),
        FIELD_DBO(
            "Multicancha Hermanos Carrera",
            "Hermanos Carrera con Rengifo",
            "Maipú",
            -33.51867788290727,
            -70.76054753427009
        ),
        FIELD_DBO(
            "Multicancha Hermanos Carrera",
            "Hermanos Carrera con Rengifo",
            "Maipú",
            -33.51867788290727,
            -70.76054753427009
        ),
        FIELD_DBO(
            "Multicancha Hermanos Carrera",
            "Hermanos Carrera con Rengifo",
            "Maipú",
            -33.51867788290727,
            -70.76054753427009
        ),
        FIELD_DBO(
            "Multicancha Hermanos Carrera",
            "Hermanos Carrera con Rengifo",
            "Maipú",
            -33.51867788290727,
            -70.76054753427009
        ),
        FIELD_DBO(
            "Multicancha Hermanos Carrera",
            "Hermanos Carrera con Rengifo",
            "Maipú",
            -33.51867788290727,
            -70.76054753427009
        ),
        FIELD_DBO(
            "Multicancha Hermanos Carrera",
            "Hermanos Carrera con Rengifo",
            "Maipú",
            -33.51867788290727,
            -70.76054753427009
        ),
        FIELD_DBO(
            "Multicancha Hermanos Carrera",
            "Hermanos Carrera con Rengifo",
            "Maipú",
            -33.51867788290727,
            -70.76054753427009
        ),
        FIELD_DBO(
            "Multicancha Hermanos Carrera",
            "Hermanos Carrera con Rengifo",
            "Maipú",
            -33.51867788290727,
            -70.76054753427009
        ),
        FIELD_DBO(
            "Multicancha Hermanos Carrera",
            "Hermanos Carrera con Rengifo",
            "Maipú",
            -33.51867788290727,
            -70.76054753427009
        ),
        FIELD_DBO(
            "Multicancha Hermanos Carrera",
            "Hermanos Carrera con Rengifo",
            "Maipú",
            -33.51867788290727,
            -70.76054753427009
        ),
        FIELD_DBO(
            "Multicancha Hermanos Carrera",
            "Hermanos Carrera con Rengifo",
            "Maipú",
            -33.51867788290727,
            -70.76054753427009
        ),
        FIELD_DBO(
            "Multicancha Hermanos Carrera",
            "Hermanos Carrera con Rengifo",
            "Maipú",
            -33.51867788290727,
            -70.76054753427009
        ),
        FIELD_DBO(
            "Multicancha Hermanos Carrera",
            "Hermanos Carrera con Rengifo",
            "Maipú",
            -33.51867788290727,
            -70.76054753427009
        ),
        FIELD_DBO(
            "Multicancha Hermanos Carrera",
            "Hermanos Carrera con Rengifo",
            "Maipú",
            -33.51867788290727,
            -70.76054753427009
        ),
        FIELD_DBO(
            "Multicancha Hermanos Carrera",
            "Hermanos Carrera con Rengifo",
            "Maipú",
            -33.51867788290727,
            -70.76054753427009
        ),
    )
}