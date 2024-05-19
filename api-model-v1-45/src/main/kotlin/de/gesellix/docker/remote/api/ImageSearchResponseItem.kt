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
 * @param description
 * @param official
 * @param automated Whether this repository has automated builds enabled.  <p><br /></p>  > **Deprecated**: This field is deprecated and will always be \"false\".
 * @param name
 * @param starCount
 */
@JsonClass(generateAdapter = true)
data class ImageSearchResponseItem(
    @Json(name = "description")
    var description: kotlin.String? = null,
    @Json(name = "is_official")
    var official: kotlin.Boolean? = null,
    // Whether this repository has automated builds enabled.  <p><br /></p>  > **Deprecated**: This field is deprecated and will always be \"false\".
    @Json(name = "is_automated")
    var automated: kotlin.Boolean? = null,
    @Json(name = "name")
    var name: kotlin.String? = null,
    @Json(name = "star_count")
    var starCount: kotlin.Int? = null,
)