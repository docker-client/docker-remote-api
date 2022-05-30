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
 * @param cpuShares An integer value representing this container's relative CPU weight versus other containers.
 * @param memory Memory limit in bytes.
 * @param cgroupParent Path to `cgroups` under which the container's `cgroup` is created. If the path is not absolute, the path is considered to be relative to the `cgroups` path of the init process. Cgroups are created if they do not already exist.
 * @param blkioWeight Block IO weight (relative weight).
 * @param blkioWeightDevice Block IO weight (relative device weight) in the form:  ``` [{\"Path\": \"device_path\", \"Weight\": weight}] ``` 
 * @param blkioDeviceReadBps Limit read rate (bytes per second) from a device, in the form:  ``` [{\"Path\": \"device_path\", \"Rate\": rate}] ```
 * @param blkioDeviceWriteBps Limit write rate (bytes per second) to a device, in the form:  ``` [{\"Path\": \"device_path\", \"Rate\": rate}] ```
 * @param blkioDeviceReadIOps Limit read rate (IO per second) from a device, in the form:  ``` [{\"Path\": \"device_path\", \"Rate\": rate}] ```
 * @param blkioDeviceWriteIOps Limit write rate (IO per second) to a device, in the form:  ``` [{\"Path\": \"device_path\", \"Rate\": rate}] ```
 * @param cpuPeriod The length of a CPU period in microseconds.
 * @param cpuQuota Microseconds of CPU time that the container can get in a CPU period.
 * @param cpuRealtimePeriod The length of a CPU real-time period in microseconds. Set to 0 to allocate no time allocated to real-time tasks.
 * @param cpuRealtimeRuntime The length of a CPU real-time runtime in microseconds. Set to 0 to allocate no time allocated to real-time tasks.
 * @param cpusetCpus CPUs in which to allow execution (e.g., `0-3`, `0,1`).
 * @param cpusetMems Memory nodes (MEMs) in which to allow execution (0-3, 0,1). Only effective on NUMA systems.
 * @param devices A list of devices to add to the container.
 * @param deviceCgroupRules a list of cgroup rules to apply to the container
 * @param deviceRequests A list of requests for devices to be sent to device drivers.
 * @param kernelMemoryTCP Hard limit for kernel TCP buffer memory (in bytes). Depending on the OCI runtime in use, this option may be ignored. It is no longer supported by the default (runc) runtime.  This field is omitted when empty.
 * @param memoryReservation Memory soft limit in bytes.
 * @param memorySwap Total memory limit (memory + swap). Set as `-1` to enable unlimited swap.
 * @param memorySwappiness Tune a container's memory swappiness behavior. Accepts an integer between 0 and 100.
 * @param nanoCpus CPU quota in units of 10<sup>-9</sup> CPUs.
 * @param oomKillDisable Disable OOM Killer for the container.
 * @param `init` Run an init inside the container that forwards signals and reaps processes. This field is omitted if empty, and the default (as configured on the daemon) is used.
 * @param pidsLimit Tune a container's PIDs limit. Set `0` or `-1` for unlimited, or `null` to not change.
 * @param ulimits A list of resource limits to set in the container. For example:  ``` {\"Name\": \"nofile\", \"Soft\": 1024, \"Hard\": 2048} ```
 * @param cpuCount The number of usable CPUs (Windows only).  On Windows Server containers, the processor resource controls are mutually exclusive. The order of precedence is `CPUCount` first, then `CPUShares`, and `CPUPercent` last.
 * @param cpuPercent The usable percentage of the available CPUs (Windows only).  On Windows Server containers, the processor resource controls are mutually exclusive. The order of precedence is `CPUCount` first, then `CPUShares`, and `CPUPercent` last.
 * @param ioMaximumIOps Maximum IOps for the container system drive (Windows only)
 * @param ioMaximumBandwidth Maximum IO in bytes per second for the container system drive (Windows only).
 * @param restartPolicy
 */
