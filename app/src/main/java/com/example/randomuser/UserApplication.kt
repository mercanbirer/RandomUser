package com.example.randomuser

import android.app.Application
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class UserApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        timber.log.Timber.plant(timber.log.Timber.DebugTree())
    }
}