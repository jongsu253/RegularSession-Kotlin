import com.android.build.gradle.BaseExtension

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
}