package com.example.timberlibsampleapp

import android.app.Application
import com.microsoft.appcenter.AppCenter
import com.microsoft.appcenter.analytics.Analytics
import com.microsoft.appcenter.crashes.Crashes
import timber.log.Timber
import timber.log.Timber.DebugTree


class MyApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        //Timber initialization need logs only when in debug mode
        //good to do here
        if (BuildConfig.DEBUG) {
            //need to plant debug  tree to get logs
            Timber.plant(DebugTree())
        }
        //Hockey Sdk setup
        AppCenter.start(
            this,
            "16d06c09-d6d6-401a-ac90-3c9b2ffd228a",
            Analytics::class.java,
            Crashes::class.java
        )
    }
}