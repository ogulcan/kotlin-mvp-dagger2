package com.jibble.test.ui.about

import io.reactivex.disposables.CompositeDisposable

/**
 * Created by ogulcan on 07/02/2018.
 */
class AboutPresenter: AboutContract.Presenter {

    //private val subscriptions = CompositeDisposable()
    private lateinit var view: AboutContract.View

    override fun subscribe() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun unsubscribe() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun attach(view: AboutContract.View) {
        this.view = view
    }

}