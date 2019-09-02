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
}