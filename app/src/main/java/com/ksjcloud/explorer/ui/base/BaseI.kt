package com.ksjcloud.explorer.ui.base

import android.content.Context

interface BaseI {
    interface Presenter<V:View> {
        fun onAttach(context: Context, appView:V)
        fun onAttach(context: Context, baseActivity: BaseActivity, appView:V)
        fun onDetach()
    }

    interface View {
        fun onShowLoading()
        fun onHideLoading()
    }
}