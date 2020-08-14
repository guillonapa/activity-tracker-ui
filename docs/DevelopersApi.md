# DevelopersApi

All URIs are relative to *https://virtserver.swaggerhub.com/guillonapa/activity-tracker/1.0.0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**activityDelete**](DevelopersApi.md#activityDelete) | **DELETE** /activity | deletes an activity record
[**activityGet**](DevelopersApi.md#activityGet) | **GET** /activity | gets details of a recorded activity
[**activityPost**](DevelopersApi.md#activityPost) | **POST** /activity | records a user activity
[**activityPut**](DevelopersApi.md#activityPut) | **PUT** /activity | updates an activity record
[**analyzePost**](DevelopersApi.md#analyzePost) | **POST** /analyze | generates an activity analysis
[**userDelete**](DevelopersApi.md#userDelete) | **DELETE** /user | deletes a user account
[**userGet**](DevelopersApi.md#userGet) | **GET** /user | gets user preferences
[**userPost**](DevelopersApi.md#userPost) | **POST** /user | creates a user account
[**userPut**](DevelopersApi.md#userPut) | **PUT** /user | updates user preferences


<a name="activityDelete"></a>
# **activityDelete**
> activityDelete(activityId)

deletes an activity record

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DevelopersApi()
val activityId : kotlin.String = activityId_example // kotlin.String | unique activity identifier
try {
    apiInstance.activityDelete(activityId)
} catch (e: ClientException) {
    println("4xx response calling DevelopersApi#activityDelete")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DevelopersApi#activityDelete")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **activityId** | **kotlin.String**| unique activity identifier |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="activityGet"></a>
# **activityGet**
> ActivityBase activityGet(userId, activityId)

gets details of a recorded activity

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DevelopersApi()
val userId : kotlin.String = userId_example // kotlin.String | unique user identifier
val activityId : kotlin.String = activityId_example // kotlin.String | unique activity identifier
try {
    val result : ActivityBase = apiInstance.activityGet(userId, activityId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DevelopersApi#activityGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DevelopersApi#activityGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **kotlin.String**| unique user identifier |
 **activityId** | **kotlin.String**| unique activity identifier |

### Return type

[**ActivityBase**](ActivityBase.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="activityPost"></a>
# **activityPost**
> activityPost(activityBaseReqBody)

records a user activity

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DevelopersApi()
val activityBaseReqBody : ActivityBaseReqBody =  // ActivityBaseReqBody | activity to record
try {
    apiInstance.activityPost(activityBaseReqBody)
} catch (e: ClientException) {
    println("4xx response calling DevelopersApi#activityPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DevelopersApi#activityPost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **activityBaseReqBody** | [**ActivityBaseReqBody**](ActivityBaseReqBody.md)| activity to record | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="activityPut"></a>
# **activityPut**
> activityPut(activityBaseReqBody)

updates an activity record

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DevelopersApi()
val activityBaseReqBody : ActivityBaseReqBody =  // ActivityBaseReqBody | activity details to update
try {
    apiInstance.activityPut(activityBaseReqBody)
} catch (e: ClientException) {
    println("4xx response calling DevelopersApi#activityPut")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DevelopersApi#activityPut")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **activityBaseReqBody** | [**ActivityBaseReqBody**](ActivityBaseReqBody.md)| activity details to update | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="analyzePost"></a>
# **analyzePost**
> analyzePost(analysisParameters)

generates an activity analysis

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DevelopersApi()
val analysisParameters : AnalysisParameters =  // AnalysisParameters | parameters used for activity analysis
try {
    apiInstance.analyzePost(analysisParameters)
} catch (e: ClientException) {
    println("4xx response calling DevelopersApi#analyzePost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DevelopersApi#analyzePost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **analysisParameters** | [**AnalysisParameters**](AnalysisParameters.md)| parameters used for activity analysis | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="userDelete"></a>
# **userDelete**
> userDelete(userId)

deletes a user account

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DevelopersApi()
val userId : kotlin.String = userId_example // kotlin.String | unique user identifier
try {
    apiInstance.userDelete(userId)
} catch (e: ClientException) {
    println("4xx response calling DevelopersApi#userDelete")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DevelopersApi#userDelete")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **kotlin.String**| unique user identifier | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="userGet"></a>
# **userGet**
> UserBaseReqBody userGet(userId)

gets user preferences

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DevelopersApi()
val userId : kotlin.String = userId_example // kotlin.String | unique user identifier
try {
    val result : UserBaseReqBody = apiInstance.userGet(userId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DevelopersApi#userGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DevelopersApi#userGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **kotlin.String**| unique user identifier |

### Return type

[**UserBaseReqBody**](UserBaseReqBody.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="userPost"></a>
# **userPost**
> userPost(userBaseReqBody)

creates a user account

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DevelopersApi()
val userBaseReqBody : UserBaseReqBody =  // UserBaseReqBody | user account details
try {
    apiInstance.userPost(userBaseReqBody)
} catch (e: ClientException) {
    println("4xx response calling DevelopersApi#userPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DevelopersApi#userPost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userBaseReqBody** | [**UserBaseReqBody**](UserBaseReqBody.md)| user account details | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="userPut"></a>
# **userPut**
> userPut(userUpdateReqBody)

updates user preferences

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = DevelopersApi()
val userUpdateReqBody : UserUpdateReqBody =  // UserUpdateReqBody | user account details to update
try {
    apiInstance.userPut(userUpdateReqBody)
} catch (e: ClientException) {
    println("4xx response calling DevelopersApi#userPut")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DevelopersApi#userPut")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userUpdateReqBody** | [**UserUpdateReqBody**](UserUpdateReqBody.md)| user account details to update | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

