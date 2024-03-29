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
 * Platform represents the platform (Arch/OS).
 *
 * @param architecture Architecture represents the hardware architecture (for example, `x86_64`).
 * @param OS OS represents the Operating System (for example, `linux` or `windows`).
 */
@JsonClass(generateAdapter = true)
data class Platform(
    // Architecture represents the hardware architecture (for example, `x86_64`).
    @Json(name = "Architecture")
    var architecture: kotlin.String? = null,
    // OS represents the Operating System (for example, `linux` or `windows`).
    @Json(name = "OS")
    var OS: kotlin.String? = null,
)
