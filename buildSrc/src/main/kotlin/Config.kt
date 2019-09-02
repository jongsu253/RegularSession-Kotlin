object Config {
    private const val kotlinVersion = "1.3.41"

    object SdkVersions {
        const val compile = 28
        const val target = 28
        const val min = 15
    }

    object Plugins {
        const val androidGradle = "com.android.tools.build:gradle:3.2.1"
        const val kotlinGradle = "org.jetbrains.kotlin:kotlin-gradle-plugin:$kotlinVersion"
    }

    object Libs {
        object Kotlin {
            private const val kotlinCoroutineVersion = "1.2.1"

            const val jvm = "org.jetbrains.kotlin:kotlin-stdlib-jdk7:$kotlinVersion"
            const val coroutine = "org.jetbrains.kotlinx:kotlinx-coroutines-core:$kotlinCoroutineVersion"
            const val coroutineForAndroid = "org.jetbrains.kotlinx:kotlinx-coroutines-android:$kotlinCoroutineVersion"
        }

        object Androidx {
            private const val appcompatVersion = "1.0.2"
            private const val coreKtxVersion = "1.0.2"

            const val appcompat = "androidx.appcompat:appcompat:$appcompatVersion"
            const val coreKtx = "androidx.core:core-ktx:$coreKtxVersion"
        }

        object Test {
            const val junit = "junit:junit:4.12"
            const val mockitoCore = "org.mockito:mockito-core:2.19.1"
        }
    }
}