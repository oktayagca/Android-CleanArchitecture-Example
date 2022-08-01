plugins {
    id("com.android.library")
    id("org.jetbrains.kotlin.android")
}

android {
    compileSdk = 32

    defaultConfig {
        minSdk = 21
        targetSdk = 32

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        consumerProguardFiles("consumer-rules.pro")
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }

    buildFeatures{
        viewBinding = true
    }
}

dependencies {

    implementation(com.example.buildsrc.Dependencies.androidxCore)
    implementation(com.example.buildsrc.Dependencies.appCompat)
    implementation(com.example.buildsrc.Dependencies.materialDesign)
    testImplementation(com.example.buildsrc.Dependencies.junit)
    androidTestImplementation(com.example.buildsrc.Dependencies.jUnitExt)
    androidTestImplementation(com.example.buildsrc.Dependencies.espresso)

}