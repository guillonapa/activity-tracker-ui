# Notes on OpenAPI Generated Code

## Requires

* Kotlin 1.3.41
* Gradle 4.9

## Build

First, create the gradle wrapper script:

```
gradle wrapper
```

Then, run:

```
./gradlew check assemble
```

This runs all tests and packages the library.

## Features/Implementation Notes

* Supports JSON inputs/outputs, File inputs, and Form inputs.
* Supports collection formats for query parameters: csv, tsv, ssv, pipes.
* Some Kotlin and Java types are fully qualified to avoid conflicts with types defined in OpenAPI definitions.
* Implementation of ApiClient is intended to reduce method counts, specifically to benefit Android targets.

<a name="documentation-for-api-endpoints"></a>
## Documentation for API Endpoints

All URIs are relative to *https://virtserver.swaggerhub.com/guillonapa/activity-tracker/1.0.0*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*DevelopersApi* | [**activityDelete**](DevelopersApi.md#activitydelete) | **DELETE** /activity | deletes an activity record
*DevelopersApi* | [**activityGet**](DevelopersApi.md#activityget) | **GET** /activity | gets details of a recorded activity
*DevelopersApi* | [**activityPost**](DevelopersApi.md#activitypost) | **POST** /activity | records a user activity
*DevelopersApi* | [**activityPut**](DevelopersApi.md#activityput) | **PUT** /activity | updates an activity record
*DevelopersApi* | [**analyzePost**](DevelopersApi.md#analyzepost) | **POST** /analyze | generates an activity analysis
*DevelopersApi* | [**userDelete**](DevelopersApi.md#userdelete) | **DELETE** /user | deletes a user account
*DevelopersApi* | [**userGet**](DevelopersApi.md#userget) | **GET** /user | gets user preferences
*DevelopersApi* | [**userPost**](DevelopersApi.md#userpost) | **POST** /user | creates a user account
*DevelopersApi* | [**userPut**](DevelopersApi.md#userput) | **PUT** /user | updates user preferences


<a name="documentation-for-models"></a>
## Documentation for Models

 - [org.openapitools.client.models.ActivityBase](ActivityBase.md)
 - [org.openapitools.client.models.ActivityBaseReqBody](ActivityBaseReqBody.md)
 - [org.openapitools.client.models.ActivityDuration](ActivityDuration.md)
 - [org.openapitools.client.models.ActivityType](ActivityType.md)
 - [org.openapitools.client.models.AnalysisParameters](AnalysisParameters.md)
 - [org.openapitools.client.models.DurationUnits](DurationUnits.md)
 - [org.openapitools.client.models.Timespan](Timespan.md)
 - [org.openapitools.client.models.TimespanUnits](TimespanUnits.md)
 - [org.openapitools.client.models.UserBaseReqBody](UserBaseReqBody.md)
 - [org.openapitools.client.models.UserUpdateReqBody](UserUpdateReqBody.md)


<a name="documentation-for-authorization"></a>
## Documentation for Authorization

All endpoints do not require authorization.