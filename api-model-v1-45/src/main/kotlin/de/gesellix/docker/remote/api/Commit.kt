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
 * Commit holds the Git-commit (SHA1) that a binary was built from, as reported in the version-string of external tools, such as `containerd`, or `runC`.
 *
 * @param ID Actual commit ID of external tool.
 * @param expected Commit ID of external tool expected by dockerd as set at build time.
 */
@JsonClass(generateAdapter = true)
data class Commit(
    // Actual commit ID of external tool.
    @Json(name = "ID")
    var ID: kotlin.String? = null,
    // Commit ID of external tool expected by dockerd as set at build time.
    @Json(name = "Expected")
    var expected: kotlin.String? = null,
)
