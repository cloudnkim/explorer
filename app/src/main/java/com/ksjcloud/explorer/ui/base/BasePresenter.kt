package com.ksjcloud.explorer.ui.base

import android.content.Context

open class BasePresenter<V : BaseI.View> : BaseI.Presenter<V> {

    override fun onAttach(context: Context, appView: V) {
    }

    override fun onDetach() {
    }
}