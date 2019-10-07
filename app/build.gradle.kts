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

    api(Config.Libs.Androidx.recyclerView)

    api(Config.Libs.Others.rxJava2)
    api(Config.Libs.Others.rxAndroid)

    api(Config.Libs.Data.gson)
    api(Config.Libs.Data.gsonConverter)
    api(Config.Libs.Data.rxJava2Adapter)
    api(Config.Libs.Data.okhttp)
    api(Config.Libs.Data.okhttpLoggingInterceptor)
    api(Config.Libs.Data.retrofit2)

    testImplementation(Config.Libs.Test.junit)
    testImplementation(Config.Libs.Test.mockk)
}