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
 * HealthcheckResult stores information about a single run of a healthcheck probe
 *
 * @param start Date and time at which this check started in [RFC 3339](https://www.ietf.org/rfc/rfc3339.txt) format with nano-seconds.
 * @param end Date and time at which this check ended in [RFC 3339](https://www.ietf.org/rfc/rfc3339.txt) format with nano-seconds.
 * @param exitCode ExitCode meanings:  - `0` healthy - `1` unhealthy - `2` reserved (considered unhealthy) - other values: error running probe
 * @param output Output from last check
 */
@JsonClass(generateAdapter = true)
data class HealthcheckResult(
    // Date and time at which this check started in [RFC 3339](https://www.ietf.org/rfc/rfc3339.txt) format with nano-seconds.
    @Json(name = "Start")
    var start: java.time.OffsetDateTime? = null,
    // Date and time at which this check ended in [RFC 3339](https://www.ietf.org/rfc/rfc3339.txt) format with nano-seconds.
    @Json(name = "End")
    var end: kotlin.String? = null,
    // ExitCode meanings:  - `0` healthy - `1` unhealthy - `2` reserved (considered unhealthy) - other values: error running probe
    @Json(name = "ExitCode")
    var exitCode: kotlin.Int? = null,
    // Output from last check
    @Json(name = "Output")
    var output: kotlin.String? = null,
)
