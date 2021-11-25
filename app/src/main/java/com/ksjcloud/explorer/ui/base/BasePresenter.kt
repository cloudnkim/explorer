package com.ksjcloud.explorer.ui.base

import android.content.Context

open class BasePresenter<V : BaseI.View> : BaseI.Presenter<V> {

    lateinit var mBaseActivity: BaseActivity
    lateinit var mAppView:V

    override fun onAttach(context: Context, appView: V) {
        mAppView = appView
    }

    override fun onAttach(context: Context, baseActivity: BaseActivity, appView: V) {
        mBaseActivity = baseActivity
        mAppView = appView
    }

    override fun onDetach() {
    }
}