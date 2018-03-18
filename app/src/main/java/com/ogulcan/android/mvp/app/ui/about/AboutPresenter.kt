package com.ogulcan.android.mvp.app.ui.about

import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import io.reactivex.Observable
import java.util.concurrent.TimeUnit


/**
 * Created by ogulcan on 07/02/2018.
 */
class AboutPresenter: AboutContract.Presenter {

    //private val subscriptions = CompositeDisposable()
    private lateinit var view: AboutContract.View

    override fun subscribe() {

    }

    override fun unsubscribe() {

    }

    override fun attach(view: AboutContract.View) {
        this.view = view
    }

    override fun loadMessage() {
        // Wait for a moment
        Observable.just(true).delay(1000, TimeUnit.MILLISECONDS)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe({
                    view.showProgress(false)
                    view.loadMessageSuccess("Success")
                })
    }
}