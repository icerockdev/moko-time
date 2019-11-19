![moko-time](img/logo.png)  
[![GitHub license](https://img.shields.io/badge/license-Apache%20License%202.0-blue.svg?style=flat)](http://www.apache.org/licenses/LICENSE-2.0) [![Download](https://api.bintray.com/packages/icerockdev/moko/moko-time/images/download.svg) ](https://bintray.com/icerockdev/moko/moko-time/_latestVersion) ![kotlin-version](https://img.shields.io/badge/kotlin-1.3.60-orange)

# Mobile Kotlin time
This is a Kotlin Multiplatform library that supports time and Timers.  

## Table of Contents
- [Features](#features)
- [Requirements](#requirements)
- [Versions](#versions)
- [Installation](#installation)
- [Usage](#usage)
- [Samples](#samples)
- [Set Up Locally](#setup-locally)
- [Contributing](#contributing)
- [License](#license)

## Features
- **Timer** for recurrent/delayed operations;
- **getCurrentMilliSeconds** in common code.

## Requirements
- Gradle version 5.4.1+
- Android API 16+
- iOS version 9.0+

## Versions
- kotlin 1.3.50
  - 0.1.0
- kotlin 1.3.60
  - 0.2.0

## Installation
root build.gradle  
```groovy
allprojects {
    repositories {
        maven { url = "https://dl.bintray.com/icerockdev/moko" }
    }
}
```

project build.gradle
```groovy
dependencies {
    commonMainApi("dev.icerock.moko:time:0.2.0")
}
```

settings.gradle  
```groovy
enableFeaturePreview("GRADLE_METADATA")
```

## Usage
### Timer
Create the timer for a recurring operation:
```kotlin
var iteration = 0
val timer = Timer(intervalMilliSeconds = 5000) {
    iteration++
    println("iteration $iteration")
    true // return true to repeat operation after interval
}

timer.start() // call block after intervalMilliSeconds

timer.stop() // manually stop repeating timer
```

Create the timer for a single run (a delayed operation):
```kotlin
val timer = Timer(intervalMilliSeconds = 5000) {
    println("printed after 5 seconds")
    false // we not need repeating - just single run
}

timer.start() // call block after intervalMilliSeconds
```

### Current milliseconds
```kotlin
val milliSeconds: Long = getCurrentMilliSeconds()
println("now $milliSeconds milliseconds")
```

## Samples
Please see more examples in the [sample directory](sample).

## Set Up Locally 
- The [time directory](time) contains the `time` library;
- The [sample directory](sample) contains sample apps for Android and iOS; plus the mpp-library connected to the apps;
- For local testing use the `:time:publishToMavenLocal` gradle task - so that sample apps use the locally published version.

## Contributing
All development (both new features and bug fixes) is performed in the `develop` branch. This way `master` always contains the sources of the most recently released version. Please send PRs with bug fixes to the `develop` branch. Documentation fixes in the markdown files are an exception to this rule. They are updated directly in `master`.

The `develop` branch is pushed to `master` on release.

For more details on contributing please see the [contributing guide](CONTRIBUTING.md).

## License
        
    Copyright 2019 IceRock MAG Inc.
    
    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at
    
       http://www.apache.org/licenses/LICENSE-2.0
    
    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.