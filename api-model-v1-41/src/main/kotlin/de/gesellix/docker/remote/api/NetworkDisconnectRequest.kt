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
 * @param container The ID or name of the container to disconnect from the network.
 * @param force Force the container to disconnect from the network.
 */
@JsonClass(generateAdapter = true)

data class NetworkDisconnectRequest(

    /* The ID or name of the container to disconnect from the network.  */
    @Json(name = "Container")
    var container: kotlin.String? = null,

    /* Force the container to disconnect from the network.  */
    @Json(name = "Force")
    var force: kotlin.Boolean? = null

)
