/*
 * Copyright 2019 IceRock MAG Inc. Use of this source code is governed by the Apache 2.0 license.
 */

pluginManagement {
    repositories {
        jcenter()
        google()

        maven { url = uri("https://dl.bintray.com/kotlin/kotlin") }
        maven { url = uri("https://kotlin.bintray.com/kotlinx") }
    }
    resolutionStrategy.eachPlugin {
        val module = Deps.plugins[requested.id.id] ?: return@eachPlugin

        useModule(module)
    }
}

enableFeaturePreview("GRADLE_METADATA")

val properties = startParameter.projectProperties

// ./gradlew -PlibraryPublish publishToMavenLocal
val libraryPublish: Boolean = properties.containsKey("libraryPublish")

include(":time")
if (!libraryPublish) {
    include(":sample:android-app")
    include(":sample:mpp-library")
}
