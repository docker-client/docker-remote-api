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
 *
 *
 * @param type
 * @param name
 */
@JsonClass(generateAdapter = true)
data class EngineDescriptionPluginsInner(
    @Json(name = "Type")
    var type: kotlin.String? = null,
    @Json(name = "Name")
    var name: kotlin.String? = null,
)
