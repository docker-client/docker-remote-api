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
 * @param code
 * @param message
 */
@JsonClass(generateAdapter = true)

data class ErrorDetail(

    @Json(name = "code")
    var code: kotlin.Int? = null,

    @Json(name = "message")
    var message: kotlin.String? = null

)
