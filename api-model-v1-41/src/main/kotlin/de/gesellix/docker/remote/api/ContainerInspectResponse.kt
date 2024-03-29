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
 * @param id The ID of the container
 * @param created The time the container was created
 * @param path The path to the command being run
 * @param args The arguments to the command being run
 * @param state
 * @param image The container's image ID
 * @param resolvConfPath
 * @param hostnamePath
 * @param hostsPath
 * @param logPath
 * @param name
 * @param restartCount
 * @param driver
 * @param platform
 * @param mountLabel
 * @param processLabel
 * @param appArmorProfile
 * @param execIDs IDs of exec instances that are running in the container.
 * @param hostConfig
 * @param graphDriver
 * @param sizeRw The size of files that have been created or changed by this container.
 * @param sizeRootFs The total size of all the files in this container.
 * @param mounts
 * @param config
 * @param networkSettings
 */
@JsonClass(generateAdapter = true)
data class ContainerInspectResponse(
    // The ID of the container
    @Json(name = "Id")
    var id: kotlin.String? = null,
    // The time the container was created
    @Json(name = "Created")
    var created: kotlin.String? = null,
    // The path to the command being run
    @Json(name = "Path")
    var path: kotlin.String? = null,
    // The arguments to the command being run
    @Json(name = "Args")
    var args: kotlin.collections.MutableList<kotlin.String>? = null,
    @Json(name = "State")
    var state: ContainerState? = null,
    // The container's image ID
    @Json(name = "Image")
    var image: kotlin.String? = null,
    @Json(name = "ResolvConfPath")
    var resolvConfPath: kotlin.String? = null,
    @Json(name = "HostnamePath")
    var hostnamePath: kotlin.String? = null,
    @Json(name = "HostsPath")
    var hostsPath: kotlin.String? = null,
    @Json(name = "LogPath")
    var logPath: kotlin.String? = null,
    @Json(name = "Name")
    var name: kotlin.String? = null,
    @Json(name = "RestartCount")
    var restartCount: kotlin.Int? = null,
    @Json(name = "Driver")
    var driver: kotlin.String? = null,
    @Json(name = "Platform")
    var platform: kotlin.String? = null,
    @Json(name = "MountLabel")
    var mountLabel: kotlin.String? = null,
    @Json(name = "ProcessLabel")
    var processLabel: kotlin.String? = null,
    @Json(name = "AppArmorProfile")
    var appArmorProfile: kotlin.String? = null,
    // IDs of exec instances that are running in the container.
    @Json(name = "ExecIDs")
    var execIDs: kotlin.collections.MutableList<kotlin.String>? = null,
    @Json(name = "HostConfig")
    var hostConfig: HostConfig? = null,
    @Json(name = "GraphDriver")
    var graphDriver: GraphDriverData? = null,
    // The size of files that have been created or changed by this container.
    @Json(name = "SizeRw")
    var sizeRw: kotlin.Long? = null,
    // The total size of all the files in this container.
    @Json(name = "SizeRootFs")
    var sizeRootFs: kotlin.Long? = null,
    @Json(name = "Mounts")
    var mounts: kotlin.collections.MutableList<MountPoint>? = null,
    @Json(name = "Config")
    var config: ContainerConfig? = null,
    @Json(name = "NetworkSettings")
    var networkSettings: NetworkSettings? = null,
)