@JsonClass(generateAdapter = true)
data class ContainerUpdateRequest(

  /* An integer value representing this container's relative CPU weight versus other containers.  */
  @Json(name = "CpuShares")
  var cpuShares: kotlin.Int? = null,

  /* Memory limit in bytes. */
  @Json(name = "Memory")
  var memory: kotlin.Long? = 0,

  /* Path to `cgroups` under which the container's `cgroup` is created. If the path is not absolute, the path is considered to be relative to the `cgroups` path of the init process. Cgroups are created if they do not already exist.  */
  @Json(name = "CgroupParent")
  var cgroupParent: kotlin.String? = null,

  /* Block IO weight (relative weight). */
  @Json(name = "BlkioWeight")
  var blkioWeight: kotlin.Int? = null,

  /* Block IO weight (relative device weight) in the form:  ``` [{\"Path\": \"device_path\", \"Weight\": weight}] ```  */
  @Json(name = "BlkioWeightDevice")
  var blkioWeightDevice: kotlin.collections.MutableList<ResourcesBlkioWeightDeviceInner>? = null,

  /* Limit read rate (bytes per second) from a device, in the form:  ``` [{\"Path\": \"device_path\", \"Rate\": rate}] ```  */
  @Json(name = "BlkioDeviceReadBps")
  var blkioDeviceReadBps: kotlin.collections.MutableList<ThrottleDevice>? = null,

  /* Limit write rate (bytes per second) to a device, in the form:  ``` [{\"Path\": \"device_path\", \"Rate\": rate}] ```  */
  @Json(name = "BlkioDeviceWriteBps")
  var blkioDeviceWriteBps: kotlin.collections.MutableList<ThrottleDevice>? = null,

  /* Limit read rate (IO per second) from a device, in the form:  ``` [{\"Path\": \"device_path\", \"Rate\": rate}] ```  */
  @Json(name = "BlkioDeviceReadIOps")
  var blkioDeviceReadIOps: kotlin.collections.MutableList<ThrottleDevice>? = null,

  /* Limit write rate (IO per second) to a device, in the form:  ``` [{\"Path\": \"device_path\", \"Rate\": rate}] ```  */
  @Json(name = "BlkioDeviceWriteIOps")
  var blkioDeviceWriteIOps: kotlin.collections.MutableList<ThrottleDevice>? = null,

  /* The length of a CPU period in microseconds. */
  @Json(name = "CpuPeriod")
  var cpuPeriod: kotlin.Long? = null,

  /* Microseconds of CPU time that the container can get in a CPU period.  */
  @Json(name = "CpuQuota")
  var cpuQuota: kotlin.Long? = null,

  /* The length of a CPU real-time period in microseconds. Set to 0 to allocate no time allocated to real-time tasks.  */
  @Json(name = "CpuRealtimePeriod")
  var cpuRealtimePeriod: kotlin.Long? = null,

  /* The length of a CPU real-time runtime in microseconds. Set to 0 to allocate no time allocated to real-time tasks.  */
  @Json(name = "CpuRealtimeRuntime")
  var cpuRealtimeRuntime: kotlin.Long? = null,

  /* CPUs in which to allow execution (e.g., `0-3`, `0,1`).  */
  @Json(name = "CpusetCpus")
  var cpusetCpus: kotlin.String? = null,

  /* Memory nodes (MEMs) in which to allow execution (0-3, 0,1). Only effective on NUMA systems.  */
  @Json(name = "CpusetMems")
  var cpusetMems: kotlin.String? = null,

  /* A list of devices to add to the container. */
  @Json(name = "Devices")
  var devices: kotlin.collections.MutableList<DeviceMapping>? = null,

  /* a list of cgroup rules to apply to the container */
  @Json(name = "DeviceCgroupRules")
  var deviceCgroupRules: kotlin.collections.MutableList<kotlin.String>? = null,

  /* A list of requests for devices to be sent to device drivers.  */
  @Json(name = "DeviceRequests")
  var deviceRequests: kotlin.collections.MutableList<DeviceRequest>? = null,

  /* Hard limit for kernel TCP buffer memory (in bytes). Depending on the OCI runtime in use, this option may be ignored. It is no longer supported by the default (runc) runtime.  This field is omitted when empty.  */
  @Json(name = "KernelMemoryTCP")
  var kernelMemoryTCP: kotlin.Long? = null,

  /* Memory soft limit in bytes. */
  @Json(name = "MemoryReservation")
  var memoryReservation: kotlin.Long? = null,

  /* Total memory limit (memory + swap). Set as `-1` to enable unlimited swap.  */
  @Json(name = "MemorySwap")
  var memorySwap: kotlin.Long? = null,

  /* Tune a container's memory swappiness behavior. Accepts an integer between 0 and 100.  */
  @Json(name = "MemorySwappiness")
  var memorySwappiness: kotlin.Long? = null,

  /* CPU quota in units of 10<sup>-9</sup> CPUs. */
  @Json(name = "NanoCpus")
  var nanoCpus: kotlin.Long? = null,

  /* Disable OOM Killer for the container. */
  @Json(name = "OomKillDisable")
  var oomKillDisable: kotlin.Boolean? = null,

  /* Run an init inside the container that forwards signals and reaps processes. This field is omitted if empty, and the default (as configured on the daemon) is used.  */
  @Json(name = "Init")
  var `init`: kotlin.Boolean? = null,

  /* Tune a container's PIDs limit. Set `0` or `-1` for unlimited, or `null` to not change.  */
  @Json(name = "PidsLimit")
  var pidsLimit: kotlin.Long? = null,

  /* A list of resource limits to set in the container. For example:  ``` {\"Name\": \"nofile\", \"Soft\": 1024, \"Hard\": 2048} ```  */
  @Json(name = "Ulimits")
  var ulimits: kotlin.collections.MutableList<ResourcesUlimitsInner>? = null,

  /* The number of usable CPUs (Windows only).  On Windows Server containers, the processor resource controls are mutually exclusive. The order of precedence is `CPUCount` first, then `CPUShares`, and `CPUPercent` last.  */
  @Json(name = "CpuCount")
  var cpuCount: kotlin.Long? = null,

  /* The usable percentage of the available CPUs (Windows only).  On Windows Server containers, the processor resource controls are mutually exclusive. The order of precedence is `CPUCount` first, then `CPUShares`, and `CPUPercent` last.  */
  @Json(name = "CpuPercent")
  var cpuPercent: kotlin.Long? = null,

  /* Maximum IOps for the container system drive (Windows only) */
  @Json(name = "IOMaximumIOps")
  var ioMaximumIOps: kotlin.Long? = null,

  /* Maximum IO in bytes per second for the container system drive (Windows only).  */
  @Json(name = "IOMaximumBandwidth")
  var ioMaximumBandwidth: kotlin.Long? = null,

  @Json(name = "RestartPolicy")
  var restartPolicy: RestartPolicy? = null

)
