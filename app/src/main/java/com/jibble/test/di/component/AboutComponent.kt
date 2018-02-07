package com.jibble.test.di.component

import com.jibble.test.di.module.AboutModule
import com.jibble.test.ui.about.AboutFragment
import dagger.Component

/**
 * Created by ogulcan on 07/02/2018.
 */
@Component(modules = arrayOf(AboutModule::class))
interface AboutComponent {

    fun inject(aboutFragment: AboutFragment)

}