/**
* Activity Tracker API
* Activity Tracker API for Brandeis Boys
*
* The version of the OpenAPI document: 1.0.0
*
*
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
* https://openapi-generator.tech
* Do not edit the class manually.
*/
package org.openapitools.client.models

import com.squareup.moshi.Json
/**
 *
 * @param amount
 * @param unit
 */

data class ActivityDuration(
    @Json(name = "amount")
    val amount: kotlin.Int,
    @Json(name = "unit")
    val unit: DurationUnits
)