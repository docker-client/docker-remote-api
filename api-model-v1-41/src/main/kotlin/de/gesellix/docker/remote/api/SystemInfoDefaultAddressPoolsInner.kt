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
 * @param base The network address in CIDR format
 * @param propertySize The network pool size
 */
@JsonClass(generateAdapter = true)

data class SystemInfoDefaultAddressPoolsInner(

    /* The network address in CIDR format */
    @Json(name = "Base")
    var base: kotlin.String? = null,

    /* The network pool size */
    @Json(name = "Size")
    var propertySize: kotlin.Int? = null

)
