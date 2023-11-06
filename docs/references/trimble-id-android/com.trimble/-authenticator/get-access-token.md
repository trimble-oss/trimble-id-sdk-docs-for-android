//[trimble-id-android](../../../index.md)/[com.trimble](../index.md)/[Authenticator](index.md)/[getAccessToken](get-access-token.md)

# getAccessToken

[androidJvm]\
open suspend override fun [getAccessToken](get-access-token.md)(): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?

Get access token of authenticated user. If user is not logged in or tokens are not valid, it returns null. Perform login to continue

#### Return

access token of authenticated user. Returns null if no access token is retrieved
