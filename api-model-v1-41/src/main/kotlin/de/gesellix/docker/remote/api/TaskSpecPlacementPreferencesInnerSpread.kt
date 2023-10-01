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
 * @param spreadDescriptor label descriptor, such as `engine.labels.az`.
 */
@JsonClass(generateAdapter = true)

data class TaskSpecPlacementPreferencesInnerSpread(

    /* label descriptor, such as `engine.labels.az`.  */
    @Json(name = "SpreadDescriptor")
    var spreadDescriptor: kotlin.String? = null

)
