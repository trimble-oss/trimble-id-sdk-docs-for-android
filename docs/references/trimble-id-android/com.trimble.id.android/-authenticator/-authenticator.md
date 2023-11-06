//[trimble-id-android](../../../index.md)/[com.trimble.id.android](../index.md)/[Authenticator](index.md)/[Authenticator](-authenticator.md)

# Authenticator

[androidJvm]\
constructor(context: [Context](https://developer.android.com/reference/kotlin/android/content/Context.html), configurationEndpoint: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), clientID: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), redirectUri: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), scope: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html))

Initialize authenticator. Only one instance of [Authenticator](index.md) should be used across the application

#### Parameters

androidJvm

| | |
|---|---|
| context | The Context of the current state of our application. |
| configurationEndpoint | The URL for the Trimble Identity OpenID well know configuration endpoint |
| clientID | The Client identifier of the application |
| redirectUri | Redirection Uri of the application |
| scope | The scope of the application |
