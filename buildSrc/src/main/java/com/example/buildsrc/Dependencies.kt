package com.example.buildsrc
/**
 * To define dependencies
 */
object Dependencies {
    val androidxCore by lazy { "androidx.core:core-ktx:${Versions.androidxCore}" }
    val appCompat by lazy { "androidx.appcompat:appcompat:${Versions.appCompat}" }
    val materialDesign by lazy { "com.google.android.material:material:${Versions.material}" }
    val constraintLayout by lazy { "androidx.constraintlayout:constraintlayout:${Versions.constraintLayout}" }

    val junit by lazy { "junit:junit:${Versions.jUnit}" }
    val jUnitExt by lazy { "androidx.test.ext:junit:${Versions.jUnitExt}" }
    val espresso by lazy { "androidx.test.espresso:espresso-core:${Versions.espresso}" }

    val retrofit by lazy { "com.squareup.retrofit2:retrofit:${Versions.retrofit_version}" }
    val retrofitGsonConverter by lazy { "com.squareup.retrofit2:converter-gson:${Versions.retrofit_version}" }
    val okhttp by lazy { "com.squareup.okhttp3:okhttp:${Versions.okhttp_version}" }
    val okhttpLoggingInterceptor by lazy { "com.squareup.okhttp3:logging-interceptor:${Versions.okhttp_version}" }
    val gson by lazy { "com.google.code.gson:gson:${Versions.gson_version}" }

    val coroutines by lazy { "org.jetbrains.kotlinx:kotlinx-coroutines-android:${Versions.coroutines_version}" }
    val lifecycleViewModel by lazy { "androidx.lifecycle:lifecycle-viewmodel-ktx:${Versions.lifecycle_version}" }
    val lifecycleLiveData by lazy { "androidx.lifecycle:lifecycle-livedata-ktx:${Versions.lifecycle_version}" }
    val lifecycleRuntime by lazy { "androidx.lifecycle:lifecycle-runtime-ktx:${Versions.lifecycle_version}" }

    val daggerHilt by lazy { "com.google.dagger:hilt-android:${Versions.hilt_version}" }
    val daggerHiltCompiler by lazy { "com.google.dagger:hilt-compiler:${Versions.hilt_version}" }

    val ssp by lazy { "com.intuit.ssp:ssp-android:${Versions.ssp_sdp_version}" }
    val sdp by lazy { "com.intuit.sdp:sdp-android:${Versions.ssp_sdp_version}" }

    val navigationFragmentKtx by lazy { "androidx.navigation:navigation-fragment-ktx:${Versions.nav_version}" }
    val navigationUiKtx by lazy { "androidx.navigation:navigation-ui-ktx:${Versions.nav_version}" }

    val glide by lazy { "com.github.bumptech.glide:glide:${Versions.glide_version}" }

    val lottie by lazy { "com.airbnb.android:lottie:${Versions.lottie_version}" }

    val encryptedPref by lazy { "androidx.security:security-crypto:${Versions.encryptedPref_version}" }

    val timber by lazy { "com.jakewharton.timber:timber:${Versions.timber_version}" }
    val chuckerDebug by lazy { "com.github.chuckerteam.chucker:library:${Versions.chucker_version}" }
    val chuckerRelease by lazy { "com.github.chuckerteam.chucker:library-no-op:${Versions.chucker_version}" }
    val leakcanary by lazy { "com.squareup.leakcanary:leakcanary-android:${Versions.leakcanary_version}" }

}