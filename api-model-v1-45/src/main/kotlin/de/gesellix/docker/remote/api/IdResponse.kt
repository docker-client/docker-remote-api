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
    "UnusedImport",
)

package de.gesellix.docker.remote.api

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * Response to an API call that returns just an Id
 *
 * @param id The id of the newly created object.
 */
@JsonClass(generateAdapter = true)
data class IdResponse(
    // The id of the newly created object.
    @Json(name = "Id")
    var id: kotlin.String,
)
