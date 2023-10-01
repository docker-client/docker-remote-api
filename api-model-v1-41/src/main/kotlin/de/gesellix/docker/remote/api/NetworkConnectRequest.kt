/**
 *
 * Please note:
 * This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * Do not edit this file manually.
 *
 */

@file:Suppress(
    "ArrayInDataClass",
    "EnumEntryName",
    "RemoveRedundantQualifierName",
    "UnusedImport"
)

package de.gesellix.docker.remote.api

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 *
 *
 * @param container The ID or name of the container to connect to the network.
 * @param endpointConfig
 */
@JsonClass(generateAdapter = true)

data class NetworkConnectRequest(

    /* The ID or name of the container to connect to the network. */
    @Json(name = "Container")
    var container: kotlin.String? = null,

    @Json(name = "EndpointConfig")
    var endpointConfig: EndpointSettings? = null

)
