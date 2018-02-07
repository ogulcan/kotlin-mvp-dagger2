package com.jibble.test.di.component

import com.jibble.test.BaseApp
import com.jibble.test.di.module.ApplicationModule
import dagger.Component

/**
 * Created by ogulcan on 07/02/2018.
 */
@Component(modules = arrayOf(ApplicationModule::class))
interface ApplicationComponent {

    fun inject(application: BaseApp)

}