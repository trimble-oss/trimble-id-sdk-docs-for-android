//[trimble-id-android](../../../index.md)/[com.trimble.id.android](../index.md)/[IAuthenticator](index.md)

# IAuthenticator

interface [IAuthenticator](index.md)

Common interface for Authenticator

#### Inheritors

| |
|---|
| [Authenticator](../-authenticator/index.md) |

## Functions

| Name | Summary |
|---|---|
| [getAccessToken](get-access-token.md) | [androidJvm]<br>abstract suspend fun [getAccessToken](get-access-token.md)(): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?<br>Get access token of authenticated user. |
| [getUserInfo](get-user-info.md) | [androidJvm]<br>abstract suspend fun [getUserInfo](get-user-info.md)(): [User](../../com.trimble.id.android.model/-user/index.md)?<br>Get user claims of authenticated user. |
| [isLoggedIn](is-logged-in.md) | [androidJvm]<br>abstract suspend fun [isLoggedIn](is-logged-in.md)(): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)<br>Get the logged in state. It returns true if a user is logged in else false. |
| [login](login.md) | [androidJvm]<br>abstract fun [login](login.md)(loginCallback: [ILoginResponseCallback](../-i-login-response-callback/index.md), launchAsTrustedWebActivity: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) = false)<br>Log the user in. Login only after invoking [registerLoginLauncher](register-login-launcher.md). |
| [logout](logout.md) | [androidJvm]<br>abstract fun [logout](logout.md)(logoutCallback: [ILogoutResponseCallback](../-i-logout-response-callback/index.md))<br>Log the user out. Logout only after invoking [registerLogoutLauncher](register-logout-launcher.md). |
| [registerLoginLauncher](register-login-launcher.md) | [androidJvm]<br>abstract fun [registerLoginLauncher](register-login-launcher.md)(context: [AppCompatActivity](https://developer.android.com/reference/kotlin/androidx/appcompat/app/AppCompatActivity.html))<br>Registers the login launcher. Result from login will be later handled by this function. This method needs to be invoked in the onCreate() or onStart() of the LifecycleOwner. It should be invoked before [login](login.md). |
| [registerLogoutLauncher](register-logout-launcher.md) | [androidJvm]<br>abstract fun [registerLogoutLauncher](register-logout-launcher.md)(context: [AppCompatActivity](https://developer.android.com/reference/kotlin/androidx/appcompat/app/AppCompatActivity.html))<br>Registers the logout launcher. Result from logout will be later handled by this function. This method needs to be invoked in the onCreate() or onStart() of the LifecycleOwner. It should be invoked before [logout](logout.md). |
| [withManagedUser](with-managed-user.md) | [androidJvm]<br>abstract fun [withManagedUser](with-managed-user.md)(shortCode: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null): [Authenticator](../-authenticator/index.md)<br>Fluent extension to enable Managed user login flow @see [link](https://docs.trimblecloud.com/identity_v4.0/how-to/managed-users/overview/) |
| [withPostLogoutRedirectUri](with-post-logout-redirect-uri.md) | [androidJvm]<br>abstract fun [withPostLogoutRedirectUri](with-post-logout-redirect-uri.md)(postLogoutRedirectUri: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)): [Authenticator](../-authenticator/index.md)<br>Fluent extension for adding logout Uri |
