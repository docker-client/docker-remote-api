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
 * NodeState represents the state of a node.
 *
 * Values: Unknown,Down,Ready,Disconnected
 */

@JsonClass(generateAdapter = false)
enum class NodeState(val value: kotlin.String) {
    @Json(name = "unknown")
    Unknown("unknown"),

    @Json(name = "down")
    Down("down"),

    @Json(name = "ready")
    Ready("ready"),

    @Json(name = "disconnected")
    Disconnected("disconnected"),
    ;

    /**
     * Override [toString()] to avoid using the enum variable name as the value, and instead use
     * the actual value defined in the API spec file.
     *
     * This solves a problem when the variable name and its value are different, and ensures that
     * the client sends the correct enum values to the server always.
     */
    override fun toString(): kotlin.String = value

    companion object {
        /**
         * Converts the provided [data] to a [String] on success, null otherwise.
         */
        fun encode(data: kotlin.Any?): kotlin.String? = if (data is NodeState) "$data" else null

        /**
         * Returns a valid [NodeState] for [data], null otherwise.
         */
        fun decode(data: kotlin.Any?): NodeState? =
            data?.let {
                val normalizedData = "$it".lowercase()
                values().firstOrNull { value ->
                    it == value || normalizedData == "$value".lowercase()
                }
            }
    }
}
