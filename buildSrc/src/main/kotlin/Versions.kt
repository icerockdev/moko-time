/*
 * Copyright 2019 IceRock MAG Inc. Use of this source code is governed by the Apache 2.0 license.
 */

object Versions {
    object Android {
        const val compileSdk = 28
        const val targetSdk = 28
        const val minSdk = 16
    }

    const val kotlin = "1.3.60"

    object Plugins {
        const val kotlin = Versions.kotlin
        const val androidExtensions = Versions.kotlin
    }

    object Libs {
        object Android {
            const val appCompat = "1.1.0"
        }

        object MultiPlatform {
            const val mokoTime: String = "0.2.0"
        }
    }
}