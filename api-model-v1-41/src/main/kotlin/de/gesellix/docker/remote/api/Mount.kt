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
 * @param target Container path.
 * @param source Mount source (e.g. a volume name, a host path).
 * @param type The mount type. Available types:  - `bind` Mounts a file or directory from the host into the container. Must exist prior to creating the container. - `volume` Creates a volume with the given name and options (or uses a pre-existing volume with the same name and options). These are **not** removed when the container is removed. - `tmpfs` Create a tmpfs with the given options. The mount source cannot be specified for tmpfs. - `npipe` Mounts a named pipe from the host into the container. Must exist prior to creating the container.
 * @param readOnly Whether the mount should be read-only.
 * @param consistency The consistency requirement for the mount: `default`, `consistent`, `cached`, or `delegated`.
 * @param bindOptions
 * @param volumeOptions
 * @param tmpfsOptions
 */
@JsonClass(generateAdapter = true)
data class Mount(

  /* Container path. */
  @Json(name = "Target")
  var target: kotlin.String? = null,

  /* Mount source (e.g. a volume name, a host path). */
  @Json(name = "Source")
  var source: kotlin.String? = null,

  /* The mount type. Available types:  - `bind` Mounts a file or directory from the host into the container. Must exist prior to creating the container. - `volume` Creates a volume with the given name and options (or uses a pre-existing volume with the same name and options). These are **not** removed when the container is removed. - `tmpfs` Create a tmpfs with the given options. The mount source cannot be specified for tmpfs. - `npipe` Mounts a named pipe from the host into the container. Must exist prior to creating the container.  */
  @Json(name = "Type")
  var type: Mount.Type? = null,

  /* Whether the mount should be read-only. */
  @Json(name = "ReadOnly")
  var readOnly: kotlin.Boolean? = null,

  /* The consistency requirement for the mount: `default`, `consistent`, `cached`, or `delegated`. */
  @Json(name = "Consistency")
  var consistency: kotlin.String? = null,

  @Json(name = "BindOptions")
  var bindOptions: MountBindOptions? = null,

  @Json(name = "VolumeOptions")
  var volumeOptions: MountVolumeOptions? = null,

  @Json(name = "TmpfsOptions")
  var tmpfsOptions: MountTmpfsOptions? = null

) {

  /**
   * The mount type. Available types:  - `bind` Mounts a file or directory from the host into the container. Must exist prior to creating the container. - `volume` Creates a volume with the given name and options (or uses a pre-existing volume with the same name and options). These are **not** removed when the container is removed. - `tmpfs` Create a tmpfs with the given options. The mount source cannot be specified for tmpfs. - `npipe` Mounts a named pipe from the host into the container. Must exist prior to creating the container.
   *
   * Values: Bind,Volume,Tmpfs,Npipe
   */
  enum class Type(val value: kotlin.String) {
    @Json(name = "bind") Bind("bind"),
    @Json(name = "volume") Volume("volume"),
    @Json(name = "tmpfs") Tmpfs("tmpfs"),
    @Json(name = "npipe") Npipe("npipe");
  }
}
