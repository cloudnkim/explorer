package com.ksjcloud.explorer.ui.fragment.disaster

import android.content.Context
import com.ksjcloud.explorer.ui.base.basePresenter

class disaPresenter<V:disaI.View> : basePresenter<V>(), disaI.Presenter<V> {
    override fun onAttach(context: Context, appView: V) {
        super.onAttach(context, appView)
    }

    override fun onDetach() {
        super.onDetach()
    }
}