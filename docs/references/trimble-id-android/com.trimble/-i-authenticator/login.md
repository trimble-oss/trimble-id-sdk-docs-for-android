//[trimble-id-android](../../../index.md)/[com.trimble](../index.md)/[IAuthenticator](index.md)/[login](login.md)

# login

[androidJvm]\
abstract fun [login](login.md)(loginCallback: [ILoginResponseCallback](../-i-login-response-callback/index.md), launchAsTrustedWebActivity: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) = false)

Log the user in. Login only after invoking [registerLoginLauncher](register-login-launcher.md).

#### Parameters

androidJvm

| | |
|---|---|
| loginCallback | The result of [login](login.md) will be sent to the provided callback handler. |
| launchAsTrustedWebActivity | By enabling this Trimble’s authentication sign in can be rendered by the user’s browser running in full screen mode without the URL bar. By default value is set to false. @See [link](https://docs.trimblecloud.com/identity_v4.0/how-to/ux/hide-mobile-browser/) |
