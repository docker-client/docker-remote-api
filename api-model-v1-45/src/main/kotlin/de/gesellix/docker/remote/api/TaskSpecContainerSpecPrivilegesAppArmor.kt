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
 * Options for configuring AppArmor on the container
 *
 * @param mode
 */
@JsonClass(generateAdapter = true)
data class TaskSpecContainerSpecPrivilegesAppArmor(
    @Json(name = "Mode")
    var mode: TaskSpecContainerSpecPrivilegesAppArmor.Mode? = null,
) {
    /**
     *
     *
     * Values: Default,Disabled
     */
    @JsonClass(generateAdapter = false)
    enum class Mode(val value: kotlin.String) {
        @Json(name = "default")
        Default("default"),

        @Json(name = "disabled")
        Disabled("disabled"),
    }
}
