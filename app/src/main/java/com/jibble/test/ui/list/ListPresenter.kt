package com.jibble.test.ui.list

import android.util.Log
import com.jibble.test.api.ApiServiceInterface
import com.jibble.test.models.Post
import com.jibble.test.models.User
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.schedulers.Schedulers
import javax.inject.Inject

/**
 * Created by ogulcan on 07/02/2018.
 */
class ListPresenter: ListContract.Presenter {

    @Inject lateinit var api: ApiServiceInterface

    private val subscriptions = CompositeDisposable()
    private lateinit var view: ListContract.View

    override fun subscribe() {

    }

    override fun unsubscribe() {
        subscriptions.clear()
    }

    override fun attach(view: ListContract.View) {
        this.view = view
    }

    override fun loadData() {
        var subscribe = api.getUserList().subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe({ list: List<User>? ->
                    print("List size: " + list!!.count())
                })

        subscriptions.add(subscribe)
    }

    override fun deleteItem(item: Post) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

}