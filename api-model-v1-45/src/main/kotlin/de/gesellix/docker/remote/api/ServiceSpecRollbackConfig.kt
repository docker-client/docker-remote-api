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
 * Specification for the rollback strategy of the service.
 *
 * @param parallelism Maximum number of tasks to be rolled back in one iteration (0 means unlimited parallelism).
 * @param delay Amount of time between rollback iterations, in nanoseconds.
 * @param failureAction Action to take if an rolled back task fails to run, or stops running during the rollback.
 * @param monitor Amount of time to monitor each rolled back task for failures, in nanoseconds.
 * @param maxFailureRatio The fraction of tasks that may fail during a rollback before the failure action is invoked, specified as a floating point number between 0 and 1.
 * @param order The order of operations when rolling back a task. Either the old task is shut down before the new task is started, or the new task is started before the old task is shut down.
 */
@JsonClass(generateAdapter = true)
data class ServiceSpecRollbackConfig(
    // Maximum number of tasks to be rolled back in one iteration (0 means unlimited parallelism).
    @Json(name = "Parallelism")
    var parallelism: kotlin.Long? = null,
    // Amount of time between rollback iterations, in nanoseconds.
    @Json(name = "Delay")
    var delay: kotlin.Long? = null,
    // Action to take if an rolled back task fails to run, or stops running during the rollback.
    @Json(name = "FailureAction")
    var failureAction: ServiceSpecRollbackConfig.FailureAction? = null,
    // Amount of time to monitor each rolled back task for failures, in nanoseconds.
    @Json(name = "Monitor")
    var monitor: kotlin.Long? = null,
    // The fraction of tasks that may fail during a rollback before the failure action is invoked, specified as a floating point number between 0 and 1.
    @Json(name = "MaxFailureRatio")
    var maxFailureRatio: java.math.BigDecimal? = null,
    // The order of operations when rolling back a task. Either the old task is shut down before the new task is started, or the new task is started before the old task is shut down.
    @Json(name = "Order")
    var order: ServiceSpecRollbackConfig.Order? = null,
) {
    /**
     * Action to take if an rolled back task fails to run, or stops running during the rollback.
     *
     * Values: Continue,Pause
     */
    @JsonClass(generateAdapter = false)
    enum class FailureAction(val value: kotlin.String) {
        @Json(name = "continue")
        Continue("continue"),

        @Json(name = "pause")
        Pause("pause"),
    }

    /**
     * The order of operations when rolling back a task. Either the old task is shut down before the new task is started, or the new task is started before the old task is shut down.
     *
     * Values: StopMinusFirst,StartMinusFirst
     */
    @JsonClass(generateAdapter = false)
    enum class Order(val value: kotlin.String) {
        @Json(name = "stop-first")
        StopMinusFirst("stop-first"),

        @Json(name = "start-first")
        StartMinusFirst("start-first"),
    }
}