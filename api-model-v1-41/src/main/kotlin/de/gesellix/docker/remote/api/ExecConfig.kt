/**
 * Docker Engine API
 *
 * The Engine API is an HTTP API served by Docker Engine. It is the API the Docker client uses to communicate with the Engine, so everything the Docker client can do can be done with the API.  Most of the client's commands map directly to API endpoints (e.g. `docker ps` is `GET /containers/json`). The notable exception is running containers, which consists of several API calls.  # Errors  The API uses standard HTTP status codes to indicate the success or failure of the API call. The body of the response will be JSON in the following format:  ``` {   \"message\": \"page not found\" } ```  # Versioning  The API is usually changed in each release, so API calls are versioned to ensure that clients don't break. To lock to a specific version of the API, you prefix the URL with its version, for example, call `/v1.30/info` to use the v1.30 version of the `/info` endpoint. If the API version specified in the URL is not supported by the daemon, a HTTP `400 Bad Request` error message is returned.  If you omit the version-prefix, the current version of the API (v1.41) is used. For example, calling `/info` is the same as calling `/v1.41/info`. Using the API without a version-prefix is deprecated and will be removed in a future release.  Engine releases in the near future should support this version of the API, so your client will continue to work even if it is talking to a newer Engine.  The API uses an open schema model, which means server may add extra properties to responses. Likewise, the server will ignore any extra query parameters and request body properties. When you write clients, you need to ignore additional properties in responses to ensure they do not break when talking to newer daemons.   # Authentication  Authentication for registries is handled client side. The client has to send authentication details to various endpoints that need to communicate with registries, such as `POST /images/(name)/push`. These are sent as `X-Registry-Auth` header as a [base64url encoded](https://tools.ietf.org/html/rfc4648#section-5) (JSON) string with the following structure:  ``` {   \"username\": \"string\",   \"password\": \"string\",   \"email\": \"string\",   \"serveraddress\": \"string\" } ```  The `serveraddress` is a domain/IP without a protocol. Throughout this structure, double quotes are required.  If you have already got an identity token from the [`/auth` endpoint](#operation/SystemAuth), you can just pass this instead of credentials:  ``` {   \"identitytoken\": \"9cbaf023786cd7...\" } ``` 
 *
 * The version of the OpenAPI document: 1.41
 *
 *
 * Please note:
 * This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * Do not edit this file manually.
 */

@file:Suppress(
  "ArrayInDataClass",
  "EnumEntryName",
  "RemoveRedundantQualifierName",
  "UnusedImport"
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

  /* Attach to `stdin` of the exec command. */
  @Json(name = "AttachStdin")
  var attachStdin: kotlin.Boolean? = null,

  /* Attach to `stdout` of the exec command. */
  @Json(name = "AttachStdout")
  var attachStdout: kotlin.Boolean? = null,

  /* Attach to `stderr` of the exec command. */
  @Json(name = "AttachStderr")
  var attachStderr: kotlin.Boolean? = null,

  /* Override the key sequence for detaching a container. Format is a single character `[a-Z]` or `ctrl-<value>` where `<value>` is one of: `a-z`, `@`, `^`, `[`, `,` or `_`.  */
  @Json(name = "DetachKeys")
  var detachKeys: kotlin.String? = null,

  /* Allocate a pseudo-TTY. */
  @Json(name = "Tty")
  var tty: kotlin.Boolean? = null,

  /* A list of environment variables in the form `[\"VAR=value\", ...]`.  */
  @Json(name = "Env")
  var env: kotlin.collections.MutableList<kotlin.String>? = null,

  /* Command to run, as a string or array of strings. */
  @Json(name = "Cmd")
  var cmd: kotlin.collections.MutableList<kotlin.String>? = null,

  /* Runs the exec process with extended privileges. */
  @Json(name = "Privileged")
  var privileged: kotlin.Boolean? = false,

  /* The user, and optionally, group to run the exec process inside the container. Format is one of: `user`, `user:group`, `uid`, or `uid:gid`.  */
  @Json(name = "User")
  var user: kotlin.String? = null,

  /* The working directory for the exec process inside the container.  */
  @Json(name = "WorkingDir")
  var workingDir: kotlin.String? = null

)
