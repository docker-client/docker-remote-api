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
 * Available plugins per type.  <p><br /></p>  > **Note**: Only unmanaged (V1) plugins are included in this list. > V1 plugins are \"lazily\" loaded, and are not returned in this list > if there is no resource using the plugin.
 *
 * @param volume Names of available volume-drivers, and network-driver plugins.
 * @param network Names of available network-drivers, and network-driver plugins.
 * @param authorization Names of available authorization plugins.
 * @param log Names of available logging-drivers, and logging-driver plugins.
 */
@JsonClass(generateAdapter = true)

data class PluginsInfo(

  /* Names of available volume-drivers, and network-driver plugins. */
  @Json(name = "Volume")
  var volume: kotlin.collections.MutableList<kotlin.String>? = null,

  /* Names of available network-drivers, and network-driver plugins. */
  @Json(name = "Network")
  var network: kotlin.collections.MutableList<kotlin.String>? = null,

  /* Names of available authorization plugins. */
  @Json(name = "Authorization")
  var authorization: kotlin.collections.MutableList<kotlin.String>? = null,

  /* Names of available logging-drivers, and logging-driver plugins. */
  @Json(name = "Log")
  var log: kotlin.collections.MutableList<kotlin.String>? = null

)
