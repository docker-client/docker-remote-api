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
 * @param name Name of the service.
 * @param labels User-defined key/value metadata.
 * @param taskTemplate
 * @param mode
 * @param updateConfig
 * @param rollbackConfig
 * @param networks Specifies which networks the service should attach to.
 * @param endpointSpec
 */
@JsonClass(generateAdapter = true)

data class ServiceUpdateRequest(

    /* Name of the service. */
    @Json(name = "Name")
    var name: kotlin.String? = null,

    /* User-defined key/value metadata. */
    @Json(name = "Labels")
    var labels: kotlin.collections.MutableMap<kotlin.String, kotlin.String>? = null,

    @Json(name = "TaskTemplate")
    var taskTemplate: TaskSpec? = null,

    @Json(name = "Mode")
    var mode: ServiceSpecMode? = null,

    @Json(name = "UpdateConfig")
    var updateConfig: ServiceSpecUpdateConfig? = null,

    @Json(name = "RollbackConfig")
    var rollbackConfig: ServiceSpecRollbackConfig? = null,

    /* Specifies which networks the service should attach to. */
    @Json(name = "Networks")
    var networks: kotlin.collections.MutableList<NetworkAttachmentConfig>? = null,

    @Json(name = "EndpointSpec")
    var endpointSpec: EndpointSpec? = null

)
