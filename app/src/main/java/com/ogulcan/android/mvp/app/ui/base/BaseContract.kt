package com.ogulcan.android.mvp.app.ui.base

/**
 * Created by ogulcan on 07/02/2018.
 */
class BaseContract {

    interface Presenter<in T> {
        fun subscribe()
        fun unsubscribe()
        fun attach(view: T)
    }

    interface View {

    }
}