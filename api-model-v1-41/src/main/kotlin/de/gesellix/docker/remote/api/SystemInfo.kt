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
 * @param ID Unique identifier of the daemon.  <p><br /></p>  > **Note**: The format of the ID itself is not part of the API, and > should not be considered stable.
 * @param containers Total number of containers on the host.
 * @param containersRunning Number of containers with status `\"running\"`.
 * @param containersPaused Number of containers with status `\"paused\"`.
 * @param containersStopped Number of containers with status `\"stopped\"`.
 * @param images Total number of images on the host.  Both _tagged_ and _untagged_ (dangling) images are counted.
 * @param driver Name of the storage driver in use.
 * @param driverStatus Information specific to the storage driver, provided as \"label\" / \"value\" pairs.  This information is provided by the storage driver, and formatted in a way consistent with the output of `docker info` on the command line.  <p><br /></p>  > **Note**: The information returned in this field, including the > formatting of values and labels, should not be considered stable, > and may change without notice.
 * @param dockerRootDir Root directory of persistent Docker state.  Defaults to `/var/lib/docker` on Linux, and `C:\\ProgramData\\docker` on Windows.
 * @param plugins
 * @param memoryLimit Indicates if the host has memory limit support enabled.
 * @param swapLimit Indicates if the host has memory swap limit support enabled.
 * @param kernelMemoryTCP Indicates if the host has kernel memory TCP limit support enabled. This field is omitted if not supported.  Kernel memory TCP limits are not supported when using cgroups v2, which does not support the corresponding `memory.kmem.tcp.limit_in_bytes` cgroup.
 * @param cpuCfsPeriod Indicates if CPU CFS(Completely Fair Scheduler) period is supported by the host.
 * @param cpuCfsQuota Indicates if CPU CFS(Completely Fair Scheduler) quota is supported by the host.
 * @param cpUShares Indicates if CPU Shares limiting is supported by the host.
 * @param cpUSet Indicates if CPUsets (cpuset.cpus, cpuset.mems) are supported by the host.  See [cpuset(7)](https://www.kernel.org/doc/Documentation/cgroup-v1/cpusets.txt)
 * @param pidsLimit Indicates if the host kernel has PID limit support enabled.
 * @param oomKillDisable Indicates if OOM killer disable is supported on the host.
 * @param ipv4Forwarding Indicates IPv4 forwarding is enabled.
 * @param bridgeNfIptables Indicates if `bridge-nf-call-iptables` is available on the host.
 * @param bridgeNfIp6tables Indicates if `bridge-nf-call-ip6tables` is available on the host.
 * @param debug Indicates if the daemon is running in debug-mode / with debug-level logging enabled.
 * @param nfd The total number of file Descriptors in use by the daemon process.  This information is only returned if debug-mode is enabled.
 * @param ngoroutines The  number of goroutines that currently exist.  This information is only returned if debug-mode is enabled.
 * @param systemTime Current system-time in [RFC 3339](https://www.ietf.org/rfc/rfc3339.txt) format with nano-seconds.
 * @param loggingDriver The logging driver to use as a default for new containers.
 * @param cgroupDriver The driver to use for managing cgroups.
 * @param cgroupVersion The version of the cgroup.
 * @param neventsListener Number of event listeners subscribed.
 * @param kernelVersion Kernel version of the host.  On Linux, this information obtained from `uname`. On Windows this information is queried from the <kbd>HKEY_LOCAL_MACHINE\\\\SOFTWARE\\\\Microsoft\\\\Windows NT\\\\CurrentVersion\\\\</kbd> registry value, for example _\"10.0 14393 (14393.1198.amd64fre.rs1_release_sec.170427-1353)\"_.
 * @param operatingSystem Name of the host's operating system, for example: \"Ubuntu 16.04.2 LTS\" or \"Windows Server 2016 Datacenter\"
 * @param osVersion Version of the host's operating system  <p><br /></p>  > **Note**: The information returned in this field, including its > very existence, and the formatting of values, should not be considered > stable, and may change without notice.
 * @param osType Generic type of the operating system of the host, as returned by the Go runtime (`GOOS`).  Currently returned values are \"linux\" and \"windows\". A full list of possible values can be found in the [Go documentation](https://golang.org/doc/install/source#environment).
 * @param architecture Hardware architecture of the host, as returned by the Go runtime (`GOARCH`).  A full list of possible values can be found in the [Go documentation](https://golang.org/doc/install/source#environment).
 * @param NCPU The number of logical CPUs usable by the daemon.  The number of available CPUs is checked by querying the operating system when the daemon starts. Changes to operating system CPU allocation after the daemon is started are not reflected.
 * @param memTotal Total amount of physical memory available on the host, in bytes.
 * @param indexServerAddress Address / URL of the index server that is used for image search, and as a default for user authentication for Docker Hub and Docker Cloud.
 * @param registryConfig
 * @param genericResources User-defined resources can be either Integer resources (e.g, `SSD=3`) or String resources (e.g, `GPU=UUID1`).
 * @param httpProxy HTTP-proxy configured for the daemon. This value is obtained from the [`HTTP_PROXY`](https://www.gnu.org/software/wget/manual/html_node/Proxies.html) environment variable. Credentials ([user info component](https://tools.ietf.org/html/rfc3986#section-3.2.1)) in the proxy URL are masked in the API response.  Containers do not automatically inherit this configuration.
 * @param httpsProxy HTTPS-proxy configured for the daemon. This value is obtained from the [`HTTPS_PROXY`](https://www.gnu.org/software/wget/manual/html_node/Proxies.html) environment variable. Credentials ([user info component](https://tools.ietf.org/html/rfc3986#section-3.2.1)) in the proxy URL are masked in the API response.  Containers do not automatically inherit this configuration.
 * @param noProxy Comma-separated list of domain extensions for which no proxy should be used. This value is obtained from the [`NO_PROXY`](https://www.gnu.org/software/wget/manual/html_node/Proxies.html) environment variable.  Containers do not automatically inherit this configuration.
 * @param name Hostname of the host.
 * @param labels User-defined labels (key/value metadata) as set on the daemon.  <p><br /></p>  > **Note**: When part of a Swarm, nodes can both have _daemon_ labels, > set through the daemon configuration, and _node_ labels, set from a > manager node in the Swarm. Node labels are not included in this > field. Node labels can be retrieved using the `/nodes/(id)` endpoint > on a manager node in the Swarm.
 * @param experimentalBuild Indicates if experimental features are enabled on the daemon.
 * @param serverVersion Version string of the daemon.  > **Note**: the [standalone Swarm API](https://docs.docker.com/swarm/swarm-api/) > returns the Swarm version instead of the daemon  version, for example > `swarm/1.2.8`.
 * @param clusterStore URL of the distributed storage backend.   The storage backend is used for multihost networking (to store network and endpoint information) and by the node discovery mechanism.  <p><br /></p>  > **Deprecated**: This field is only propagated when using standalone Swarm > mode, and overlay networking using an external k/v store. Overlay > networks with Swarm mode enabled use the built-in raft store, and > this field will be empty.
 * @param clusterAdvertise The network endpoint that the Engine advertises for the purpose of node discovery. ClusterAdvertise is a `host:port` combination on which the daemon is reachable by other hosts.  <p><br /></p>  > **Deprecated**: This field is only propagated when using standalone Swarm > mode, and overlay networking using an external k/v store. Overlay > networks with Swarm mode enabled use the built-in raft store, and > this field will be empty.
 * @param runtimes List of [OCI compliant](https://github.com/opencontainers/runtime-spec) runtimes configured on the daemon. Keys hold the \"name\" used to reference the runtime.  The Docker daemon relies on an OCI compliant runtime (invoked via the `containerd` daemon) as its interface to the Linux kernel namespaces, cgroups, and SELinux.  The default runtime is `runc`, and automatically configured. Additional runtimes can be configured by the user and will be listed here.
 * @param defaultRuntime Name of the default OCI runtime that is used when starting containers.  The default can be overridden per-container at create time.
 * @param swarm
 * @param liveRestoreEnabled Indicates if live restore is enabled.  If enabled, containers are kept running when the daemon is shutdown or upon daemon start if running containers are detected.
 * @param isolation Represents the isolation technology to use as a default for containers. The supported values are platform-specific.  If no isolation value is specified on daemon start, on Windows client, the default is `hyperv`, and on Windows server, the default is `process`.  This option is currently not used on other platforms.
 * @param initBinary Name and, optional, path of the `docker-init` binary.  If the path is omitted, the daemon searches the host's `$PATH` for the binary and uses the first result.
 * @param containerdCommit
 * @param runcCommit
 * @param initCommit
 * @param securityOptions List of security features that are enabled on the daemon, such as apparmor, seccomp, SELinux, user-namespaces (userns), and rootless.  Additional configuration options for each security feature may be present, and are included as a comma-separated list of key/value pairs.
 * @param productLicense Reports a summary of the product license on the daemon.  If a commercial license has been applied to the daemon, information such as number of nodes, and expiration are included.
 * @param defaultAddressPools List of custom default address pools for local networks, which can be specified in the daemon.json file or dockerd option.  Example: a Base \"10.10.0.0/16\" with Size 24 will define the set of 256 10.10.[0-255].0/24 address pools.
 * @param warnings List of warnings / informational messages about missing features, or issues related to the daemon configuration.  These messages can be printed by the client as information to the user.
 */
@JsonClass(generateAdapter = true)
data class SystemInfo(

  /* Unique identifier of the daemon.  <p><br /></p>  > **Note**: The format of the ID itself is not part of the API, and > should not be considered stable.  */
  @Json(name = "ID")
  var ID: kotlin.String? = null,

  /* Total number of containers on the host. */
  @Json(name = "Containers")
  var containers: kotlin.Int? = null,

  /* Number of containers with status `\"running\"`.  */
  @Json(name = "ContainersRunning")
  var containersRunning: kotlin.Int? = null,

  /* Number of containers with status `\"paused\"`.  */
  @Json(name = "ContainersPaused")
  var containersPaused: kotlin.Int? = null,

  /* Number of containers with status `\"stopped\"`.  */
  @Json(name = "ContainersStopped")
  var containersStopped: kotlin.Int? = null,

  /* Total number of images on the host.  Both _tagged_ and _untagged_ (dangling) images are counted.  */
  @Json(name = "Images")
  var images: kotlin.Int? = null,

  /* Name of the storage driver in use. */
  @Json(name = "Driver")
  var driver: kotlin.String? = null,

  /* Information specific to the storage driver, provided as \"label\" / \"value\" pairs.  This information is provided by the storage driver, and formatted in a way consistent with the output of `docker info` on the command line.  <p><br /></p>  > **Note**: The information returned in this field, including the > formatting of values and labels, should not be considered stable, > and may change without notice.  */
  @Json(name = "DriverStatus")
  var driverStatus: kotlin.collections.MutableList<kotlin.collections.MutableList<kotlin.String>>? = null,

  /* Root directory of persistent Docker state.  Defaults to `/var/lib/docker` on Linux, and `C:\\ProgramData\\docker` on Windows.  */
  @Json(name = "DockerRootDir")
  var dockerRootDir: kotlin.String? = null,

  @Json(name = "Plugins")
  var plugins: PluginsInfo? = null,

  /* Indicates if the host has memory limit support enabled. */
  @Json(name = "MemoryLimit")
  var memoryLimit: kotlin.Boolean? = null,

  /* Indicates if the host has memory swap limit support enabled. */
  @Json(name = "SwapLimit")
  var swapLimit: kotlin.Boolean? = null,

  /* Indicates if the host has kernel memory TCP limit support enabled. This field is omitted if not supported.  Kernel memory TCP limits are not supported when using cgroups v2, which does not support the corresponding `memory.kmem.tcp.limit_in_bytes` cgroup.  */
  @Json(name = "KernelMemoryTCP")
  var kernelMemoryTCP: kotlin.Boolean? = null,

  /* Indicates if CPU CFS(Completely Fair Scheduler) period is supported by the host.  */
  @Json(name = "CpuCfsPeriod")
  var cpuCfsPeriod: kotlin.Boolean? = null,

  /* Indicates if CPU CFS(Completely Fair Scheduler) quota is supported by the host.  */
  @Json(name = "CpuCfsQuota")
  var cpuCfsQuota: kotlin.Boolean? = null,

  /* Indicates if CPU Shares limiting is supported by the host.  */
  @Json(name = "CPUShares")
  var cpUShares: kotlin.Boolean? = null,

  /* Indicates if CPUsets (cpuset.cpus, cpuset.mems) are supported by the host.  See [cpuset(7)](https://www.kernel.org/doc/Documentation/cgroup-v1/cpusets.txt)  */
  @Json(name = "CPUSet")
  var cpUSet: kotlin.Boolean? = null,

  /* Indicates if the host kernel has PID limit support enabled. */
  @Json(name = "PidsLimit")
  var pidsLimit: kotlin.Boolean? = null,

  /* Indicates if OOM killer disable is supported on the host. */
  @Json(name = "OomKillDisable")
  var oomKillDisable: kotlin.Boolean? = null,

  /* Indicates IPv4 forwarding is enabled. */
  @Json(name = "IPv4Forwarding")
  var ipv4Forwarding: kotlin.Boolean? = null,

  /* Indicates if `bridge-nf-call-iptables` is available on the host. */
  @Json(name = "BridgeNfIptables")
  var bridgeNfIptables: kotlin.Boolean? = null,

  /* Indicates if `bridge-nf-call-ip6tables` is available on the host. */
  @Json(name = "BridgeNfIp6tables")
  var bridgeNfIp6tables: kotlin.Boolean? = null,

  /* Indicates if the daemon is running in debug-mode / with debug-level logging enabled.  */
  @Json(name = "Debug")
  var debug: kotlin.Boolean? = null,

  /* The total number of file Descriptors in use by the daemon process.  This information is only returned if debug-mode is enabled.  */
  @Json(name = "NFd")
  var nfd: kotlin.Int? = null,

  /* The  number of goroutines that currently exist.  This information is only returned if debug-mode is enabled.  */
  @Json(name = "NGoroutines")
  var ngoroutines: kotlin.Int? = null,

  /* Current system-time in [RFC 3339](https://www.ietf.org/rfc/rfc3339.txt) format with nano-seconds.  */
  @Json(name = "SystemTime")
  var systemTime: kotlin.String? = null,

  /* The logging driver to use as a default for new containers.  */
  @Json(name = "LoggingDriver")
  var loggingDriver: kotlin.String? = null,

  /* The driver to use for managing cgroups.  */
  @Json(name = "CgroupDriver")
  var cgroupDriver: SystemInfo.CgroupDriver? = CgroupDriver.Cgroupfs,

  /* The version of the cgroup.  */
  @Json(name = "CgroupVersion")
  var cgroupVersion: SystemInfo.CgroupVersion? = CgroupVersion._1,

  /* Number of event listeners subscribed. */
  @Json(name = "NEventsListener")
  var neventsListener: kotlin.Int? = null,

  /* Kernel version of the host.  On Linux, this information obtained from `uname`. On Windows this information is queried from the <kbd>HKEY_LOCAL_MACHINE\\\\SOFTWARE\\\\Microsoft\\\\Windows NT\\\\CurrentVersion\\\\</kbd> registry value, for example _\"10.0 14393 (14393.1198.amd64fre.rs1_release_sec.170427-1353)\"_.  */
  @Json(name = "KernelVersion")
  var kernelVersion: kotlin.String? = null,

  /* Name of the host's operating system, for example: \"Ubuntu 16.04.2 LTS\" or \"Windows Server 2016 Datacenter\"  */
  @Json(name = "OperatingSystem")
  var operatingSystem: kotlin.String? = null,

  /* Version of the host's operating system  <p><br /></p>  > **Note**: The information returned in this field, including its > very existence, and the formatting of values, should not be considered > stable, and may change without notice.  */
  @Json(name = "OSVersion")
  var osVersion: kotlin.String? = null,

  /* Generic type of the operating system of the host, as returned by the Go runtime (`GOOS`).  Currently returned values are \"linux\" and \"windows\". A full list of possible values can be found in the [Go documentation](https://golang.org/doc/install/source#environment).  */
  @Json(name = "OSType")
  var osType: kotlin.String? = null,

  /* Hardware architecture of the host, as returned by the Go runtime (`GOARCH`).  A full list of possible values can be found in the [Go documentation](https://golang.org/doc/install/source#environment).  */
  @Json(name = "Architecture")
  var architecture: kotlin.String? = null,

  /* The number of logical CPUs usable by the daemon.  The number of available CPUs is checked by querying the operating system when the daemon starts. Changes to operating system CPU allocation after the daemon is started are not reflected.  */
  @Json(name = "NCPU")
  var NCPU: kotlin.Int? = null,

  /* Total amount of physical memory available on the host, in bytes.  */
  @Json(name = "MemTotal")
  var memTotal: kotlin.Long? = null,

  /* Address / URL of the index server that is used for image search, and as a default for user authentication for Docker Hub and Docker Cloud.  */
  @Json(name = "IndexServerAddress")
  var indexServerAddress: kotlin.String? = "https://index.docker.io/v1/",

  @Json(name = "RegistryConfig")
  var registryConfig: RegistryServiceConfig? = null,

  /* User-defined resources can be either Integer resources (e.g, `SSD=3`) or String resources (e.g, `GPU=UUID1`).  */
  @Json(name = "GenericResources")
  var genericResources: kotlin.collections.MutableList<GenericResourcesInner>? = null,

  /* HTTP-proxy configured for the daemon. This value is obtained from the [`HTTP_PROXY`](https://www.gnu.org/software/wget/manual/html_node/Proxies.html) environment variable. Credentials ([user info component](https://tools.ietf.org/html/rfc3986#section-3.2.1)) in the proxy URL are masked in the API response.  Containers do not automatically inherit this configuration.  */
  @Json(name = "HttpProxy")
  var httpProxy: kotlin.String? = null,

  /* HTTPS-proxy configured for the daemon. This value is obtained from the [`HTTPS_PROXY`](https://www.gnu.org/software/wget/manual/html_node/Proxies.html) environment variable. Credentials ([user info component](https://tools.ietf.org/html/rfc3986#section-3.2.1)) in the proxy URL are masked in the API response.  Containers do not automatically inherit this configuration.  */
  @Json(name = "HttpsProxy")
  var httpsProxy: kotlin.String? = null,

  /* Comma-separated list of domain extensions for which no proxy should be used. This value is obtained from the [`NO_PROXY`](https://www.gnu.org/software/wget/manual/html_node/Proxies.html) environment variable.  Containers do not automatically inherit this configuration.  */
  @Json(name = "NoProxy")
  var noProxy: kotlin.String? = null,

  /* Hostname of the host. */
  @Json(name = "Name")
  var name: kotlin.String? = null,

  /* User-defined labels (key/value metadata) as set on the daemon.  <p><br /></p>  > **Note**: When part of a Swarm, nodes can both have _daemon_ labels, > set through the daemon configuration, and _node_ labels, set from a > manager node in the Swarm. Node labels are not included in this > field. Node labels can be retrieved using the `/nodes/(id)` endpoint > on a manager node in the Swarm.  */
  @Json(name = "Labels")
  var labels: kotlin.collections.MutableList<kotlin.String>? = null,

  /* Indicates if experimental features are enabled on the daemon.  */
  @Json(name = "ExperimentalBuild")
  var experimentalBuild: kotlin.Boolean? = null,

  /* Version string of the daemon.  > **Note**: the [standalone Swarm API](https://docs.docker.com/swarm/swarm-api/) > returns the Swarm version instead of the daemon  version, for example > `swarm/1.2.8`.  */
  @Json(name = "ServerVersion")
  var serverVersion: kotlin.String? = null,

  /* URL of the distributed storage backend.   The storage backend is used for multihost networking (to store network and endpoint information) and by the node discovery mechanism.  <p><br /></p>  > **Deprecated**: This field is only propagated when using standalone Swarm > mode, and overlay networking using an external k/v store. Overlay > networks with Swarm mode enabled use the built-in raft store, and > this field will be empty.  */
  @Json(name = "ClusterStore")
  var clusterStore: kotlin.String? = null,

  /* The network endpoint that the Engine advertises for the purpose of node discovery. ClusterAdvertise is a `host:port` combination on which the daemon is reachable by other hosts.  <p><br /></p>  > **Deprecated**: This field is only propagated when using standalone Swarm > mode, and overlay networking using an external k/v store. Overlay > networks with Swarm mode enabled use the built-in raft store, and > this field will be empty.  */
  @Json(name = "ClusterAdvertise")
  var clusterAdvertise: kotlin.String? = null,

  /* List of [OCI compliant](https://github.com/opencontainers/runtime-spec) runtimes configured on the daemon. Keys hold the \"name\" used to reference the runtime.  The Docker daemon relies on an OCI compliant runtime (invoked via the `containerd` daemon) as its interface to the Linux kernel namespaces, cgroups, and SELinux.  The default runtime is `runc`, and automatically configured. Additional runtimes can be configured by the user and will be listed here.  */
  @Json(name = "Runtimes")
  var runtimes: kotlin.collections.MutableMap<kotlin.String, Runtime>? = null,

  /* Name of the default OCI runtime that is used when starting containers.  The default can be overridden per-container at create time.  */
  @Json(name = "DefaultRuntime")
  var defaultRuntime: kotlin.String? = "runc",

  @Json(name = "Swarm")
  var swarm: SwarmInfo? = null,

  /* Indicates if live restore is enabled.  If enabled, containers are kept running when the daemon is shutdown or upon daemon start if running containers are detected.  */
  @Json(name = "LiveRestoreEnabled")
  var liveRestoreEnabled: kotlin.Boolean? = false,

  /* Represents the isolation technology to use as a default for containers. The supported values are platform-specific.  If no isolation value is specified on daemon start, on Windows client, the default is `hyperv`, and on Windows server, the default is `process`.  This option is currently not used on other platforms.  */
  @Json(name = "Isolation")
  var isolation: SystemInfo.Isolation? = Isolation.Default,

  /* Name and, optional, path of the `docker-init` binary.  If the path is omitted, the daemon searches the host's `$PATH` for the binary and uses the first result.  */
  @Json(name = "InitBinary")
  var initBinary: kotlin.String? = null,

  @Json(name = "ContainerdCommit")
  var containerdCommit: Commit? = null,

  @Json(name = "RuncCommit")
  var runcCommit: Commit? = null,

  @Json(name = "InitCommit")
  var initCommit: Commit? = null,

  /* List of security features that are enabled on the daemon, such as apparmor, seccomp, SELinux, user-namespaces (userns), and rootless.  Additional configuration options for each security feature may be present, and are included as a comma-separated list of key/value pairs.  */
  @Json(name = "SecurityOptions")
  var securityOptions: kotlin.collections.MutableList<kotlin.String>? = null,

  /* Reports a summary of the product license on the daemon.  If a commercial license has been applied to the daemon, information such as number of nodes, and expiration are included.  */
  @Json(name = "ProductLicense")
  var productLicense: kotlin.String? = null,

  /* List of custom default address pools for local networks, which can be specified in the daemon.json file or dockerd option.  Example: a Base \"10.10.0.0/16\" with Size 24 will define the set of 256 10.10.[0-255].0/24 address pools.  */
  @Json(name = "DefaultAddressPools")
  var defaultAddressPools: kotlin.collections.MutableList<SystemInfoDefaultAddressPoolsInner>? = null,

  /* List of warnings / informational messages about missing features, or issues related to the daemon configuration.  These messages can be printed by the client as information to the user.  */
  @Json(name = "Warnings")
  var warnings: kotlin.collections.MutableList<kotlin.String>? = null

) {

  /**
   * The driver to use for managing cgroups.
   *
   * Values: Cgroupfs,Systemd,None
   */
  enum class CgroupDriver(val value: kotlin.String) {
    @Json(name = "cgroupfs") Cgroupfs("cgroupfs"),
    @Json(name = "systemd") Systemd("systemd"),
    @Json(name = "none") None("none");
  }
  /**
   * The version of the cgroup.
   *
   * Values: _1,_2
   */
  enum class CgroupVersion(val value: kotlin.String) {
    @Json(name = "1") _1("1"),
    @Json(name = "2") _2("2");
  }
  /**
   * Represents the isolation technology to use as a default for containers. The supported values are platform-specific.  If no isolation value is specified on daemon start, on Windows client, the default is `hyperv`, and on Windows server, the default is `process`.  This option is currently not used on other platforms.
   *
   * Values: Default,Hyperv,Process
   */
  enum class Isolation(val value: kotlin.String) {
    @Json(name = "default") Default("default"),
    @Json(name = "hyperv") Hyperv("hyperv"),
    @Json(name = "process") Process("process");
  }
}
