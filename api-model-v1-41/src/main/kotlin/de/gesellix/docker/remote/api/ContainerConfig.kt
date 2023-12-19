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
 * Configuration for a container that is portable between hosts.  When used as `ContainerConfig` field in an image, `ContainerConfig` is an optional field containing the configuration of the container that was last committed when creating the image.  Previous versions of Docker builder used this field to store build cache, and it is not in active use anymore.
 *
 * @param hostname The hostname to use for the container, as a valid RFC 1123 hostname.
 * @param domainname The domain name to use for the container.
 * @param user The user that commands are run as inside the container.
 * @param attachStdin Whether to attach to `stdin`.
 * @param attachStdout Whether to attach to `stdout`.
 * @param attachStderr Whether to attach to `stderr`.
 * @param exposedPorts An object mapping ports to an empty object in the form:  `{\"<port>/<tcp|udp|sctp>\": {}}`
 * @param tty Attach standard streams to a TTY, including `stdin` if it is not closed.
 * @param openStdin Open `stdin`
 * @param stdinOnce Close `stdin` after one attached client disconnects
 * @param env A list of environment variables to set inside the container in the form `[\"VAR=value\", ...]`. A variable without `=` is removed from the environment, rather than to have an empty value.
 * @param cmd Command to run specified as a string or an array of strings.
 * @param healthcheck
 * @param argsEscaped Command is already escaped (Windows only)
 * @param image The name (or reference) of the image to use when creating the container, or which was used when the container was created.
 * @param volumes An object mapping mount point paths inside the container to empty objects.
 * @param workingDir The working directory for commands to run in.
 * @param entrypoint The entry point for the container as a string or an array of strings.  If the array consists of exactly one empty string (`[\"\"]`) then the entry point is reset to system default (i.e., the entry point used by docker when there is no `ENTRYPOINT` instruction in the `Dockerfile`).
 * @param networkDisabled Disable networking for the container.
 * @param macAddress MAC address of the container.  Deprecated: this field is deprecated in API v1.44 and up. Use EndpointSettings.MacAddress instead.
 * @param onBuild `ONBUILD` metadata that were defined in the image's `Dockerfile`.
 * @param labels User-defined key/value metadata.
 * @param stopSignal Signal to stop a container as a string or unsigned integer.
 * @param stopTimeout Timeout to stop a container in seconds.
 * @param shell Shell for when `RUN`, `CMD`, and `ENTRYPOINT` uses a shell.
 */
@JsonClass(generateAdapter = true)
data class ContainerConfig(
    // The hostname to use for the container, as a valid RFC 1123 hostname.
    @Json(name = "Hostname")
    var hostname: kotlin.String? = null,
    // The domain name to use for the container.
    @Json(name = "Domainname")
    var domainname: kotlin.String? = null,
    // The user that commands are run as inside the container.
    @Json(name = "User")
    var user: kotlin.String? = null,
    // Whether to attach to `stdin`.
    @Json(name = "AttachStdin")
    var attachStdin: kotlin.Boolean? = false,
    // Whether to attach to `stdout`.
    @Json(name = "AttachStdout")
    var attachStdout: kotlin.Boolean? = true,
    // Whether to attach to `stderr`.
    @Json(name = "AttachStderr")
    var attachStderr: kotlin.Boolean? = true,
    // An object mapping ports to an empty object in the form:  `{\"<port>/<tcp|udp|sctp>\": {}}`
    @Json(name = "ExposedPorts")
    var exposedPorts: kotlin.collections.MutableMap<kotlin.String, kotlin.Any>? = null,
    // Attach standard streams to a TTY, including `stdin` if it is not closed.
    @Json(name = "Tty")
    var tty: kotlin.Boolean? = false,
    // Open `stdin`
    @Json(name = "OpenStdin")
    var openStdin: kotlin.Boolean? = false,
    // Close `stdin` after one attached client disconnects
    @Json(name = "StdinOnce")
    var stdinOnce: kotlin.Boolean? = false,
    // A list of environment variables to set inside the container in the form `[\"VAR=value\", ...]`. A variable without `=` is removed from the environment, rather than to have an empty value.
    @Json(name = "Env")
    var env: kotlin.collections.MutableList<kotlin.String>? = null,
    // Command to run specified as a string or an array of strings.
    @Json(name = "Cmd")
    var cmd: kotlin.collections.MutableList<kotlin.String>? = null,
    @Json(name = "Healthcheck")
    var healthcheck: HealthConfig? = null,
    // Command is already escaped (Windows only)
    @Json(name = "ArgsEscaped")
    var argsEscaped: kotlin.Boolean? = null,
    // The name (or reference) of the image to use when creating the container, or which was used when the container was created.
    @Json(name = "Image")
    var image: kotlin.String? = null,
    // An object mapping mount point paths inside the container to empty objects.
    @Json(name = "Volumes")
    var volumes: kotlin.collections.MutableMap<kotlin.String, kotlin.Any>? = null,
    // The working directory for commands to run in.
    @Json(name = "WorkingDir")
    var workingDir: kotlin.String? = null,
    // The entry point for the container as a string or an array of strings.  If the array consists of exactly one empty string (`[\"\"]`) then the entry point is reset to system default (i.e., the entry point used by docker when there is no `ENTRYPOINT` instruction in the `Dockerfile`).
    @Json(name = "Entrypoint")
    var entrypoint: kotlin.collections.MutableList<kotlin.String>? = null,
    // Disable networking for the container.
    @Json(name = "NetworkDisabled")
    var networkDisabled: kotlin.Boolean? = null,
    // MAC address of the container.  Deprecated: this field is deprecated in API v1.44 and up. Use EndpointSettings.MacAddress instead.
    @Json(name = "MacAddress")
    var macAddress: kotlin.String? = null,
    // `ONBUILD` metadata that were defined in the image's `Dockerfile`.
    @Json(name = "OnBuild")
    var onBuild: kotlin.collections.MutableList<kotlin.String>? = null,
    // User-defined key/value metadata.
    @Json(name = "Labels")
    var labels: kotlin.collections.MutableMap<kotlin.String, kotlin.String>? = null,
    // Signal to stop a container as a string or unsigned integer.
    @Json(name = "StopSignal")
    var stopSignal: kotlin.String? = "SIGTERM",
    // Timeout to stop a container in seconds.
    @Json(name = "StopTimeout")
    var stopTimeout: kotlin.Int? = null,
    // Shell for when `RUN`, `CMD`, and `ENTRYPOINT` uses a shell.
    @Json(name = "Shell")
    var shell: kotlin.collections.MutableList<kotlin.String>? = null,
)
