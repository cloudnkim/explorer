package com.ksjcloud.explorer.ui.base

import android.content.Context

interface baseI {
    interface Presenter<V:View> {
        fun onAttach(context: Context, appView:V)
        fun onDetach()
    }

    interface View {
        fun onShowLoading()
        fun onHideLoading()
    }
}