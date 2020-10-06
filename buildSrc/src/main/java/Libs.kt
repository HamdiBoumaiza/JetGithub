package com.hb.jetgithub.buildsrc

object Libs {

    object Compose {
        const val version = "1.0.0-alpha01"
        const val runtime = "androidx.compose.runtime:runtime:$version"
        const val foundation = "androidx.compose.foundation:foundation:${version}"
        const val layout = "androidx.compose.foundation:foundation-layout:${version}"
        const val ui = "androidx.compose.ui:ui:${version}"
        const val material = "androidx.compose.material:material:${version}"
        const val animation = "androidx.compose.animation:animation:${version}"
        const val tooling = "androidx.ui:ui-tooling:${version}"
        const val iconsExtended = "androidx.compose.material:material-icons-extended:$version"
    }


    const val stdlib = "org.jetbrains.kotlin:kotlin-stdlib-jdk8:${Versions.kotlin}"
    const val appcompat = "androidx.appcompat:appcompat:${Versions.appCompact}"
    const val coreKtx = "androidx.core:core-ktx:${Versions.coreKtx}"
    const val material = "com.google.android.material:material:${Versions.materialAndroid}"

    //Retrofit2
    const val retrofit = "com.squareup.retrofit2:retrofit:${Versions.retrofit}"
    const val retrofitGsonConverter = "com.squareup.retrofit2:converter-gson:${Versions.retrofit}"

    //Okhttp
    const val okhttp = "com.squareup.okhttp3:okhttp:${Versions.okhttp3}"
    const val okhttpLogging = "com.squareup.okhttp3:logging-interceptor:${Versions.okhttp3}"

    //Stetho interceptor
    const val stetho = "com.facebook.stetho:stetho:${Versions.stetho}"
    const val stethoOkhttp3 = "com.facebook.stetho:stetho-okhttp3:${Versions.stetho}"

    //dagger Hilt

    const val daggerHiltAndroid = "com.google.dagger:hilt-android:${Versions.dagger}"
    const val daggerCommon = "androidx.hilt:hilt-common:${Versions.daggerHilt}"
    const val daggerViewModel = "androidx.hilt:hilt-lifecycle-viewmodel:${Versions.daggerHilt}"
    const val daggerCompiler = "com.google.dagger:hilt-compiler:${Versions.dagger}"
    const val daggerHiltCompiler = "androidx.hilt:hilt-compiler:${Versions.daggerHilt}"


    //lifecycle
    const val lifecycleExtension = "androidx.lifecycle:lifecycle-extensions:${Versions.lifecycle}"
    const val lifecycleViewModel = "androidx.lifecycle:lifecycle-viewmodel-ktx:${Versions.lifecycle}"
    const val lifecycleRuntime = "androidx.lifecycle:lifecycle-runtime-ktx:${Versions.lifecycle}"

    //Coroutines
    const val coroutinesCore = "org.jetbrains.kotlinx:kotlinx-coroutines-core:${Versions.coroutine}"
    const val coroutinesAndroid =
        "org.jetbrains.kotlinx:kotlinx-coroutines-android:${Versions.coroutine}"

    const val timber = "com.jakewharton.timber:timber:${Versions.timber}"

    const val coil = "dev.chrisbanes.accompanist:accompanist-coil:${Versions.accompanist}"

    const val room = "androidx.room:room-runtime:${Versions.room}"
    const val roomKtx = "androidx.room:room-ktx:${Versions.room}"
    const val roomCompiler = "androidx.room:room-compiler:${Versions.room}"

    const val activityKtx = "androidx.activity:activity-ktx:${Versions.activityKtx}"
    const val fragmentKtx = "androidx.fragment:fragment-ktx:${Versions.fragmentKtx}"

    object Test {
        const val junit = "junit:junit:4.13"
        const val espressoCore = "androidx.test.espresso:espresso-core:3.3.0"
        private const val CoroutinesVersion = "1.3.9"
        const val coroutinesTest = "org.jetbrains.kotlinx:kotlinx-coroutines-test:$CoroutinesVersion"

        private const val version = "1.2.0"
        const val core = "androidx.test:core:$version"
        const val rules = "androidx.test:rules:$version"

        object Ext {
            private const val version = "1.1.2-rc01"
            const val junitExtension = "androidx.test.ext:junit-ktx:$version"
        }
    }
}