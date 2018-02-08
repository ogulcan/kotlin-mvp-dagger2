package com.jibble.test.ui.list

import android.content.Context
import android.support.v4.app.Fragment
import android.support.v7.widget.RecyclerView
import android.view.View
import android.view.ViewGroup
import com.jibble.test.models.User

/**
 * Created by ogulcan on 07/02/2018.
 */
class ListAdapter(private val context: Context, private val list: MutableList<User>,
                  fragmet: Fragment): RecyclerView.Adapter<ListAdapter.ListViewHolder>() {

    override fun getItemCount(): Int {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onBindViewHolder(holder: ListViewHolder?, position: Int) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): ListViewHolder {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    class ListViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView) {

    }
}