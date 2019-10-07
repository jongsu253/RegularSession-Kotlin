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
        object Data {
            const val gson = "com.google.code.gson:gson:2.8.2"
            const val gsonConverter = "com.squareup.retrofit2:converter-gson:2.3.0"
            const val rxJava2Adapter = "com.squareup.retrofit2:adapter-rxjava2:2.3.0"
            const val okhttp = "com.squareup.okhttp3:okhttp:3.9.0"
            const val okhttpLoggingInterceptor = "com.squareup.okhttp3:logging-interceptor:3.9.0"
            const val retrofit2 = "com.squareup.retrofit2:retrofit:2.3.0"
        }

        object Others {
            private const val rxJava2Version = "2.2.13"
            private const val rxAndroidVersion = "2.1.1"

            const val rxJava2 = "io.reactivex.rxjava2:rxjava:$rxJava2Version"
            const val rxAndroid = "io.reactivex.rxjava2:rxandroid:$rxAndroidVersion"
        }

        object Kotlin {
            private const val kotlinCoroutineVersion = "1.2.1"

            const val jvm = "org.jetbrains.kotlin:kotlin-stdlib-jdk7:$kotlinVersion"
            const val coroutine = "org.jetbrains.kotlinx:kotlinx-coroutines-core:$kotlinCoroutineVersion"
            const val coroutineForAndroid = "org.jetbrains.kotlinx:kotlinx-coroutines-android:$kotlinCoroutineVersion"
        }

        object Androidx {
            private const val appcompatVersion = "1.0.2"
            private const val coreKtxVersion = "1.0.2"
            private const val recyclerViewVersion = "1.0.0"

            const val appcompat = "androidx.appcompat:appcompat:$appcompatVersion"
            const val coreKtx = "androidx.core:core-ktx:$coreKtxVersion"
            const val recyclerView = "androidx.recyclerview:recyclerview:$recyclerViewVersion"
        }

        object Test {
            const val junit = "junit:junit:4.12"
            const val mockitoCore = "org.mockito:mockito-core:2.19.1"
            const val mockk = "io.mockk:mockk:1.9.3.kotlin12"
        }
    }
}