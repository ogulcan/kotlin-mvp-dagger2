package com.jibble.test.ui.list

import android.util.Log
import com.jibble.test.api.ApiServiceInterface
import com.jibble.test.models.Album
import com.jibble.test.models.DetailsViewModel
import com.jibble.test.models.Post
import com.jibble.test.models.User
import io.reactivex.Observable
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.functions.Function3
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
        var subscribe = api.getPostList().subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe({ list: List<Post>? ->
                    view.showProgress(false)
                    view.loadDataSuccess(list!!.take(10))
                }, { error ->
                    view.showProgress(false)
                    view.showErrorMessage(error.localizedMessage)
                })

        subscriptions.add(subscribe)
    }

    override fun loadDataAll() {
        var subscribe = Observable.zip(api.getPostList(), api.getUserList(), api.getAlbumList(),
                Function3<List<Post>, List<User>, List<Album>, DetailsViewModel> {
                    posts, users, albums ->
                    DetailsViewModel(posts, users, albums)
                }).subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe({ model: DetailsViewModel? ->
                     // TODO: Implement callback to update view
                },{ error ->
                    view.showProgress(false)
                    view.showErrorMessage(error.localizedMessage)
                })

        subscriptions.add(subscribe)
    }

    private fun createDetailsViewModel(posts: List<Post>, users: List<User>, albums: List<Album>): DetailsViewModel {
        val postList = posts.take(10)
        val userList = users.take(10)
        val albumList = albums.take(10)
        return DetailsViewModel(posts, users, albums)
    }

    override fun deleteItem(item: Post) {
        //api.deleteUser(item.id)
    }
}