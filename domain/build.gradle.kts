plugins {
    id("com.android.library")
    id("org.jetbrains.kotlin.android")
}

android {
    compileSdk = (com.example.buildsrc.ConfigData.compileSdkVersion)

    defaultConfig {
        minSdk = (com.example.buildsrc.ConfigData.minSdkVersion)
        targetSdk = (com.example.buildsrc.ConfigData.targetSdkVersion)
        testInstrumentationRunner = com.example.buildsrc.ConfigData.testInstrumentationRunner
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
}

dependencies {

    implementation(com.example.buildsrc.Dependencies.androidxCore)
    implementation(com.example.buildsrc.Dependencies.appCompat)
    implementation(com.example.buildsrc.Dependencies.materialDesign)
    testImplementation(com.example.buildsrc.Dependencies.junit)
    androidTestImplementation(com.example.buildsrc.Dependencies.jUnitExt)
    androidTestImplementation(com.example.buildsrc.Dependencies.espresso)

    //implementation(com.example.buildsrc.Dependencies.retrofit)
    //implementation(com.example.buildsrc.Dependencies.retrofitGsonConverter)
    //implementation(com.example.buildsrc.Dependencies.okhttp)
    //implementation(com.example.buildsrc.Dependencies.okhttpLoggingInterceptor)

    implementation(com.example.buildsrc.Dependencies.coroutines)

    implementation(project(mapOf("path" to ":data")))
}
