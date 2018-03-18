package com.ogulcan.android.mvp.app.di.module

import com.ogulcan.android.mvp.app.api.ApiServiceInterface
import com.ogulcan.android.mvp.app.ui.about.AboutContract
import com.ogulcan.android.mvp.app.ui.about.AboutPresenter
import com.ogulcan.android.mvp.app.ui.list.ListContract
import com.ogulcan.android.mvp.app.ui.list.ListPresenter
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