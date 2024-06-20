plugins {
    alias(libs.plugins.androidApplication)
    alias(libs.plugins.jetbrainsKotlinAndroid)
    id("com.google.devtools.ksp")
}

android {
    namespace = "com.example.alkewallet1"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.alkewallet1"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
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
    buildFeatures {
        viewBinding = true
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
    viewBinding{
        enable = true
    }
    dataBinding{
        enable = true
    }
}

dependencies {

    // ViewModel
    implementation(libs.lifecycle.viewmodel.ktx)
    // LiveData
    implementation(libs.lifecycle.livedata.ktx)

    // Retrofit
// Ref: https://square.github.io/retrofit/
    implementation(libs.retrofit)
// GSON para convertir JSON a Kotlin
// Ref: https://github.com/google/gson
    implementation(libs.gson)
// Retrofit the solicitará un Factory y este necesita Retrofit GSON Converter
// Ref: https://github.com/square/retrofit/tree/trunk/retrofit-converters/gson
    implementation(libs.converter.gson)
// Picasso
// Ref: https://github.com/square/picasso)
    implementation(libs.picasso)
// Room (Base de Datos)
    implementation(libs.room.runtime)
// To use Kotlin Symbol Processing (KSP)
    ksp(libs.room.compiler)
// Kotlin Extensions and Coroutines support for Room
    implementation(libs.room.ktx)



    implementation(libs.navigation.fragment)
    implementation(libs.navigation.ui)
    implementation(libs.appcompat)
    implementation(libs.material)
    implementation(libs.activity)
    implementation(libs.constraintlayout)
    implementation(libs.navigation.fragment)
    implementation(libs.navigation.ui)
    implementation(libs.core.ktx)
    testImplementation(libs.junit)
    androidTestImplementation(libs.ext.junit)
    androidTestImplementation(libs.espresso.core)
}