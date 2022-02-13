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
 * @param id The ID of this container
 * @param names The names that this container has been given
 * @param image The name of the image used when creating this container
 * @param imageID The ID of the image that this container was created from
 * @param command Command to run when starting the container
 * @param created When the container was created
 * @param ports The ports exposed by this container
 * @param sizeRw The size of files that have been created or changed by this container
 * @param sizeRootFs The total size of all the files in this container
 * @param labels User-defined key/value metadata.
 * @param state The state of this container (e.g. `Exited`)
 * @param status Additional human-readable status of this container (e.g. `Exit 0`)
 * @param hostConfig
 * @param networkSettings
 * @param mounts
 */
@JsonClass(generateAdapter = true)
data class ContainerSummary(

  /* The ID of this container */
  @Json(name = "Id")
  var id: kotlin.String? = null,

  /* The names that this container has been given */
  @Json(name = "Names")
  var names: kotlin.collections.MutableList<kotlin.String>? = null,

  /* The name of the image used when creating this container */
  @Json(name = "Image")
  var image: kotlin.String? = null,

  /* The ID of the image that this container was created from */
  @Json(name = "ImageID")
  var imageID: kotlin.String? = null,

  /* Command to run when starting the container */
  @Json(name = "Command")
  var command: kotlin.String? = null,

  /* When the container was created */
  @Json(name = "Created")
  var created: kotlin.Long? = null,

  /* The ports exposed by this container */
  @Json(name = "Ports")
  var ports: kotlin.collections.MutableList<Port>? = null,

  /* The size of files that have been created or changed by this container */
  @Json(name = "SizeRw")
  var sizeRw: kotlin.Long? = null,

  /* The total size of all the files in this container */
  @Json(name = "SizeRootFs")
  var sizeRootFs: kotlin.Long? = null,

  /* User-defined key/value metadata. */
  @Json(name = "Labels")
  var labels: kotlin.collections.MutableMap<kotlin.String, kotlin.String>? = null,

  /* The state of this container (e.g. `Exited`) */
  @Json(name = "State")
  var state: kotlin.String? = null,

  /* Additional human-readable status of this container (e.g. `Exit 0`) */
  @Json(name = "Status")
  var status: kotlin.String? = null,

  @Json(name = "HostConfig")
  var hostConfig: ContainerSummaryHostConfig? = null,

  @Json(name = "NetworkSettings")
  var networkSettings: ContainerSummaryNetworkSettings? = null,

  @Json(name = "Mounts")
  var mounts: kotlin.collections.MutableList<Mount>? = null

)
