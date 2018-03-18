package com.ogulcan.android.mvp.app.ui.about

import com.ogulcan.android.mvp.app.ui.base.BaseContract

/**
 * Created by ogulcan on 07/02/2018.
 */
class AboutContract {

    interface View: BaseContract.View {
        fun showProgress(show: Boolean)
        fun loadMessageSuccess(message: String)
        // fun loadMessageError() // When it's a real request, this function should be implemented, too
    }

    interface Presenter: BaseContract.Presenter<View> {
        fun loadMessage() // Let's assume that this will be a retrofit request
    }
}