package com.example.android.onematchproject.utils

import org.json.JSONObject

/**
    Step 1: Define your Google Pay API version

        Declare the version of the Google Pay API that your application uses.
    The major and minor versions affect the fields expected in  each  passed
    object and are included in the response.

        Create a base request object that contains properties that are present
    in all other request objects.
 */

private val baseRequest = JSONObject().apply {
    put("apiVersion", 2)
    put("apiVersionMinor", 0)
}

/**
    Step 2: Request a payment token for your payment provider

        Google encrypts information about a payer's selected card for secure
    processing by a payment provider.


        Google encripta la información sobre la tarjeta seleccionada por el paga_
    dor para procesarla de forma segura mediante un proveedor de pago.
 */

private fun gatewayTokenizationSpecification(): JSONObject {
    return JSONObject().apply {
        put("type", "PAYMENT_GATEWAY")
        put("parameters", JSONObject(mapOf(
            "gateway" to "example",
            "gatewayMerchantId" to "exampleGatewayMerchantId")))
    }
}
