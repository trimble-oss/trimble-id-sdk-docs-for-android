# Trimble Identity OAuth Android Library - Developer Guide

### Content

1. [Overview](#overview)
2. [Authentication with Trimble Identity](#identity)
3. [Requirements](#requirements)
4. [Code snippets](#snippets)
   + [Configure Authenticator](#configure_authenticator)
   + [Performing Login](#perform_login)
   + [Retrieving an access token](#retrieve_access_token)
   + [Retrieving User Info](#retrieve_user_info)
   + [To know the current logged-in state](#know_current_state) 
   + [Performing Logout](#perform_logout)
4. [FAQ](#faq)

## <a name="overview">Overview</a> ##

This library uses `PKCE` extension to OAuth which was created to secure authorization codes in public clients when custom URI scheme redirects are used. It features Token persistence, Trusted Web Activity(TWA) support and Managed users support (For organizational accounts where employees don’t have an email). With enabling TWA, Trimble’s authentication sign in can be rendered by the user’s browser running in full screen mode without the URL bar.

It orchestrates all the complexities by exposing easy method call for your needs.

`CustomTabs` are used for authorizing requests when Custom Tabs implementation is provided by a browser on the device (for example by Chrome). Otherwise, the default browser is used as a fallback.

## <a name="identity">Authentication with Trimble Identity</a> ##

To utilize TID authentication, your identity application must be registered with Trimble Identity. You can conveniently handle the application registration process on [Trimble Developer Console](https://developer.console.trimble.com).

## <a name="requirements">Requirements</a> ##

Provides compatibility from Android API 21 and above with minimum JDK of 1.8

#### Custom URI Scheme
* Once the authorization flow is completed in the browser, the authorization service will redirect to a URI specified as part of the authorization request, providing the response via query parameters. In order for your app to capture this response, a `Custom scheme based redirect URI` is used. URI needs to include `applicationId` of the end application ( applicationId /path ). Redirect uri for login and logout needs to be constructed using the custom uri scheme.
* End application should specify the `appAuthRedirectScheme` in their module level build.gradle inside defaultConfig block

```kotlin
manifestPlaceholders = ['appAuthRedirectScheme': applicationId]
```

## <a name="snippets">Code snippets</a> ##

### <a name="configure_authenticator">Configure Authenticator</a> ###

Authenticator class helps to authenticate users by exposing functionalities like `Login`, `Logout`, `Retrieve Access Token`, `Retrieve User Information` and `Know a Logged in state`. It implements **IAuthenticator** interface. Redirect uri for login and logout needs to be constructed using the [Custom URI Scheme][1]. Once the user is authenticated , authorization state of the user is store in shared preference for easy persistance. Shared preference also gets updated when tokens are refreshed and gets cleared on logout.

> **_NOTE:_** It is recommended to use single instance of **Authenticator** across the application.

```kotlin
val authenticator = Authenticator(
        context = context, // Context to handle authentication of user.
        configurationEndpoint = "/.well-known/openid-configuration",  // OpenID well known configuration endpoint
        clientID = "clientID", // clientID of TID application
        redirectUri = "redirectUri", // redirect uri  
        scope = "scope" // scope of TID application
    )
```
Redirect uri needs to be constructed using a [Custom Uri Scheme][1].

### <a name="perform_login">Performing Login</a> ###

Login method helps to authenticate the user. It discovers endpoints to interact with the provider, authorizes the user, via a browser to obtain an authorization code and exchanges the authorization code to obtain a refresh token and/or ID token. It persists authorization state of the user in an Encrypted SharedPreference as default. Result of login will be handled by `registerLoginLauncher` method. `RegisterLoginLauncher` needs to be invoked in the `onCreate()` or `onStart()` of the LifecycleOwner. It should be invoked before login method.

```kotlin
authenticator.registerLoginLauncher(context)
```
The context passed in registerLoginLauncher needs to be of type `AppCompactActivity`.

When the user completes login, result is sent to the end application via **ILoginResponseCallback**. Here Result can be either true for successful login or false for any exception.

```kotlin
authenticator.login(object : ILoginResponseCallback {
            override fun onLoginCompleted(loginResult: Result<Boolean>) {  //The result of login will be sent to the provided callback handler
                loginResult.onSuccess {

                    //write the logic when Login is complete and success
                }
                loginResult.onFailure {

                    //write the logic when Login is complete but failed
                }
            }
        }, launchAsTrustedWebActivity)
```
> **_NOTE:_** Allows to browse the login page as a [Trusted Web Activity](). This can be achieved by setting launchAsTrustedWebActivity = true in login method. By default value is set to false. (Optional parameter)

### <a name="retrieve_access_token">Retrieving an access token</a> ###

To retrieve access token, invoke `getAccessToken()` method on the authenticator instance. It retrieves access token of authenticated user.

```kotlin
val accessToken = authenticator.getAccessToken()
```
Return value is either of type string or null. It returns null if access tokens is not valid or user is not authenticated. In such a scenario, perform login to continue.

### <a name="retrieve_user_info">Retrieving User Info</a> ###

To retrieve user information, invoke `getUserInfo()` method on the authenticator instance. It returns user info of authenticated user by parsing the idToken.

```kotlin
val user = authenticator.getUserInfo() 
```
Return value is either of type User or null. Returns null if tokens are not valid or user is not authenticated. In such a scenario, perform login to continue.

### <a name="know_current_state">To know the current logged-in state</a> ###

Check whether the user is logged in, `isLoggedIn()` method can be used.

```kotlin
val isLoggedIn = authenticator.isLogged()
```
Return value is true if a user is logged in and tokens are valid else false.

### <a name="perform_logout">Performing Logout</a> ###

Logout method ends a logged in session. It also clears the shared preference. To handle the result of logout, `RegisterLogoutLauncher` needs to be invoked before logout method is invoked. `RegisterLogoutLauncher` needs to be invoked in the `onCreate()` or `onStart()` of the LifecycleOwner.

```kotlin
authenticator.registerLogoutLauncher(context)
```
The context passed in registerLogoutLauncher needs to be of type `AppCompactActivity`.

When the user completes logout, result is sent to the end application via **ILogoutResponseCallback**. Here Result can be either true for successful logout or false for any exception.

```kotlin
authenticator.logout(object : ILogoutResponseCallback {
            override fun onLogoutCompleted(logoutResult: Result<Boolean>) { 
                logoutResult.onSuccess {
                    
                    // write the logic when logout is complete and success
                }.onFailure {
                
                 // write the logic when logout is complete but failed
                }
            }
        })
```

## <a name="faq">FAQ</a> ##

Do you have questions? Do not worry, we have prepared a complete [FAQ](./FAQ.md) answering the most common questions.