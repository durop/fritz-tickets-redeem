# fritz-tickets-redeem

An Android app that lets users redeem FRITZ!Box parental-control tickets directly from their phone, without having to open a browser manually.

## What it does

The FRITZ!Box router provides a page at `https://fritz.box/tools/kids_not_allowed.lua` where a parental-control redemption ticket (issued by a parent/admin) can be entered to temporarily unlock internet access for a child's device. This app wraps that page in a native Android WebView so it is always just one tap away.

## Requirements

| Requirement | Version |
| --- | --- |
| Android | 8.0 (API 26) or higher |
| FRITZ!Box router | any model that provides the kids parental-control feature |
| Network | device must be connected to the same local network as the FRITZ!Box |

## Installation

### Option A – install the pre-built APK

1. Download `app/release/redeem.apk` from this repository.
2. On your Android device, enable **Install unknown apps** for your file manager (Settings → Apps → Special app access → Install unknown apps).
3. Open the downloaded APK and follow the on-screen prompts.

### Option B – build from source

1. Clone the repository:
   ```bash
   git clone https://github.com/durop/fritz-tickets-redeem.git
   ```
2. Open the project in **Android Studio** (Arctic Fox or newer recommended).
3. Let Gradle sync and download dependencies.
4. Connect a device or start an emulator, then click **Run ▶**.

## Usage

1. Make sure your Android device is connected to your home Wi-Fi (the same network as your FRITZ!Box).
2. Open the **Redeem** app.
3. The FRITZ!Box redemption page loads automatically inside the app.
4. Enter the ticket code provided by the parental-control administrator and confirm.

## Technical notes

- The app uses a `WebView` pointing at `https://fritz.box/tools/kids_not_allowed.lua`.
- SSL certificate errors are silently accepted so that the self-signed certificate used by the FRITZ!Box does not block access. **Only use this app on a trusted private network – do not install it if you connect to untrusted Wi-Fi networks, as ignoring SSL errors can expose you to man-in-the-middle attacks.**
- Internet permission (`android.permission.INTERNET`) is the only permission required.
- The app targets Android 12 (API 32) and supports dark mode.

## License

This project is licensed under the terms of the [LICENSE](LICENSE) file included in the repository.