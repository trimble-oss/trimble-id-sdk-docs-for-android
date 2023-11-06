//[trimble-id-android](../../../index.md)/[com.trimble.id.android](../index.md)/[Authenticator](index.md)

# Authenticator

class [Authenticator](index.md)(context: [Context](https://developer.android.com/reference/kotlin/android/content/Context.html), configurationEndpoint: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), clientID: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), redirectUri: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), scope: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)) : [IAuthenticator](../-i-authenticator/index.md)

An authenticator that utilizes a custom URI callback.

#### Parameters

androidJvm

| | |
|---|---|
| context | The Context of the current state of our application. |
| configurationEndpoint | The URL for the Trimble Identity OpenID well know configuration endpoint |
| clientID | The Client identifier of the application |
| redirectUri | Redirection Uri of the application |
| scope | The scope of the application |

## Constructors

| | |
|---|---|
| [Authenticator](-authenticator.md) | [androidJvm]<br>constructor(context: [Context](https://developer.android.com/reference/kotlin/android/content/Context.html), configurationEndpoint: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), clientID: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), redirectUri: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), scope: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html))<br>Initialize authenticator. Only one instance of [Authenticator](index.md) should be used across the application |

## Functions

| Name | Summary |
|---|---|
| [getAccessToken](get-access-token.md) | [androidJvm]<br>open suspend override fun [getAccessToken](get-access-token.md)(): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?<br>Get access token of authenticated user. If user is not logged in or tokens are not valid, it returns null. Perform login to continue |
| [getUserInfo](get-user-info.md) | [androidJvm]<br>open suspend override fun [getUserInfo](get-user-info.md)(): [User](../../com.trimble.id.android.model/-user/index.md)?<br>Get user claims of authenticated user. If user is not logged in or tokens are not valid, it returns null. Perform login to continue. |
| [isLoggedIn](is-logged-in.md) | [androidJvm]<br>open suspend override fun [isLoggedIn](is-logged-in.md)(): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)<br>Get the logged in state. |
| [login](login.md) | [androidJvm]<br>open override fun [login](login.md)(loginCallback: [ILoginResponseCallback](../-i-login-response-callback/index.md), launchAsTrustedWebActivity: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html))<br>Log the user in. Login only after invoking [registerLoginLauncher](register-login-launcher.md). |
| [logout](logout.md) | [androidJvm]<br>open override fun [logout](logout.md)(logoutCallback: [ILogoutResponseCallback](../-i-logout-response-callback/index.md))<br>Log the user out. Logout only after invoking [registerLogoutLauncher](register-logout-launcher.md). |
| [registerLoginLauncher](register-login-launcher.md) | [androidJvm]<br>open override fun [registerLoginLauncher](register-login-launcher.md)(context: [AppCompatActivity](https://developer.android.com/reference/kotlin/androidx/appcompat/app/AppCompatActivity.html))<br>Registers the login launcher. Result from [login](login.md) will be later handled by this function. This method needs to be invoked in the onCreate() or onStart() of the LifecycleOwner. It should be invoked before [login](login.md). |
| [registerLogoutLauncher](register-logout-launcher.md) | [androidJvm]<br>open override fun [registerLogoutLauncher](register-logout-launcher.md)(context: [AppCompatActivity](https://developer.android.com/reference/kotlin/androidx/appcompat/app/AppCompatActivity.html))<br>Registers the logout launcher. Result from logout will be later handled by this function. This method needs to be invoked in the onCreate() or onStart() of the LifecycleOwner. It should be invoked before [logout](logout.md). |
| [withManagedUser](with-managed-user.md) | [androidJvm]<br>open override fun [withManagedUser](with-managed-user.md)(shortCode: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?): [Authenticator](index.md)<br>Fluent extension to enable Managed user login flow @see [link](https://docs.trimblecloud.com/identity_v4.0/how-to/managed-users/overview/) |
| [withPostLogoutRedirectUri](with-post-logout-redirect-uri.md) | [androidJvm]<br>open override fun [withPostLogoutRedirectUri](with-post-logout-redirect-uri.md)(postLogoutRedirectUri: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)): [Authenticator](index.md)<br>Fluent extension for adding logout Uri |
