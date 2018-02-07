package com.jibble.test.di.component

import com.jibble.test.di.module.ActivityModule
import com.jibble.test.ui.main.MainActivity
import dagger.Component

/**
 * Created by ogulcan on 07/02/2018.
 */
@Component(modules = arrayOf(ActivityModule::class))
interface ActivityComponent {

    fun inject(mainActivity: MainActivity)

}