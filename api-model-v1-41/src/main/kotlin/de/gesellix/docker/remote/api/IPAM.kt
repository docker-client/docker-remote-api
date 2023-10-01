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
 * @param driver Name of the IPAM driver to use.
 * @param config List of IPAM configuration options, specified as a map:  ``` {\"Subnet\": <CIDR>, \"IPRange\": <CIDR>, \"Gateway\": <IP address>, \"AuxAddress\": <device_name:IP address>} ```
 * @param options Driver-specific options, specified as a map.
 */
@JsonClass(generateAdapter = true)

data class IPAM(

    /* Name of the IPAM driver to use. */
    @Json(name = "Driver")
    var driver: kotlin.String? = "default",

    /* List of IPAM configuration options, specified as a map:  ``` {\"Subnet\": <CIDR>, \"IPRange\": <CIDR>, \"Gateway\": <IP address>, \"AuxAddress\": <device_name:IP address>} ```  */
    @Json(name = "Config")
    var config: kotlin.collections.MutableList<IPAMConfig>? = null,

    /* Driver-specific options, specified as a map. */
    @Json(name = "Options")
    var options: kotlin.collections.MutableMap<kotlin.String, kotlin.String>? = null

)
