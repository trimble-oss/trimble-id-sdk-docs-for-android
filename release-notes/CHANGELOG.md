# 1.0.0

Initial stable version of trimble-id-android SDK

- TID native android SDK initial stable version
- This SDK uses PKCE extension to OAuth which was created to secure authorization codes in public clients when custom URI scheme redirects are used.
- It features Token persistence, Trusted Web Activity support and Managed users support (For organizational accounts where employees don’t have an email)
- It supports Trusted Web Activity (TWA). By enabling this Trimble’s authentication sign in can be rendered by the user’s browser running in full screen mode without the URL bar.
- It orchestrates all the complexities by exposing easy method call for your needs.
- CustomTabs are used for authorizing requests when Custom Tabs implementation is provided by a browser on the device (for example by Chrome). Otherwise, the default browser is used as a fallback.
