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
        /** 11*/
        FIELD_DBO(
            "Multicancha Coliseo",
            "Coliseo 1086",
            "Maipú",
            -33.51879515526059,
            -70.76795177687366
        ),
        /** 12*/
        FIELD_DBO(
            "Multicancha La Comarca",
            "Comarca 277",
            "Maipú",
            -33.52436935216282,
            -70.76239652719158
        ),
        /** 13*/
        FIELD_DBO(
            "Multicancha Los Generales",
            "Los Generales 875",
            "Maipú",
            -33.52041174219764,
            -70.77030007517354
        ),
        /** 14*/
        FIELD_DBO(
            "Multicancha Mapocho",
            "Mapocho 1237",
            "Maipú",
            -33.52297084501985,
            -70.77339780150002
        ),
        /** 15*/
        FIELD_DBO(
            "Multicancha Huascar",
            "Huascar 744",
            "Maipú",
            -33.5214313922718,
            -70.76283636897085
        ),
        /** 16*/
        FIELD_DBO(
            "Multicancha Colombo",
            "Colombo 1361",
            "Maipú",
            -33.48046235327522,
            -70.73555126949252
        ),

        /** 17*/
        FIELD_DBO(
            "Multicancha Carlos Gardel",
            "Carlos Gardel con Tango",
            "Maipú",
            -33.5118861897993,
            -70.78267851272362
        ),

        /** 18*/
        FIELD_DBO(
            "Multicancha El Huaso",
            "El Huaso con Chacarillas",
            "Maipú",
            -33.514800166939295,
            -70.78401298220123
        ),

        /** 19*/
        FIELD_DBO(
            "Multicancha Carlos Gardel con el Huaso",
            "El Huaso con Carlos Gardel",
            "Maipú",
            -33.5147434043495,
            -70.78348669286774
        ),

        /** 20*/
        FIELD_DBO(
            "Multicancha River Plate",
            "River Plate con Tango",
            "Maipú",
            -33.51189262051851,
            -70.78348870876606
        ),

        /** 21*/
        FIELD_DBO(
            "Multicancha Los Adobes",
            "Los Adobes con de La Glorieta",
            "Maipú",
            -33.51027767006374,
            -70.78244528922866
        ),

        /** 22*/
        FIELD_DBO(
            "Multicancha El Pibe",
            "El Pibe con Tango",
            "Maipú",
            -33.511657476909875,
            -70.78148682485073
        ),

        /** 23*/
        FIELD_DBO(
            "Multicancha Jose Manuel Borgoño",
            "Jose Manuel Borgoño con Los Adobes",
            "Maipú",
            -33.51165446234271,
            -70.78174228268578
        ),

        /** 24*/
        FIELD_DBO(
            "Multicancha La Yunta",
            "La Yunta con El Riego",
            "Maipú",
            -33.514458217615186,
            -70.78273043923471
        ),

        /** 25*/
        FIELD_DBO(
            "Multicancha Hermanos Carrera",
            "Hermanos Carrera con Rengifo",
            "Maipú",
            -33.51867788290727,
            -70.76054753427009
        ),
        /** 26*/
        FIELD_DBO(
            "Multicancha Hermanos Carrera",
            "Hermanos Carrera con Rengifo",
            "Maipú",
            -33.51867788290727,
            -70.76054753427009
        ),
        /** 27*/
        FIELD_DBO(
            "Multicancha Hermanos Carrera",
            "Hermanos Carrera con Rengifo",
            "Maipú",
            -33.51867788290727,
            -70.76054753427009
        ),
        /** 28*/
        FIELD_DBO(
            "Multicancha Hermanos Carrera",
            "Hermanos Carrera con Rengifo",
            "Maipú",
            -33.51867788290727,
            -70.76054753427009
        ),
        /** 29*/
        FIELD_DBO(
            "Multicancha Hermanos Carrera",
            "Hermanos Carrera con Rengifo",
            "Maipú",
            -33.51867788290727,
            -70.76054753427009
        ),
        /** 30*/
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