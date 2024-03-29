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
 * The logging configuration for this container
 *
 * @param type
 * @param config
 */
@JsonClass(generateAdapter = true)
data class HostConfigAllOfLogConfig(
    @Json(name = "Type")
    var type: HostConfigAllOfLogConfig.Type? = null,
    @Json(name = "Config")
    var config: kotlin.collections.MutableMap<kotlin.String, kotlin.String>? = null,
) {
    /**
     *
     *
     * Values: JsonMinusFile,Syslog,Journald,Gelf,Fluentd,Awslogs,Splunk,Etwlogs,None
     */
    @JsonClass(generateAdapter = false)
    enum class Type(val value: kotlin.String) {
        @Json(name = "json-file")
        JsonMinusFile("json-file"),

        @Json(name = "syslog")
        Syslog("syslog"),

        @Json(name = "journald")
        Journald("journald"),

        @Json(name = "gelf")
        Gelf("gelf"),

        @Json(name = "fluentd")
        Fluentd("fluentd"),

        @Json(name = "awslogs")
        Awslogs("awslogs"),

        @Json(name = "splunk")
        Splunk("splunk"),

        @Json(name = "etwlogs")
        Etwlogs("etwlogs"),

        @Json(name = "none")
        None("none"),
    }
}
