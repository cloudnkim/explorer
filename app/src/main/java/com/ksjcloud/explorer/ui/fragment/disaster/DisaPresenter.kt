package com.ksjcloud.explorer.ui.fragment.disaster

import android.content.Context
import com.ksjcloud.explorer.ui.base.BasePresenter

class DisaPresenter<V:DisaI.View> : BasePresenter<V>(), DisaI.Presenter<V> {
    override fun onAttach(context: Context, appView: V) {
        super.onAttach(context, appView)
    }

    override fun onDetach() {
        super.onDetach()
    }
}