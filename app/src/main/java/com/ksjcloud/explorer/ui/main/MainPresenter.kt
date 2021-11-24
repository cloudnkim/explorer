package com.ksjcloud.explorer.ui.main

import android.content.Context
import com.ksjcloud.explorer.ui.base.baseI

class MainPresenter<V:MainI.View> : baseI.Presenter<V> {
    var mContext:Context ?= null
    var mAppView:MainI.View ?= null

    override fun onAttach(context: Context, appView: V) {
        mContext = context
        mAppView = appView
    }

    override fun onDetach() {
        mContext = null
        mAppView = null
    }
}