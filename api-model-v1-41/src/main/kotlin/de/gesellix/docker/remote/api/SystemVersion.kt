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
 * Response of Engine API: GET \"/version\"
 *
 * @param platform
 * @param components Information about system components
 * @param version The version of the daemon
 * @param apiVersion The default (and highest) API version that is supported by the daemon
 * @param minAPIVersion The minimum API version that is supported by the daemon
 * @param gitCommit The Git commit of the source code that was used to build the daemon
 * @param goVersion The version Go used to compile the daemon, and the version of the Go runtime in use.
 * @param os The operating system that the daemon is running on (\"linux\" or \"windows\")
 * @param arch The architecture that the daemon is running on
 * @param kernelVersion The kernel version (`uname -r`) that the daemon is running on.  This field is omitted when empty.
 * @param experimental Indicates if the daemon is started with experimental features enabled.  This field is omitted when empty / false.
 * @param buildTime The date and time that the daemon was compiled.
 */
@JsonClass(generateAdapter = true)

data class SystemVersion(

  @Json(name = "Platform")
  var platform: SystemVersionPlatform? = null,

  /* Information about system components  */
  @Json(name = "Components")
  var components: kotlin.collections.MutableList<SystemVersionComponentsInner>? = null,

  /* The version of the daemon */
  @Json(name = "Version")
  var version: kotlin.String? = null,

  /* The default (and highest) API version that is supported by the daemon  */
  @Json(name = "ApiVersion")
  var apiVersion: kotlin.String? = null,

  /* The minimum API version that is supported by the daemon  */
  @Json(name = "MinAPIVersion")
  var minAPIVersion: kotlin.String? = null,

  /* The Git commit of the source code that was used to build the daemon  */
  @Json(name = "GitCommit")
  var gitCommit: kotlin.String? = null,

  /* The version Go used to compile the daemon, and the version of the Go runtime in use.  */
  @Json(name = "GoVersion")
  var goVersion: kotlin.String? = null,

  /* The operating system that the daemon is running on (\"linux\" or \"windows\")  */
  @Json(name = "Os")
  var os: kotlin.String? = null,

  /* The architecture that the daemon is running on  */
  @Json(name = "Arch")
  var arch: kotlin.String? = null,

  /* The kernel version (`uname -r`) that the daemon is running on.  This field is omitted when empty.  */
  @Json(name = "KernelVersion")
  var kernelVersion: kotlin.String? = null,

  /* Indicates if the daemon is started with experimental features enabled.  This field is omitted when empty / false.  */
  @Json(name = "Experimental")
  var experimental: kotlin.Boolean? = null,

  /* The date and time that the daemon was compiled.  */
  @Json(name = "BuildTime")
  var buildTime: kotlin.String? = null

)
