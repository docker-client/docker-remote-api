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
    "UnusedImport",
)

package de.gesellix.docker.remote.api

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 *
 *
 * @param name
 * @param id
 * @param created
 * @param scope
 * @param driver
 * @param enableIPv6
 * @param IPAM
 * @param `internal`
 * @param attachable
 * @param ingress
 * @param containers
 * @param options
 * @param labels
 */
@JsonClass(generateAdapter = true)
data class Network(
    @Json(name = "Name")
    var name: kotlin.String? = null,
    @Json(name = "Id")
    var id: kotlin.String? = null,
    @Json(name = "Created")
    var created: kotlin.String? = null,
    @Json(name = "Scope")
    var scope: kotlin.String? = null,
    @Json(name = "Driver")
    var driver: kotlin.String? = null,
    @Json(name = "EnableIPv6")
    var enableIPv6: kotlin.Boolean? = null,
    @Json(name = "IPAM")
    var IPAM: IPAM? = null,
    @Json(name = "Internal")
    var `internal`: kotlin.Boolean? = null,
    @Json(name = "Attachable")
    var attachable: kotlin.Boolean? = null,
    @Json(name = "Ingress")
    var ingress: kotlin.Boolean? = null,
    @Json(name = "Containers")
    var containers: kotlin.collections.MutableMap<kotlin.String, NetworkContainer>? = null,
    @Json(name = "Options")
    var options: kotlin.collections.MutableMap<kotlin.String, kotlin.String>? = null,
    @Json(name = "Labels")
    var labels: kotlin.collections.MutableMap<kotlin.String, kotlin.String>? = null,
)