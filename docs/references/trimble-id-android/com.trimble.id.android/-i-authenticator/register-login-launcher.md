//[trimble-id-android](../../../index.md)/[com.trimble.id.android](../index.md)/[IAuthenticator](index.md)/[registerLoginLauncher](register-login-launcher.md)

# registerLoginLauncher

[androidJvm]\
abstract fun [registerLoginLauncher](register-login-launcher.md)(context: [AppCompatActivity](https://developer.android.com/reference/kotlin/androidx/appcompat/app/AppCompatActivity.html))

Registers the login launcher. Result from login will be later handled by this function. This method needs to be invoked in the onCreate() or onStart() of the LifecycleOwner. It should be invoked before [login](login.md).

#### Parameters

androidJvm

| | |
|---|---|
| context | to register the login launcher. Context needs to be of type AppCompatActivity |
