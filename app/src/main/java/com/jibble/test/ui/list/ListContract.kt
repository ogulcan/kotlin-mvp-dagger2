package com.jibble.test.ui.list

import com.jibble.test.base.BaseContract
import com.jibble.test.models.User

/**
 * Created by ogulcan on 07/02/2018.
 */
class ListContract {

    interface View: BaseContract.View {
        fun showProgress(show: Boolean)
        fun showErrorMessage(error: String)
        fun loadDataSuccess(list: List<User>)
    }

    interface Presenter: BaseContract.Presenter<View> {
        fun loadData()
        fun deleteItem(item: User)
    }
}