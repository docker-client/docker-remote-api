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
 * Describes the platform which the image in the manifest runs on, as defined in the [OCI Image Index Specification](https://github.com/opencontainers/image-spec/blob/v1.0.1/image-index.md).
 *
 * @param architecture The CPU architecture, for example `amd64` or `ppc64`.
 * @param os The operating system, for example `linux` or `windows`.
 * @param osVersion Optional field specifying the operating system version, for example on Windows `10.0.19041.1165`.
 * @param osFeatures Optional field specifying an array of strings, each listing a required OS feature (for example on Windows `win32k`).
 * @param variant Optional field specifying a variant of the CPU, for example `v7` to specify ARMv7 when architecture is `arm`.
 */
@JsonClass(generateAdapter = true)
data class OCIPlatform(
    // The CPU architecture, for example `amd64` or `ppc64`.
    @Json(name = "architecture")
    var architecture: kotlin.String? = null,
    // The operating system, for example `linux` or `windows`.
    @Json(name = "os")
    var os: kotlin.String? = null,
    // Optional field specifying the operating system version, for example on Windows `10.0.19041.1165`.
    @Json(name = "os.version")
    var osVersion: kotlin.String? = null,
    // Optional field specifying an array of strings, each listing a required OS feature (for example on Windows `win32k`).
    @Json(name = "os.features")
    var osFeatures: kotlin.collections.MutableList<kotlin.String>? = null,
    // Optional field specifying a variant of the CPU, for example `v7` to specify ARMv7 when architecture is `arm`.
    @Json(name = "variant")
    var variant: kotlin.String? = null,
)
