package com.jibble.test.di.module

import android.app.Application
import com.jibble.test.BaseApp
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

/**
 * Created by ogulcan on 07/02/2018.
 */
@Module
class ApplicationModule(private val baseApp: BaseApp) {

    @Provides
    @Singleton
    fun provideApplication(): Application {
        return baseApp
    }
}