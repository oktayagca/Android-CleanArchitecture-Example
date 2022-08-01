import com.example.buildsrc.ConfigData
import com.example.buildsrc.Dependencies


plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
}

android {
    compileSdk = (ConfigData.compileSdkVersion)
    buildToolsVersion = ConfigData.buildToolsVersion

    defaultConfig {
        applicationId = ConfigData.applicationId
        minSdk = (ConfigData.minSdkVersion)
        targetSdk =  (ConfigData.targetSdkVersion)
        versionCode = (ConfigData.versionCode)
        versionName = ConfigData.versionName

        testInstrumentationRunner = ConfigData.testInstrumentationRunner
    }

    buildTypes {
        release {
            isMinifyEnabled  = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }
/*
    productFlavors {
        create("forStore") {
            applicationId = "com.example.androidcleanarchitectureexample"
        }
        create("forTest") {
            applicationId = "com.example.androidcleanarchitectureexample"
        }
    }

 */

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }

    kotlinOptions {
        jvmTarget = JavaVersion.VERSION_1_8.toString()
    }
}

dependencies {

    implementation (Dependencies.androidxCore)
    implementation (Dependencies.appCompat)
    implementation (Dependencies.materialDesign)
    implementation (Dependencies.androidxCore)
    implementation (Dependencies.constraintLayout)
    testImplementation(Dependencies.junit)
    androidTestImplementation(Dependencies.jUnitExt)
    androidTestImplementation(Dependencies.espresso)
}