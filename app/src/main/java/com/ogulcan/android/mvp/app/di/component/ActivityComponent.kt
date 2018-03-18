package com.ogulcan.android.mvp.app.di.component

import com.ogulcan.android.mvp.app.di.module.ActivityModule
import com.ogulcan.android.mvp.app.ui.main.MainActivity
import dagger.Component

/**
 * Created by ogulcan on 07/02/2018.
 */
@Component(modules = arrayOf(ActivityModule::class))
interface ActivityComponent {

    fun inject(mainActivity: MainActivity)

}