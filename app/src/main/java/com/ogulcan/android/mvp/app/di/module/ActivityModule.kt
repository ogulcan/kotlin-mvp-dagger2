package com.ogulcan.android.mvp.app.di.module

import android.app.Activity
import com.ogulcan.android.mvp.app.ui.main.MainContract
import com.ogulcan.android.mvp.app.ui.main.MainPresenter
import dagger.Module
import dagger.Provides

/**
 * Created by ogulcan on 07/02/2018.
 */
@Module
class ActivityModule(private var activity: Activity) {

    @Provides
    fun provideActivity(): Activity {
        return activity
    }

    @Provides
    fun providePresenter(): MainContract.Presenter {
        return MainPresenter()
    }

}