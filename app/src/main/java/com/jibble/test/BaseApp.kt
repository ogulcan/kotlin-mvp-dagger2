package com.jibble.test

import android.app.Application

/**
 * Created by ogulcan on 07/02/2018.
 */
class BaseApp: Application() {

    override fun onCreate() {
        super.onCreate()
        if (BuildConfig.DEBUG) {
            // Maybe TimberPlant etc.
        }
    }
}