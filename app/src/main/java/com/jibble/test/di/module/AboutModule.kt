package com.jibble.test.di.module

import com.jibble.test.ui.about.AboutContract
import com.jibble.test.ui.about.AboutPresenter
import dagger.Module
import dagger.Provides

/**
 * Created by ogulcan on 07/02/2018.
 */
@Module
class AboutModule {

    @Provides
    fun getAboutPresenter(): AboutContract.Presenter {
        return AboutPresenter()
    }
}