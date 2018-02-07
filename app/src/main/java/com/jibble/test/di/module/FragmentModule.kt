package com.jibble.test.di.module

import com.jibble.test.api.ApiServiceInterface
import com.jibble.test.ui.about.AboutContract
import com.jibble.test.ui.about.AboutPresenter
import com.jibble.test.ui.list.ListContract
import com.jibble.test.ui.list.ListPresenter
import dagger.Module
import dagger.Provides

/**
 * Created by ogulcan on 07/02/2018.
 */
@Module
class FragmentModule {

    @Provides
    fun provideAboutPresenter(): AboutContract.Presenter {
        return AboutPresenter()
    }

    @Provides
    fun provideListPresenter(): ListContract.Presenter {
        return ListPresenter()
    }

    @Provides
    fun provideApiService(): ApiServiceInterface {
        return ApiServiceInterface.create()
    }
}