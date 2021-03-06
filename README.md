# Android RGBA &nbsp;[![Build Status](https://travis-ci.org/emoji-gen/android-rgba.svg?branch=master)](https://travis-ci.org/emoji-gen/android-rgba) [![codebeat badge](https://codebeat.co/badges/57f059eb-040e-46a9-848a-2cb8cd5e7533)](https://codebeat.co/projects/github-com-emoji-gen-android-rgba-master)

:art: RGBA color string utilities for Android

<img src="palette.jpg" width="490">

## Requirements

- Android 4.0.3 (API Level 15) or later

## Getting Started
Please type it in your build.gradle file.

```groovy
repositories {
    jcenter()
}

dependencies {
    compile 'moe.pine.rgba:rgba:0.1.0'
    compile 'moe.pine.rgba:rgba-kotlin:0.1.0' // for Kotlin Extension
}
```

## Usage
### Java

```java
int color = RGBAUtils.RGBAToColor("#00ff00ff");
String rgba = RGBAUtils.colorToRGBA(color);
```

### Kotlin
```kotlin
val color = "#00ff00ff".toColor()
val rgba = color.toRGBA()
```

## Upload to Bintray

```
$ ./gradlew clean assemble bintrayUpload
```

## License

MIT &copy; [Emoji Generator](https://emoji-gen.ninja/)
