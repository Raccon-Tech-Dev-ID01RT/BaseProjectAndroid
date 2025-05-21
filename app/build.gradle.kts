import org.gradle.kotlin.dsl.implementation

plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)
    alias(libs.plugins.google.devtools.ksp)
    alias(libs.plugins.kotlin.serialization)
    alias(libs.plugins.google.gms.google.services)
    alias(libs.plugins.google.firebase.crashlytics)
}

android {
    namespace = "com.raccoontech.baseproject.android"
    compileSdk = 35

    defaultConfig {
        applicationId = "com.raccoontech.baseproject.android"
        minSdk = 24
        targetSdk = 35
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {

        debug {
            isMinifyEnabled = false
            isShrinkResources = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
            resValue(
                "string",
                "admob_app_id",
                "ca-app-pub-3940256099942544~3347511713"
            )

            // Splash
            resValue(
                "string",
                "admob_splash_interstitial_ad_unit",
                "ca-app-pub-3940256099942544/1033173712"
            )
            resValue(
                "string",
                "admob_splash_app_open_ad_unit",
                "ca-app-pub-3940256099942544/9257395921"
            )
            // Language Native
            resValue(
                "string",
                "admob_languages_native_ad_unit",
                "ca-app-pub-3940256099942544/2247696110"
            )
            // Get Answer Interstitial
            resValue(
                "string",
                "admob_getanswer_interstitial_ad_unit",
                "ca-app-pub-3940256099942544/1033173712"
            )
            // ChatBot BackPress Interstitial
            resValue(
                "string",
                "admob_chatbot_backpress_interstitial_ad_unit",
                "ca-app-pub-3940256099942544/1033173712"
            )

            // Text enhancer + text generate banner
            resValue(
                "string",
                "admob_writing_assistant_banner_ad_unit",
                "ca-app-pub-3940256099942544/2014213617"
            )

            // Text enhancer + text generate Inter
            resValue(
                "string",
                "admob_writing_assistant_generate_interstitial_ad_unit",
                "ca-app-pub-3940256099942544/1033173712"
            )
            // Bookmark collapse banner
            resValue(
                "string",
                "admob_bookmarks_banner_ad_unit",
                "ca-app-pub-3940256099942544/2014213617"
            )

            // Result Screen adaptive banner
            resValue(
                "string",
                "admob_result_screen_banner_ad_unit",
                "ca-app-pub-3940256099942544/2014213617"
            )


            resValue("string", "admob_app_open_ad_unit", "ca-app-pub-3940256099942544/9257395921")
            resValue("string", "admob_rewarded_ad_unit", "ca-app-pub-3940256099942544/5354046379")
            resValue("string", "attempt_number_limit", "7")
        }

        release {
            isMinifyEnabled = true
            isShrinkResources = true
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
            resValue("string", "admob_app_id", "ca-app-pub-3940256099942544~3347511713")

            // Splash
            resValue(
                "string",
                "admob_splash_interstitial_ad_unit",
                "ca-app-pub-3940256099942544/1033173712"
            )
            resValue(
                "string",
                "admob_splash_app_open_ad_unit",
                ""
            )

            // Language smart native
            resValue(
                "string",
                "admob_languages_native_ad_unit",
                "ca-app-pub-3940256099942544/2247696110"
            )
            // Get Answer Interstitial
            resValue(
                "string",
                "admob_getanswer_interstitial_ad_unit",
                ""
            )
            // ChatBot BackPress Interstitial
            resValue(
                "string",
                "admob_chatbot_backpress_interstitial_ad_unit",
                ""
            )

            // Text enhancer + text generate banner
            resValue(
                "string",
                "admob_writing_assistant_banner_ad_unit",
                ""
            )

            // Text enhancer + text generate Inter
            resValue(
                "string",
                "admob_writing_assistant_generate_interstitial_ad_unit",
                ""
            )

            // Bookmark collapse banner
            resValue(
                "string",
                "admob_bookmarks_banner_ad_unit",
                ""
            )

            // Result Screen adaptive banner
            resValue(
                "string",
                "admob_result_screen_banner_ad_unit",
                ""
            )


            resValue("string", "admob_app_open_ad_unit", "")
            resValue("string", "admob_rewarded_ad_unit", "")
        }

    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
    kotlinOptions {
        jvmTarget = "17"
    }

    buildFeatures {
        viewBinding = true
        resValues = true
        buildConfig = true
    }

    bundle {
        language {
            enableSplit = false
        }
    }
}

dependencies {

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    implementation(libs.androidx.activity)
    implementation(libs.androidx.constraintlayout)

    // Unit Testing
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)


    // Splash Screen Api
    implementation(libs.androidx.core.splashscreen)

    // Navigational Components
    implementation(libs.androidx.navigation.fragment.ktx)
    implementation(libs.androidx.navigation.ui.ktx)

    // Lifecycle
    implementation(libs.androidx.lifecycle.viewmodel.ktx)
    implementation(libs.androidx.fragment.ktx)

    // Glide
    implementation(libs.glide)

    // Dependency Injection -> Koin
    implementation(libs.koin.android)
    implementation(libs.koin.core.coroutines)

    //Shimmer
    implementation(libs.shimmer)

    ///lottie
    implementation(libs.lottie)

    // SDP layout size && SSP Text sizes
    implementation(libs.sdp.android)
    implementation(libs.ssp.android)

    // Coroutines
    implementation(libs.kotlinx.coroutines.android)

    // Admob ads
    implementation(libs.play.services.ads)

    // App Update
    implementation(libs.app.update)
    implementation(libs.app.update.ktx)

    // Work
    implementation(libs.androidx.work.runtime.ktx)

    // Firebase configuration
    implementation(platform(libs.firebase.bom))
    implementation(libs.firebase.config)
    implementation(libs.firebase.analytics)
    implementation(libs.firebase.crashlytics)
}