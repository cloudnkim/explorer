package com.ksjcloud.explorer.ui.base

import android.content.Context

class basePresenter<V : baseI.View> : baseI.Presenter<V> {
    override fun onAttach(context: Context, appView: V) {
    }

    override fun onDetach() {
    }
}