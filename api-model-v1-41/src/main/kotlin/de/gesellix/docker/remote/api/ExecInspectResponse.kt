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
 * @param canRemove
 * @param detachKeys
 * @param ID
 * @param running
 * @param exitCode
 * @param processConfig
 * @param openStdin
 * @param openStderr
 * @param openStdout
 * @param containerID
 * @param pid The system process ID for the exec process.
 */
@JsonClass(generateAdapter = true)
data class ExecInspectResponse(
    @Json(name = "CanRemove")
    var canRemove: kotlin.Boolean? = null,
    @Json(name = "DetachKeys")
    var detachKeys: kotlin.String? = null,
    @Json(name = "ID")
    var ID: kotlin.String? = null,
    @Json(name = "Running")
    var running: kotlin.Boolean? = null,
    @Json(name = "ExitCode")
    var exitCode: kotlin.Int? = null,
    @Json(name = "ProcessConfig")
    var processConfig: ProcessConfig? = null,
    @Json(name = "OpenStdin")
    var openStdin: kotlin.Boolean? = null,
    @Json(name = "OpenStderr")
    var openStderr: kotlin.Boolean? = null,
    @Json(name = "OpenStdout")
    var openStdout: kotlin.Boolean? = null,
    @Json(name = "ContainerID")
    var containerID: kotlin.String? = null,
    // The system process ID for the exec process.
    @Json(name = "Pid")
    var pid: kotlin.Int? = null,
)
