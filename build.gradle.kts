import com.android.build.gradle.BaseExtension

plugins {
    java
}

buildscript {
    repositories {
        google()
        jcenter()
    }

    dependencies {
        classpath(Config.Plugins.androidGradle)
        classpath(Config.Plugins.kotlinGradle)
    }
}

allprojects {
    repositories {
        google()
        jcenter()
    }
}

val app = listOf("app")

subprojects {
    if (name in app) {
        apply(plugin = "com.android.application")
    }

    apply(plugin = "kotlin-android")
    apply(plugin = "kotlin-android-extensions")

    configure<BaseExtension> {
        compileSdkVersion(Config.SdkVersions.compile)

        defaultConfig {
            targetSdkVersion(Config.SdkVersions.target)
            minSdkVersion(Config.SdkVersions.min)
        }
    }

    dependencies {
        compileOnly(Config.Libs.Kotlin.jvm)
        compileOnly(Config.Libs.Kotlin.coroutine)
        compileOnly(Config.Libs.Kotlin.coroutineForAndroid)

        api(Config.Libs.Androidx.appcompat)
        api(Config.Libs.Androidx.coreKtx)

        testImplementation(Config.Libs.Test.junit)
        testImplementation(Config.Libs.Test.mockitoCore)
    }
}

fun DependencyHandlerScope.api(dependencyNotation: Any): Dependency? =
    add("api", dependencyNotation)
