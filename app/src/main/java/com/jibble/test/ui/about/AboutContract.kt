package com.jibble.test.ui.about

import com.jibble.test.base.BaseContract

/**
 * Created by ogulcan on 07/02/2018.
 */
class AboutContract {

    interface View: BaseContract.View {
        fun showProgress(_show: Boolean)
        fun showMessage(_message: String)
    }

    interface Presenter: BaseContract.Presenter<View> {

    }
}