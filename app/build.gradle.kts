android {
    buildToolsVersion("29.0.0")

    defaultConfig {
        applicationId = "com.buzzvil.rs.hellokotlin"
        versionCode = appConfig.versionCode
        versionName = appConfig.versionName
    }

    buildTypes {
        named("release").configure {
            isMinifyEnabled = true
            proguardFiles(getDefaultProguardFile("proguard-android.txt"), "proguard-rules.pro")
        }
        named("debug").configure {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android.txt"), "proguard-rules.pro")
        }
    }
}

dependencies {
    api(fileTree("libs") { include("*.jar") })
}