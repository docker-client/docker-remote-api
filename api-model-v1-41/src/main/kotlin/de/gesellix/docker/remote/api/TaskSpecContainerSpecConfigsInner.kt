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
 *
 *
 * @param file
 * @param runtime Runtime represents a target that is not mounted into the container but is used by the task  <p><br /><p>  > **Note**: `Configs.File` and `Configs.Runtime` are mutually > exclusive
 * @param configID ConfigID represents the ID of the specific config that we're referencing.
 * @param configName ConfigName is the name of the config that this references, but this is just provided for lookup/display purposes. The config in the reference will be identified by its ID.
 */
@JsonClass(generateAdapter = true)

data class TaskSpecContainerSpecConfigsInner(

  @Json(name = "File")
  var file: TaskSpecContainerSpecConfigsInnerFile? = null,

  /* Runtime represents a target that is not mounted into the container but is used by the task  <p><br /><p>  > **Note**: `Configs.File` and `Configs.Runtime` are mutually > exclusive  */
  @Json(name = "Runtime")
  var runtime: kotlin.Any? = null,

  /* ConfigID represents the ID of the specific config that we're referencing.  */
  @Json(name = "ConfigID")
  var configID: kotlin.String? = null,

  /* ConfigName is the name of the config that this references, but this is just provided for lookup/display purposes. The config in the reference will be identified by its ID.  */
  @Json(name = "ConfigName")
  var configName: kotlin.String? = null

)
