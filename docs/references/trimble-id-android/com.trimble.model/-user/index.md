//[trimble-id-android](../../../index.md)/[com.trimble.model](../index.md)/[User](index.md)

# User

[androidJvm]\
data class [User](index.md)(val sub: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), val givenName: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), val familyName: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), val email: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null, val emailVerified: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) = false, val picture: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html))

User claims data model

## Constructors

| | |
|---|---|
| [User](-user.md) | [androidJvm]<br>constructor(sub: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), givenName: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), familyName: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), email: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null, emailVerified: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) = false, picture: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)) |

## Properties

| Name | Summary |
|---|---|
| [email](email.md) | [androidJvm]<br>val [email](email.md): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)? = null<br>The end-user's preferred email address |
| [emailVerified](email-verified.md) | [androidJvm]<br>val [emailVerified](email-verified.md): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) = false<br>True if the end-user's email address has been verified, else false |
| [familyName](family-name.md) | [androidJvm]<br>val [familyName](family-name.md): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)<br>The surname(s) or last name(s) of the end-user |
| [givenName](given-name.md) | [androidJvm]<br>val [givenName](given-name.md): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)<br>The given or first name of the end-user |
| [picture](picture.md) | [androidJvm]<br>val [picture](picture.md): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)<br>The URL of the profile picture for the end-user |
| [sub](sub.md) | [androidJvm]<br>val [sub](sub.md): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)<br>The subject (end-user) identifier |
