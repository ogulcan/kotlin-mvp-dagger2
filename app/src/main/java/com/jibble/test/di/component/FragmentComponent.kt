package com.jibble.test.di.component

import com.jibble.test.di.module.FragmentModule
import com.jibble.test.ui.about.AboutFragment
import com.jibble.test.ui.list.ListFragment
import dagger.Component

/**
 * Created by ogulcan on 07/02/2018.
 */
@Component(modules = arrayOf(FragmentModule::class))
interface FragmentComponent {

    fun inject(aboutFragment: AboutFragment)

    fun inject(listFragment: ListFragment)

}