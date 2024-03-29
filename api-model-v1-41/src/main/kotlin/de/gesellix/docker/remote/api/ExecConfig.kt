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
 * @param attachStdin Attach to `stdin` of the exec command.
 * @param attachStdout Attach to `stdout` of the exec command.
 * @param attachStderr Attach to `stderr` of the exec command.
 * @param consoleSize Initial console size, as an `[height, width]` array.
 * @param detachKeys Override the key sequence for detaching a container. Format is a single character `[a-Z]` or `ctrl-<value>` where `<value>` is one of: `a-z`, `@`, `^`, `[`, `,` or `_`.
 * @param tty Allocate a pseudo-TTY.
 * @param env A list of environment variables in the form `[\"VAR=value\", ...]`.
 * @param cmd Command to run, as a string or array of strings.
 * @param privileged Runs the exec process with extended privileges.
 * @param user The user, and optionally, group to run the exec process inside the container. Format is one of: `user`, `user:group`, `uid`, or `uid:gid`.
 * @param workingDir The working directory for the exec process inside the container.
 */
@JsonClass(generateAdapter = true)
data class ExecConfig(
    // Attach to `stdin` of the exec command.
    @Json(name = "AttachStdin")
    var attachStdin: kotlin.Boolean? = null,
    // Attach to `stdout` of the exec command.
    @Json(name = "AttachStdout")
    var attachStdout: kotlin.Boolean? = null,
    // Attach to `stderr` of the exec command.
    @Json(name = "AttachStderr")
    var attachStderr: kotlin.Boolean? = null,
    // Initial console size, as an `[height, width]` array.
    @Json(name = "ConsoleSize")
    var consoleSize: kotlin.collections.MutableList<kotlin.Int>? = null,
    // Override the key sequence for detaching a container. Format is a single character `[a-Z]` or `ctrl-<value>` where `<value>` is one of: `a-z`, `@`, `^`, `[`, `,` or `_`.
    @Json(name = "DetachKeys")
    var detachKeys: kotlin.String? = null,
    // Allocate a pseudo-TTY.
    @Json(name = "Tty")
    var tty: kotlin.Boolean? = null,
    // A list of environment variables in the form `[\"VAR=value\", ...]`.
    @Json(name = "Env")
    var env: kotlin.collections.MutableList<kotlin.String>? = null,
    // Command to run, as a string or array of strings.
    @Json(name = "Cmd")
    var cmd: kotlin.collections.MutableList<kotlin.String>? = null,
    // Runs the exec process with extended privileges.
    @Json(name = "Privileged")
    var privileged: kotlin.Boolean? = false,
    // The user, and optionally, group to run the exec process inside the container. Format is one of: `user`, `user:group`, `uid`, or `uid:gid`.
    @Json(name = "User")
    var user: kotlin.String? = null,
    // The working directory for the exec process inside the container.
    @Json(name = "WorkingDir")
    var workingDir: kotlin.String? = null,
)
