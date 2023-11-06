# trimble-id-android

Trimble Identity Android OAuth Library

## <a name="documentation">Documentation</a>

- [Developer guide](https://github.com/trimble-oss/trimble-id-sdk-docs-for-android/blob/main/docs/DeveloperGuide.md) - Android library developer guide documentation.
- [Reference documentation](https://github.com/trimble-oss/trimble-id-sdk-docs-for-android/blob/main/docs/references/index.md) - Our code reference documentation generated from code comments.
- [Samples](https://github.com/trimble-oss/trimble-id-sdk-docs-for-android/blob/main/samples) - a code guided sample for your reference.
- [FAQs](https://github.com/trimble-oss/trimble-id-sdk-docs-for-android/blob/main/docs/FAQ.md) - frequently asked questions answering the most common questions.
- [Release Notes](https://github.com/trimble-oss/trimble-id-sdk-docs-for-android/blob/main/release-notes/CHANGELOG.md) - release notes about trimble-id-android client library.

## <a name="getting-started">Getting Started</a>

### Installation

**Apache Maven**

```sh
<dependency>
    <groupId>com.trimble</groupId>
    <artifactId>trimble-id-android</artifactId>
    <version>1.0.0</version>
</dependency>
```

**Gradle**
```sh
implementation group: 'com.trimble', name: 'trimble-id-android', version: '1.0.0'
```

### Configure Trimble Identity

Create a new application in the [Trimble Developer Console](https://developer.console.trimble.com) portal and configure the following settings:

To register your application in Trimble Developer Console:

1. On the left pane select "Applications".

2. On the Applications home page, in the top right corner select + NEW APPLICATION. The Create Application page displays.

3. Select Continue to enter the applications details.

    | Field       | Description |
    | ----------- | ----------- |
    | Name        | Name of your application                    |
    | Description | Provide a description for the application.  |

4. Configure OAuth application grant types as `Authorization Code Grant` and `Use Refresh tokens` in order to use this SDK.

5. Configure the desired `callback URL` and `logout URL` for your application. These URLs are used by the SDK to redirect the user after authentication.

6. Select "Create Application" to save changes.

Take note of the Client ID and URLs under the "Basic Information" section. You'll need these values to configure the SDK.

**Scopes**

Trimble Identity uses scopes to determine the aud claim in the returned access token. Scope is mandatory for the application to work. You can use the scope as the application name registered in the Trimble Developer Console. For example, if you have registered an application with the name "test", then it must be registered in the format {some_uuid}-"test". For eg., 12345678-1234-1234-1234-123456789012-test.

For more information, see [Authentication documentation](https://developer.trimble.com/docs/authentication).

## Raise an issue

To provide feedback or report a bug, please [raise an issue on our issue tracker](https://github.com/trimble-oss/trimble-id-sdk-docs-for-android/issues).

## <a name="support">Support</a>

Send email to [support@trimble.com](mailto:support@trimble.com)
