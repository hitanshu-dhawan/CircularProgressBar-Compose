package com.hitanshudhawan.circularprogressbar.buildsrc

object Libs {

    const val androidGradlePlugin = "com.android.tools.build:gradle:7.0.0-beta04"

    const val material = "com.google.android.material:material:1.2.0"

    object Kotlin {
        private const val version = "1.5.10"
        const val stdlib = "org.jetbrains.kotlin:kotlin-stdlib-jdk8:$version"
        const val gradlePlugin = "org.jetbrains.kotlin:kotlin-gradle-plugin:$version"
        const val extensions = "org.jetbrains.kotlin:kotlin-android-extensions:$version"
    }

    object KtLint {
        private const val version = "10.1.0"
        const val gradlePlugin = "org.jlleitschuh.gradle:ktlint-gradle:$version"
    }

    object AndroidX {

        object Activity {
            private const val version = "1.3.0-rc01"
            const val activityCompose = "androidx.activity:activity-compose:$version"
        }

        object Compose {
            const val version = "1.0.0-rc01"

            const val foundation = "androidx.compose.foundation:foundation:$version"
            const val layout = "androidx.compose.foundation:foundation-layout:$version"
            const val ui = "androidx.compose.ui:ui:$version"
            const val material = "androidx.compose.material:material:$version"
            const val materialIconsExtended = "androidx.compose.material:material-icons-extended:$version"
            const val animation = "androidx.compose.animation:animation:$version"
            const val runtime = "androidx.compose.runtime:runtime:$version"
            const val runtimeLiveData = "androidx.compose.runtime:runtime-livedata:$version"
            const val tooling = "androidx.compose.ui:ui-tooling:$version"
        }
    }
}