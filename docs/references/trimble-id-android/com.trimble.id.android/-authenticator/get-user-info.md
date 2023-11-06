//[trimble-id-android](../../../index.md)/[com.trimble.id.android](../index.md)/[Authenticator](index.md)/[getUserInfo](get-user-info.md)

# getUserInfo

[androidJvm]\
open suspend override fun [getUserInfo](get-user-info.md)(): [User](../../com.trimble.id.android.model/-user/index.md)?

Get user claims of authenticated user. If user is not logged in or tokens are not valid, it returns null. Perform login to continue.

#### Return

[User](../../com.trimble.id.android.model/-user/index.md) Returns User response on success otherwise null
