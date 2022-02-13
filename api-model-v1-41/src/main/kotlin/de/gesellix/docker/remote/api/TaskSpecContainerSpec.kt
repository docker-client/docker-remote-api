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
 * Container spec for the service.  <p><br /></p>  > **Note**: ContainerSpec, NetworkAttachmentSpec, and PluginSpec are > mutually exclusive. PluginSpec is only used when the Runtime field > is set to `plugin`. NetworkAttachmentSpec is used when the Runtime > field is set to `attachment`.
 *
 * @param image The image name to use for the container
 * @param labels User-defined key/value data.
 * @param command The command to be run in the image.
 * @param args Arguments to the command.
 * @param hostname The hostname to use for the container, as a valid [RFC 1123](https://tools.ietf.org/html/rfc1123) hostname.
 * @param env A list of environment variables in the form `VAR=value`.
 * @param dir The working directory for commands to run in.
 * @param user The user inside the container.
 * @param groups A list of additional groups that the container process will run as.
 * @param privileges
 * @param TTY Whether a pseudo-TTY should be allocated.
 * @param openStdin Open `stdin`
 * @param readOnly Mount the container's root filesystem as read only.
 * @param mounts Specification for mounts to be added to containers created as part of the service.
 * @param stopSignal Signal to stop the container.
 * @param stopGracePeriod Amount of time to wait for the container to terminate before forcefully killing it.
 * @param healthCheck
 * @param hosts A list of hostname/IP mappings to add to the container's `hosts` file. The format of extra hosts is specified in the [hosts(5)](http://man7.org/linux/man-pages/man5/hosts.5.html) man page:      IP_address canonical_hostname [aliases]
 * @param dnSConfig
 * @param secrets Secrets contains references to zero or more secrets that will be exposed to the service.
 * @param configs Configs contains references to zero or more configs that will be exposed to the service.
 * @param isolation Isolation technology of the containers running the service. (Windows only)
 * @param `init` Run an init inside the container that forwards signals and reaps processes. This field is omitted if empty, and the default (as configured on the daemon) is used.
 * @param sysctls Set kernel namedspaced parameters (sysctls) in the container. The Sysctls option on services accepts the same sysctls as the are supported on containers. Note that while the same sysctls are supported, no guarantees or checks are made about their suitability for a clustered environment, and it's up to the user to determine whether a given sysctl will work properly in a Service.
 * @param capabilityAdd A list of kernel capabilities to add to the default set for the container.
 * @param capabilityDrop A list of kernel capabilities to drop from the default set for the container.
 * @param ulimits A list of resource limits to set in the container. For example: `{\"Name\": \"nofile\", \"Soft\": 1024, \"Hard\": 2048}`\"
 */
@JsonClass(generateAdapter = true)
data class TaskSpecContainerSpec(

  /* The image name to use for the container */
  @Json(name = "Image")
  var image: kotlin.String? = null,

  /* User-defined key/value data. */
  @Json(name = "Labels")
  var labels: kotlin.collections.MutableMap<kotlin.String, kotlin.String>? = null,

  /* The command to be run in the image. */
  @Json(name = "Command")
  var command: kotlin.collections.MutableList<kotlin.String>? = null,

  /* Arguments to the command. */
  @Json(name = "Args")
  var args: kotlin.collections.MutableList<kotlin.String>? = null,

  /* The hostname to use for the container, as a valid [RFC 1123](https://tools.ietf.org/html/rfc1123) hostname.  */
  @Json(name = "Hostname")
  var hostname: kotlin.String? = null,

  /* A list of environment variables in the form `VAR=value`.  */
  @Json(name = "Env")
  var env: kotlin.collections.MutableList<kotlin.String>? = null,

  /* The working directory for commands to run in. */
  @Json(name = "Dir")
  var dir: kotlin.String? = null,

  /* The user inside the container. */
  @Json(name = "User")
  var user: kotlin.String? = null,

  /* A list of additional groups that the container process will run as.  */
  @Json(name = "Groups")
  var groups: kotlin.collections.MutableList<kotlin.String>? = null,

  @Json(name = "Privileges")
  var privileges: TaskSpecContainerSpecPrivileges? = null,

  /* Whether a pseudo-TTY should be allocated. */
  @Json(name = "TTY")
  var TTY: kotlin.Boolean? = null,

  /* Open `stdin` */
  @Json(name = "OpenStdin")
  var openStdin: kotlin.Boolean? = null,

  /* Mount the container's root filesystem as read only. */
  @Json(name = "ReadOnly")
  var readOnly: kotlin.Boolean? = null,

  /* Specification for mounts to be added to containers created as part of the service.  */
  @Json(name = "Mounts")
  var mounts: kotlin.collections.MutableList<Mount>? = null,

  /* Signal to stop the container. */
  @Json(name = "StopSignal")
  var stopSignal: kotlin.String? = null,

  /* Amount of time to wait for the container to terminate before forcefully killing it.  */
  @Json(name = "StopGracePeriod")
  var stopGracePeriod: kotlin.Long? = null,

  @Json(name = "HealthCheck")
  var healthCheck: HealthConfig? = null,

  /* A list of hostname/IP mappings to add to the container's `hosts` file. The format of extra hosts is specified in the [hosts(5)](http://man7.org/linux/man-pages/man5/hosts.5.html) man page:      IP_address canonical_hostname [aliases]  */
  @Json(name = "Hosts")
  var hosts: kotlin.collections.MutableList<kotlin.String>? = null,

  @Json(name = "DNSConfig")
  var dnSConfig: TaskSpecContainerSpecDNSConfig? = null,

  /* Secrets contains references to zero or more secrets that will be exposed to the service.  */
  @Json(name = "Secrets")
  var secrets: kotlin.collections.MutableList<TaskSpecContainerSpecSecrets>? = null,

  /* Configs contains references to zero or more configs that will be exposed to the service.  */
  @Json(name = "Configs")
  var configs: kotlin.collections.MutableList<TaskSpecContainerSpecConfigs>? = null,

  /* Isolation technology of the containers running the service. (Windows only)  */
  @Json(name = "Isolation")
  var isolation: TaskSpecContainerSpec.Isolation? = null,

  /* Run an init inside the container that forwards signals and reaps processes. This field is omitted if empty, and the default (as configured on the daemon) is used.  */
  @Json(name = "Init")
  var `init`: kotlin.Boolean? = null,

  /* Set kernel namedspaced parameters (sysctls) in the container. The Sysctls option on services accepts the same sysctls as the are supported on containers. Note that while the same sysctls are supported, no guarantees or checks are made about their suitability for a clustered environment, and it's up to the user to determine whether a given sysctl will work properly in a Service.  */
  @Json(name = "Sysctls")
  var sysctls: kotlin.collections.MutableMap<kotlin.String, kotlin.String>? = null,

  /* A list of kernel capabilities to add to the default set for the container.  */
  @Json(name = "CapabilityAdd")
  var capabilityAdd: kotlin.collections.MutableList<kotlin.String>? = null,

  /* A list of kernel capabilities to drop from the default set for the container.  */
  @Json(name = "CapabilityDrop")
  var capabilityDrop: kotlin.collections.MutableList<kotlin.String>? = null,

  /* A list of resource limits to set in the container. For example: `{\"Name\": \"nofile\", \"Soft\": 1024, \"Hard\": 2048}`\"  */
  @Json(name = "Ulimits")
  var ulimits: kotlin.collections.MutableList<ResourcesUlimits>? = null

) {

  /**
   * Isolation technology of the containers running the service. (Windows only)
   *
   * Values: Default,Process,Hyperv
   */
  enum class Isolation(val value: kotlin.String) {
    @Json(name = "default") Default("default"),
    @Json(name = "process") Process("process"),
    @Json(name = "hyperv") Hyperv("hyperv");
  }
}
