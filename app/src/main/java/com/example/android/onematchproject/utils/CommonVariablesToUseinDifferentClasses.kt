package com.example.android.onematchproject.utils

import com.example.android.onematchproject.data.data_objects.DBO.FIELD_DBO
import com.google.firebase.auth.FirebaseAuth


object CommonVariablesToUseinDifferentClasses {

    const val TAG = "AuthenticationActivity"
    const val SIGN_IN_RESULT_CODE = 1001
    const val REQUEST_TURN_DEVICE_LOCATION_ON = 29
    val firebaseAuth = FirebaseAuth.getInstance()

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
            "Multicancha La Yunta1",
            "La Yunta con El Riego",
            "Maipú",
            -33.51445564463931,
            -70.78269553406575
        ),

        /** 25*/
        FIELD_DBO(
            "Multicancha La Yunta2",
            "La Yunta con El Riego",
            "Maipú",
            -33.514457525121195,
            -70.78294137918375
        ),
        /** 26*/
        FIELD_DBO(
            "Multicancha Radón",
            "Radón con Rubidio",
            "Maipú",
            -33.51927366111185,
            -70.78527882082406
        ),

        /** 27*/
        FIELD_DBO(
            "Multicancha Club Deportivo Real Flandes",
            "San Jose 1844",
            "Maipú",
            -33.51673972564303,
            -70.78446248239305
        ),
        /** 28*/
        FIELD_DBO(
            "Multicancha Caupolican Oriente",
            "3 Poniente 2657",
            "Maipú",
            -33.50413053387282,
            -70.77861478136131
        ),
        /** 29*/
        FIELD_DBO(
            "Multicancha Caupolican Poniente",
            "3 Poniente 2657",
            "Maipú",
            -33.504412639355785,
            -70.77887190377832
        ),
        /** 30*/
        FIELD_DBO(
            "Multicancha Samba",
            "Samba 1818",
            "Maipú",
            -33.511911466535295,
            -70.78327131329286
        ),
        /** 31*/
        FIELD_DBO(
            "Multicancha Levitico1",
            "Tres Poniente 235",
            "Maipú",
            -33.52504868429184,
            -70.778211019084
        ),
        /** 32*/
        FIELD_DBO(
            "Multicancha Las Tejas1",
            "3 Poniente con Las Tejas",
            "Maipú",
            -33.514327340642815,
            -70.77866125229829
        ),
        /** 33*/
        FIELD_DBO(
            "Multicancha Quiriquina",
            "3 Poniente con Quiriquina",
            "Maipú",
            -33.51699172700627,
            -70.77861434941387
        ),
        /** 34*/
        FIELD_DBO(
            "Multicancha Levitico2",
            "Tres Poniente 241",
            "Maipú",
            -33.533843404819685,
            -70.7722853633437
        ),
        /** 35*/
        FIELD_DBO(
            "Multicancha La Galaxia",
            "La Galaxia con San Jose",
            "Maipú",
            -33.51779861210445,
            -70.7947484096386
        ),

        /** 36*/
        FIELD_DBO(
            "Multicancha Narciso",
            "4 Poniente con Los Yuyos",
            "Maipú",
            -33.51507681056955,
            -70.7909054207271
        ),

        /** 37*/
        FIELD_DBO(
            "Multicancha Los Parronales",
            "El Huaso con Los Parronales",
            "Maipú",
            -33.514535356931326,
            -70.79197849346363
        ),

        /** 38*/
        FIELD_DBO(
            "Multicancha Apollo XII",
            "San Jose con Apollo XII",
            "Maipú",
            -33.51798121373069,
            -70.79757551038895
        ),

        /** 39*/
        FIELD_DBO(
            "Multicancha Quinta Vergara",
            "Quinta Vergara con Mantos Blancos",
            "Maipú",
            -33.50962792049366,
            -70.78803149321416
        ),

        /** 40*/
        FIELD_DBO(
            "Multicancha Marga Marga",
            "Jose Manuel Borgoño con Marga Marga",
            "Maipú",
            -33.509263131702866,
            -70.78771392374193
        ),

        /** 41*/
        FIELD_DBO(
            "Multicancha Cronos",
            "4 Poniente con Cronos",
            "Maipú",
            -33.517449264175156,
            -70.79097503229931
        ),

        /** 42*/
        FIELD_DBO(
            "Multicancha La Galaxia",
            "La Galaxia con Senadora María de la Cruz",
            "Maipú",
            -33.51057621097001,
            -70.79479178499462
        ),

        /** 43*/
        FIELD_DBO(
            "Multicancha Futaleufu1",
            "Futaleufu 1982",
            "Maipú",
            -33.51233154412302,
            -70.7862026707283
        ),

        /** 44*/
        FIELD_DBO(
            "Multicancha Futaleufu2",
            "Futaleufu 2012",
            "Maipú",
            -33.51196364421673,
            -70.78611799523395
        ),

        /** 45*/
        FIELD_DBO(
            "Multicancha Quinta Vergara",
            "Quinta Vergara con Jose Manuel Borgoño",
            "Maipú",
            -33.509237414492596,
            -70.7879526744267
        ),

        /** 46*/
        FIELD_DBO(
            "Multicancha Riñihue",
            "Riñihue 2248",
            "Maipú",
            -33.50963102149335, -70.78802050756907
        ),

        /** 47*/
        FIELD_DBO(
            "Multicancha Agua Santa1",
            "Galaxia con Agua Santa",
            "Maipú",
            -33.51382276523398, -70.79425890985318
        ),

        /** 48*/
        FIELD_DBO(
            "Multicancha Agua Santa2",
            "Galaxia con Agua Santa",
            "Maipú",
            -33.51397799251439, -70.7942172645024
        ),

        /** 49*/
        FIELD_DBO(
            "Multicancha Jaime Galte",
            "Jaime Galte con El Conquistador",
            "Maipú",
            -33.511720583012774, -70.79854132338704
        ),

        /** 50*/
        FIELD_DBO(
            "Multicancha Jose Manuel Borgoño",
            "Jose Manuel Borgoño 2787",
            "Maipú",
            -33.50860107300483, -70.79185061741721
        ),

        /** 51*/
        FIELD_DBO(
            "Multicancha Andromeda",
            "Andromeda 2898",
            "Maipú",
            -33.51438703826444, -70.79523445833048
        ),

        /** 52*/
        FIELD_DBO(
            "Multicancha San José",
            "San José 316",
            "Maipú",
            -33.51504147687769, -70.76085501682041
        ),

        /** 53*/
        FIELD_DBO(
            "Multicancha Manquehue",
            "Manquehue 2100",
            "Maipú",
            -33.506777668849246, -70.7867727732632
        ),

        /** 54*/
        FIELD_DBO(
            "Multicancha San José",
            "San José 3070",
            "Maipú",
            -33.518010225510444, -70.79752783755869
        ),

        /** 55*/
        FIELD_DBO(
            "Multicancha Valle de los Reyes",
            "Valle de los Reyes, Lo Vásquez",
            "Maipú",
            -33.515790600258995, -70.79877973823245
        ),

        /** 56*/
        FIELD_DBO(
            "Multicancha Campos de Deporte",
            "Los Arces con Campos de Deporte",
            "Maipú",
            -33.51109979218838, -70.82549301707077
        ),

        /** 57*/
        FIELD_DBO(
            "Multicancha Pocuro",
            "Pocuro 5757",
            "Maipú",
            -33.497296463920236, -70.81472414495616
        ),

        /** 58*/
        FIELD_DBO(
            "Multicancha El Hoyo",
            "Presidente Kennedy con Nva Municipal",
            "Maipú",
            -33.49917481348162, -70.74818543023662
        ),

        /** 59*/
        FIELD_DBO(
            "Multicancha El Alto",
            "El Alto 1176",
            "Maipú",
            -33.509103705951375, -70.7447337547853
        ),

        /** 60*/
        FIELD_DBO(
            "Multicancha Séptimo de Linea",
            "Séptimo de Linea con Portada del Este",
            "Maipú",
            -33.50619097698634, -70.74314184984854
        ),

        /** 61*/
        FIELD_DBO(
            "Multicancha Gaston Palma",
            "Uno sur Con Gastón Palma",
            "Maipú",
            -33.50759854570704, -70.74183755577795
        ),

        /** 62*/
        FIELD_DBO(
            "Multicancha Luis Uribe",
            "Luis Uribe 909",
            "Maipú",
            -33.503550253449006, -70.74699933127522
        ),

        /** 63*/
        FIELD_DBO(
            "Multicancha Gastón Palma",
            "Pamela con Gastón Palma",
            "Maipú",
            -33.50465636414843, -70.74101046223491
        ),

        /** 64*/
        FIELD_DBO(
            "Multicancha Jorge Montt",
            "Jorge Montt con Luis Barros Borgoño",
            "Maipú",
            -33.503871504107636, -70.78305175039532
        ),

        /** 65*/
        /** ES LA MISMA QUE LA 64**/

        /** 66*/
        /** NO EXISTE*/

        /** 67*/
        FIELD_DBO(
            "Multicancha Teniente Bello",
            "Pasaje Armando Cortinez con Teniente Bello",
            "Maipú",
            -33.502151934815785, -70.78253756827527
        ),

        /** 68*/
        FIELD_DBO(
            "Multicancha Los Cometas",
            "Campanario con Los Cometas",
            "Maipú",
            -33.520642147726505, -70.79340015175117
        ),

        /** 69*/
        FIELD_DBO(
            "Multicancha Los Astronomos",
            "Los Astronomos 2987",
            "Maipú",
            -33.523761335066915, -70.7961453601286
        ),

        /** 70*/
        FIELD_DBO(
            "Pastor Gillermo Castillo 1379",
            "Los Astronomos 2987",
            "Maipú",
            -33.523761335066915, -70.7961453601286
        ),

        /** 71*/
        FIELD_DBO(
            "Multicancha Victor Jara",
            "Victor Jara con German Gárces",
            "Maipú",
            -33.525909816273085, -70.78450682261048
        ),

        /** 72*/
        FIELD_DBO(
            "Multicancha Valle de los Reyes",
            "Valle de los Reyes con Los Astrónomos",
            "Maipú",
            -33.523363345456595, -70.79835657311013
        ),

        /** 73*/
        FIELD_DBO(
            "Multicancha La Dormida",
            "Hermanos Carrera con Rengifo",
            "Maipú",
            -33.520252457602794, -70.79485398333526
        ),

        /** 74*/
        FIELD_DBO(
            "Multicancha Rio Clarillo",
            "Diego Barros Ortiz con Rio Clarillo",
            "Maipú",
            -33.52307865002648, -70.79332360848507
        ),

        /** 75*/
        FIELD_DBO(
            "Multicancha Galio",
            "Galio con Disprosio",
            "Maipú",
            -33.52098483394128, -70.7836775900462
        ),

        /** 76*/
        FIELD_DBO(
            "Multicancha Ingeniero Fernando Smits Schleyer ",
            "Ingeniero Fernando Smits Schleyer con Job",
            "Maipú",
            -33.527700028404695, -70.79572733136311
        ),

        /** 77*/
        FIELD_DBO(
            "Multicancha La Fortuna",
            "Los Florines con Aton",
            "Maipú",
            -33.523355073115624, -70.76620242896863
        ),

        /** 78*/
        FIELD_DBO(
            "Multicancha Andrés Amenábar Vergara",
            "Andrés Amenábar con Hermogenes Perez de Arce",
            "Maipú",
            -33.5318109705426, -70.76940674664746
        ),

        /** 79*/
        FIELD_DBO(
            "Multicancha Segundo Puente",
            "Cayupil 468",
            "Maipú",
            -33.533949005357194, -70.77819596700932
        ),

        /** 80*/
        FIELD_DBO(
            "Multicancha Primer Puente",
            "Cayupil 469",
            "Maipú",
            -33.53355103587574, -70.7786117093691
        ),

        /** 81*/
        FIELD_DBO(
            "Multicancha Héctor Fuenzalida",
            "Tres Poniente con Hector Fuenzalida",
            "Maipú",
            -33.53383366383544, -70.77229422807731
        ),

        /** 82*/
        FIELD_DBO(
            "Multicancha Hermanos Carrera",
            "Tres Poniente con Presidente Arturo Alessandri Palma",
            "Maipú",
            -33.529748714674305, -70.77609183917833
        ),

        /** 83*/
        FIELD_DBO(
            "Multicancha Enrique Bravo Menadier",
            "Enrique Bravo Menadier 726",
            "Maipú",
            -33.52920277580174, -70.77427753937913
        ),

        /** 84*/
        /** NO EXISTE*/

        /** 85*/
        FIELD_DBO(
            "Multicancha Europa",
            "Europa con Sajonia",
            "Maipú",
            -33.53639504478088, -70.7737903389696
        ),

        /** 86*/
        FIELD_DBO(
            "Multicancha Sajonia",
            "Europa con Sajonia",
            "Maipú",
            -33.535806161473204, -70.77379697709186
        ),

        /** 87*/
        FIELD_DBO(
            "Multicancha Ferrocarril 1169",
            "Ferrocarril 1169",
            "Maipú",
            -33.534085436245, -70.7677744302774
        ),

        /** 88*/
        FIELD_DBO(
            "Multicancha Ferrocarril 1131",
            "Ferrocarril 1131",
            "Maipú",
            -33.53384855949243, -70.76744888390515
        ),

        /** 89*/
        FIELD_DBO(
            "Multicancha Ferrocarril 1199",
            "Ferrocarril 1199",
            "Maipú",
            -33.534345145316415, -70.76815332315594
        ),

        /** 90*/
        FIELD_DBO(
            "Multicancha Ramon Barros Luco",
            "Oscar Bonilla con Ramon Barros Luco",
            "Maipú",
            -33.5320929885392, -70.78299001249367
        ),

        /** 91*/
        /** NO EXISTE*/

        /** 92*/
        FIELD_DBO(
            "Multicancha Escuela Naval 1",
            "Escuela Naval con Fogonero Urra",
            "Maipú",
            -33.53942973163962, -70.77726937562036
        ),

        /** 93*/
        FIELD_DBO(
            "Multicancha Escuela Naval 2",
            "Escuela Naval con Fogonero Urra",
            "Maipú",
            -33.53953312821701, -70.77742049142165
        ),

        /** 94*/
        FIELD_DBO(
            "Multicancha Renato Labra 1",
            "Ricardo Barahona con Lenka Franulic",
            "Maipú",
            -33.53040716323843, -70.76301187068309
        ),

        /** 95*/
        FIELD_DBO(
            "Multicancha Renato Labra 2",
            "Ricardo Barahona con Lenka Franulic",
            "Maipú",
            -33.530594976118614, -70.76332032468903
        ),

        /** 96*/
        FIELD_DBO(
            "Multicancha Hernán Díaz Arrieta",
            "Hernán Díaz Arrieta con El Tranque",
            "Maipú",
            -33.54936120139232, -70.79528285873965
        ),

        /** 97*/
        FIELD_DBO(
            "Multicancha Caleta de Camarones",
            "Caleta de Camarones con Salar Grande",
            "Maipú",
            -33.538243986591574, -70.79195738519404
        ),

        /** 98*/
        FIELD_DBO(
            "Multicancha La Trilla",
            "Del Ferrocarril con La Trilla",
            "Maipú",
            -33.54750718872746, -70.78718517502175
        ),

        /** 99*/
        FIELD_DBO(
            "Multicancha San Rene",
            "San Rene con El Tranque",
            "Maipú",
            -33.55034534235806, -70.7939265212923
        ),

        /** 100*/
        FIELD_DBO(
            "Multicancha Hernán Díaz Arrieta",
            "Hernán Díaz Arrieta 3857",
            "Maipú",
            -33.54793020300481, -70.79455182564134
        ),

        /** 101*/
        FIELD_DBO(
            "Multicancha Valle de los Reyes",
            "Valle de los Reyes con Catemu",
            "Maipú",
            -33.5322606909722, -70.79974738264684
        ),

        /** 102*/
        FIELD_DBO(
            "Multicancha Lago Carlota",
            "Lago Carlota con Lago Jeinimeni",
            "Maipú",
            -33.552919878134894, -70.79834122856987
        ),

        /** 103*/
        FIELD_DBO(
            "Multicancha Nemesio Antunez",
            "Nemesio Antunez 210",
            "Maipú",
            -33.54950991742884, -70.79319090218834
        ),

        /** 104*/
        FIELD_DBO(
            "Multicancha Marta Ossa Ruíz",
            "Marta Ossa Ruíz 1051",
            "Maipú",
            -33.466117388582376, -70.75267417078626
        ),

        /** 105*/
        FIELD_DBO(
            "Multicancha Ingeniero Roberto LLona",
            "Ingeniero Roberto Llona 5220",
            "Maipú",
            -33.47237765513767, -70.75230051733166
        ),

        /** 106*/
        FIELD_DBO(
            "Multicancha Miqueas 1",
            "Miqueas 4443",
            "Maipú",
            -33.48099205057778, -70.74861012367474
        ),

        /** 107*/
        FIELD_DBO(
            "Multicancha Miqueas 2",
            "Miqueas 4443",
            "Maipú",
            -33.481099797973016, -70.74846977679879
        ),

        /** 108*/
        FIELD_DBO(
            "Multicancha Santa Elena",
            "Santa Elena con Miqueas",
            "Maipú",
            -33.47907212337505, -70.74745353378253
        ),

        /** 109*/
        FIELD_DBO(
            "Multicancha Las Meninas",
            "Las Meninas 4706",
            "Maipú",
            -33.47862181368209, -70.75143774590391
        ),

        /** 110*/
        FIELD_DBO(
            "Multicancha Marco Echeñique",
            "Marco Echeñique 573",
            "Maipú",
            -33.476681999421366, -70.75299353447241
        ),

        /** 111*/
        FIELD_DBO(
            "Multicancha Antonio Varas",
            "Min Antonio Varas 5524",
            "Maipú",
            -33.466861988827354, -70.7551508730337
        ),

        /** 112*/
        FIELD_DBO(
            "Multicancha Picaflor",
            "Picaflor 452",
            "Maipú",
            -33.47154893249687, -70.74667716476934
        ),

        /** 113*/
        FIELD_DBO(
            "Multicancha Hermanos valladolid",
            "valladolid 358",
            "Maipú",
            -33.47584002099541, -70.73682689066653
        ),
        /** 114*/
        FIELD_DBO(
            "Multicancha Nairobi",
            "Zaire con Nairobi",
            "Maipú",
            -33.4792336897686, -70.73658848543832
        ),
        /** 115*/
        FIELD_DBO(
            "Multicancha Isabel Riquelme",
            "Isabel Riquelme 4536",
            "Maipú",
            -33.483562539326265, -70.74133541695387
        ),
        /** 116*/
        FIELD_DBO(
            "Multicancha La Machi",
            "Batalla de Rancagua con Machi",
            "Maipú",
            -33.488098226805995, -70.77025472189713
        ),
        /** 117*/
        FIELD_DBO(
            "Multicancha Cordillera de los Andes ",
            "Santa Biblia 1397",
            "Maipú",
            -33.48675645256617, -70.7652160137869
        ),

        /** 118*/
        FIELD_DBO(
            "Multicancha La Sinfonia",
            "La Sinfonia 1190",
            "Maipú",
            -33.489616483752236, -70.76522570939873
        ),

        /** 119*/
        FIELD_DBO(
            "Multicancha Las Petunias",
            "Las Petunias con Los Tulipanes",
            "Maipú",
            -33.484701292169156, -70.77027758292971
        ),

        /** 120*/
        FIELD_DBO(
            "Multicancha Huenteno",
            "Huenteno 1265",
            "Maipú",
            -33.49186438627932, -70.76918153100335
        ),

        /** 121*/
        FIELD_DBO(
            "Multicancha Collanco",
            "Collanco 1270",
            "Maipú",
            -33.49172675345813, -70.76911900489584
        ),

        /** 122*/
        FIELD_DBO(
            "Multicancha Ibañez Poniente",
            "Rio Ibañez Poniente 5787",
            "Maipú",
            -33.48149419164909, -70.76371999758287
        ),

        /** 123*/
        FIELD_DBO(
            "Multicancha Thiare",
            "Hermanos Carrera con Rengifo",
            "Maipú",
            -33.482130581688004, -70.76193347838799
        ),

        /** 124*/
        FIELD_DBO(
            "Multicancha Los Begonias",
            "Avenida El Rosal 5770",
            "Maipú",
            -33.482655728704124, -70.76331847576333
        ),

        /** 125*/
        FIELD_DBO(
            "Multicancha Parquesito",
            "Avenida Isabel Riquelme Nte. 3590",
            "Maipú",
            -33.491747601239226, -70.75601289182939
        ),

        /** 126*/
        FIELD_DBO(
            "Multicancha La Reforma",
            "La Reforma 830",
            "Maipú",
            -33.48672370453688, -70.76320789801407
        ),

        /** 127*/
        FIELD_DBO(
            "Multicancha Leiden",
            "Los tulipanes 150",
            "Maipú",
            -33.48713427797476, -70.7746842291977
        ),

        /** 128*/
        FIELD_DBO(
            "Multicancha La Victoria",
            "Victoria de Abril 1333",
            "Maipú",
            -33.48903977211703, -70.76773795744835
        ),

        /** 129*/
        FIELD_DBO(
            "Multicancha Los Columpios",
            "Los Columpios 1386",
            "Maipú",
            -33.51306623065117, -70.74195825974586
        ),

        /** 130*/
        FIELD_DBO(
            "Multicancha Jose Manuel Irarrazaval",
            "José Manuel Irarrázaval 391",
            "Maipú",
            -33.51353633077774, -70.75276170751452
        ),

        /** 131*/
        FIELD_DBO(
            "Multicancha Villa 4 Alamos",
            "La Mansion 905",
            "Maipú",
            -33.51780627359992, -70.74838177119913
        ),

        /** 132*/
        FIELD_DBO(
            "Multicancha Pelarco",
            "Pelarco 1440",
            "Maipú",
            -33.545955178467366, -70.76220676109874
        ),

        /** 133*/
        FIELD_DBO(
            "Multicancha Villa San Juan",
            "Abisinia 451",
            "Maipú",
            -33.542120555164445, -70.77070875753117
        ),

        /** 134*/
        FIELD_DBO(
            "Multicancha Egipto",
            "Egipto 1430",
            "Maipú",
            -33.548729530622225, -70.76372368631846
        ),

        /** 135*/
        FIELD_DBO(
            "Multicancha Esdras",
            "Esdras 1339",
            "Maipú",
            -33.552390845993784, -70.76746327949849
        ),

        /** 136*/
        FIELD_DBO(
            "Multicancha Las Industrias",
            "Tutankamon 480",
            "Maipú",
            -33.54502886378553, -70.77335398095292
        ),

        /** 137*/
        FIELD_DBO(
            "Multicancha Trimegisto",
            "Trimegisto 892",
            "Maipú",
            -33.54706754057084, -70.77008073835782
        ),

        /** 138*/
        FIELD_DBO(
            "Multicancha Curaco",
            "Curaco 1418",
            "Maipú",
            -33.54773103130863, -70.7629281004825
        ),

        /** 139*/
        FIELD_DBO(
            "Multicancha Sierra Gorda",
            "Sierra Gorda 1475",
            "Maipú",
            -33.554507103896974, -70.76672870353717
        ),

        /** 140*/
        FIELD_DBO(
            "Multicancha Lago Albano",
            "Parque Central Poniente 1559",
            "Maipú",
            -33.56386552265493, -70.7826879347624
        ),

        /** 141*/
        FIELD_DBO(
            "Multicancha Cerro Nevado",
            "Cerro Nevado 1771",
            "Maipú",
            -33.498674461466805, -70.73523552152213
        ),

        /** 142*/
        FIELD_DBO(
            "Multicancha 3 Norte / Lumen",
            "Lumen 3640",
            "Maipú",
            -33.49540116763148, -70.7361282035114
        ),

        /** 143*/
        FIELD_DBO(
            "Multicancha Primo de Rivera",
            "Segunda Transversal con Primo de Rivera",
            "Maipú",
            -33.49239103698208, -70.7429076883425
        ),

        /** 144*/
        FIELD_DBO(
            "Multicancha 3 Norte / Lumen / 2",
            "Lumen 3640",
            "Maipú",
            -33.49546879022372, -70.73591427415151
        ),

        /** 145*/
        FIELD_DBO(
            "Multicancha Hungria",
            "Hungria 2253",
            "Maipú",
            -33.489745606514624, -70.73395007915062
        ),

        /** 146*/
        FIELD_DBO(
            "Multicancha Sebastián Elcano",
            "Sebastian Elcano 1592",
            "Maipú",
            -33.50269470267869, -70.73712835754372
        ),

        /** 147*/
        FIELD_DBO(
            "Multicancha Canada",
            "Canada 3434",
            "Maipú",
            -33.49738716134016, -70.7384719377748
        ),

        /** 148*/
        FIELD_DBO(
            "Multicancha Guacolda",
            "Guacolda 2340",
            "Maipú",
            -33.50457394059058, -70.77028066702212
        ),

        /** 149*/
        FIELD_DBO(
            "Multicancha Minerva",
            "Minerva 3063",
            "Maipú",
            -33.49909731161425, -70.77788500404051
        ),

        /** 150*/
        FIELD_DBO(
            "Multicancha El Vivero",
            "El Peuco 583",
            "Maipú",
            -33.4941307293094, -70.76458866070806
        ),

        /** 151*/
        /** NO EXISTE */

        /** 152*/
        FIELD_DBO(
            "Multicancha El Porvenir",
            "Pasaje Los Patriotas 2930",
            "Maipú",
            -33.50113538129353, -70.76751263706248
        ),

        /** 153*/
        FIELD_DBO(
            "Multicancha La Armada",
            "La Armada 2571",
            "Maipú",
            -33.5044336051234, -70.77524251662643
        ),

        /** 154*/
        /** NO EXISTE */

        /** 155*/
        FIELD_DBO(
            "Multicancha Pudeto",
            "Pudeto 3430 - Al final del Pasaje",
            "Maipú",
            -33.49564663934921, -70.77290875022415
        ),

        /** 156*/
        FIELD_DBO(
            "Multicancha Galicia",
            "Galicia 2948",
            "Maipú",
            -33.5007038571927, -70.7769436998523
        ),

        /** 157*/
        FIELD_DBO(
            "Multicancha Los Baguales",
            "Los Baguales 1029",
            "Maipú",
            -33.49975684522426, -70.77024378217212
        ),

        /** 158*/
        FIELD_DBO(
            "Multicancha de la Victoria",
            "Victoria 2470",
            "Maipú",
            -33.50280415437689, -70.7693329847341
        ),

        /** 159*/
        FIELD_DBO(
            "Multicancha Guayaquil",
            "Guayaquil 2215",
            "Maipú",
            -33.503211894177994, -70.77135155638827
        ),

        /** 160*/
        FIELD_DBO(
            "Multicancha Tenerife",
            "Tenerife 3231",
            "Maipú",
            -33.497547743163466, -70.76836883961005
        ),
    )
}