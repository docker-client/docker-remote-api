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
 * OK response to ContainerTop operation
 *
 * @param titles The ps column titles
 * @param processes Each process running in the container, where each is process is an array of values corresponding to the titles.
 */
@JsonClass(generateAdapter = true)
data class ContainerTopResponse(
    // The ps column titles
    @Json(name = "Titles")
    var titles: kotlin.collections.MutableList<kotlin.String>? = null,
    // Each process running in the container, where each is process is an array of values corresponding to the titles.
    @Json(name = "Processes")
    var processes: kotlin.collections.MutableList<kotlin.collections.MutableList<kotlin.String>>? = null,
)