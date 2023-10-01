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
    var secrets: kotlin.collections.MutableList<TaskSpecContainerSpecSecretsInner>? = null,

    /* Configs contains references to zero or more configs that will be exposed to the service.  */
    @Json(name = "Configs")
    var configs: kotlin.collections.MutableList<TaskSpecContainerSpecConfigsInner>? = null,

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
    var ulimits: kotlin.collections.MutableList<ResourcesUlimitsInner>? = null

) {

    /**
     * Isolation technology of the containers running the service. (Windows only)
     *
     * Values: Default,Process,Hyperv
     */
    @JsonClass(generateAdapter = false)
    enum class Isolation(val value: kotlin.String) {
        @Json(name = "default")
        Default("default"),

        @Json(name = "process")
        Process("process"),

        @Json(name = "hyperv")
        Hyperv("hyperv");
    }
}
