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
 * @param current
 * @param total
 */
@JsonClass(generateAdapter = true)

data class ProgressDetail(

    @Json(name = "current")
    var current: kotlin.Int? = null,

    @Json(name = "total")
    var total: kotlin.Int? = null

)
