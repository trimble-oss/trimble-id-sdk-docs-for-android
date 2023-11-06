//[trimble-id-android](../../../index.md)/[com.trimble](../index.md)/[IAuthenticator](index.md)/[logout](logout.md)

# logout

[androidJvm]\
abstract fun [logout](logout.md)(logoutCallback: [ILogoutResponseCallback](../-i-logout-response-callback/index.md))

Log the user out. Logout only after invoking [registerLogoutLauncher](register-logout-launcher.md).

#### Parameters

androidJvm

| | |
|---|---|
| logoutCallback | handles logout callback. The result of [logout](logout.md) will be sent to the provided callback handler. |
