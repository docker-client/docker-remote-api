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
 * Specification for the restart policy which applies to containers created as part of this service.
 *
 * @param condition Condition for restart.
 * @param delay Delay between restart attempts.
 * @param maxAttempts Maximum attempts to restart a given container before giving up (default value is 0, which is ignored).
 * @param window Windows is the time window used to evaluate the restart policy (default value is 0, which is unbounded).
 */
@JsonClass(generateAdapter = true)
data class TaskSpecRestartPolicy(
    // Condition for restart.
    @Json(name = "Condition")
    var condition: TaskSpecRestartPolicy.Condition? = null,
    // Delay between restart attempts.
    @Json(name = "Delay")
    var delay: kotlin.Long? = null,
    // Maximum attempts to restart a given container before giving up (default value is 0, which is ignored).
    @Json(name = "MaxAttempts")
    var maxAttempts: kotlin.Long? = 0L,
    // Windows is the time window used to evaluate the restart policy (default value is 0, which is unbounded).
    @Json(name = "Window")
    var window: kotlin.Long? = 0L,
) {
    /**
     * Condition for restart.
     *
     * Values: None,OnMinusFailure,Any
     */
    @JsonClass(generateAdapter = false)
    enum class Condition(val value: kotlin.String) {
        @Json(name = "none")
        None("none"),

        @Json(name = "on-failure")
        OnMinusFailure("on-failure"),

        @Json(name = "any")
        Any("any"),
    }
}