//[trimble-id-android](../../../index.md)/[com.trimble](../index.md)/[Authenticator](index.md)/[registerLogoutLauncher](register-logout-launcher.md)

# registerLogoutLauncher

[androidJvm]\
open override fun [registerLogoutLauncher](register-logout-launcher.md)(context: [AppCompatActivity](https://developer.android.com/reference/kotlin/androidx/appcompat/app/AppCompatActivity.html))

Registers the logout launcher. Result from logout will be later handled by this function. This method needs to be invoked in the onCreate() or onStart() of the LifecycleOwner. It should be invoked before [logout](logout.md).

#### Parameters

androidJvm

| | |
|---|---|
| context | to register the logout launcher. Context needs to be of type AppCompatActivity |
