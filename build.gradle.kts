// Top-level build file where you can add configuration options common to all sub-projects/modules.


buildscript {

    val hiltVersion by extra(com.example.buildsrc.Versions.hilt_version)

    repositories {
        google()
        mavenCentral()
    }

    dependencies {
        classpath("com.google.dagger:hilt-android-gradle-plugin:$hiltVersion")
       // classpath "androidx.navigation:navigation-safe-args-gradle-plugin:$nav_version"

    }
}
plugins {
    id ("com.android.application") version "7.2.1" apply false
    id ("com.android.library") version "7.2.1" apply false
    id ( "org.jetbrains.kotlin.android") version "1.7.0" apply false
    id ("org.jetbrains.kotlin.jvm") version "1.7.0" apply false
}

tasks.register("clean",Delete::class){
    delete(rootProject.buildDir)
}
