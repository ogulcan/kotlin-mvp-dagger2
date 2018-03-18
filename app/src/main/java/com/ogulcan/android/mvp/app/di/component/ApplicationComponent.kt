package com.ogulcan.android.mvp.app.di.component

import com.ogulcan.android.mvp.app.BaseApp
import com.ogulcan.android.mvp.app.di.module.ApplicationModule
import dagger.Component

/**
 * Created by ogulcan on 07/02/2018.
 */
@Component(modules = arrayOf(ApplicationModule::class))
interface ApplicationComponent {

    fun inject(application: BaseApp)

}