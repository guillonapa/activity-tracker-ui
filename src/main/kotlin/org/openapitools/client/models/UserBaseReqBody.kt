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
 * @param id
 * @param name
 * @param email
 */

data class UserBaseReqBody(
    @Json(name = "id")
    val id: kotlin.String,
    @Json(name = "name")
    val name: kotlin.String,
    @Json(name = "email")
    val email: kotlin.String
)