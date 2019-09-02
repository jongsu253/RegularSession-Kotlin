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