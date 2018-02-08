package com.jibble.test.ui.main

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.app.AppCompatActivity
import com.jibble.test.R
import com.jibble.test.di.component.DaggerActivityComponent
import com.jibble.test.di.module.ActivityModule
import com.jibble.test.ui.about.AboutFragment
import com.jibble.test.ui.list.ListFragment
import kotlinx.android.synthetic.main.activity_main.*
import javax.inject.Inject

/**
 * Created by ogulcan on 07/02/2018.
 */
class MainActivity: AppCompatActivity(), MainContract.View {

    @Inject lateinit var presenter: MainContract.Presenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        injectDependency()

        presenter.attach(this)
        // showListFragment() // as default
    }

    override fun onResume() {
        super.onResume()
        test()
    }

    override fun showAboutFragment() {
        addFragmentToActivity(AboutFragment().newInstance(), getString(R.string.fragment_about_tag), AnimType.FADE)
    }

    override fun showListFragment() {
        addFragmentToActivity(ListFragment().newInstance(), getString(R.string.fragment_list_tag), AnimType.SLIDE)
    }

    private fun injectDependency() {
        val activityComponent = DaggerActivityComponent.builder()
                .activityModule(ActivityModule(this))
                .build()

        activityComponent.inject(this)
    }

    private fun addFragmentToActivity(fragment: Fragment, tag: String, animType: AnimType) {
        supportFragmentManager.beginTransaction()
                .disallowAddToBackStack()
                .setCustomAnimations(animType.getAnimPair().first, animType.getAnimPair().second)
                .add(R.id.frame, fragment, tag)
                .commit()
    }

    private fun test() {
        //hello.setText("Hello world with kotlin extensions")
    }

    enum class AnimType() {
        SLIDE,
        FADE;

        fun getAnimPair(): Pair<Int, Int> {
            when(this) {
                SLIDE -> return Pair(R.anim.slide_left, R.anim.slide_right)
                FADE -> return Pair(R.anim.fade_in, R.anim.fade_out)
            }

            return Pair(R.anim.slide_left, R.anim.slide_right)
        }
    }
}