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
 * Volume configuration
 *
 * @param name The new volume's name. If not specified, Docker generates a name.
 * @param driver Name of the volume driver to use.
 * @param driverOpts A mapping of driver options and values. These options are passed directly to the driver and are driver specific.
 * @param labels User-defined key/value metadata.
 */
@JsonClass(generateAdapter = true)

data class VolumeCreateOptions(

  /* The new volume's name. If not specified, Docker generates a name.  */
  @Json(name = "Name")
  var name: kotlin.String? = null,

  /* Name of the volume driver to use. */
  @Json(name = "Driver")
  var driver: kotlin.String? = "local",

  /* A mapping of driver options and values. These options are passed directly to the driver and are driver specific.  */
  @Json(name = "DriverOpts")
  var driverOpts: kotlin.collections.MutableMap<kotlin.String, kotlin.String>? = null,

  /* User-defined key/value metadata. */
  @Json(name = "Labels")
  var labels: kotlin.collections.MutableMap<kotlin.String, kotlin.String>? = null

)
