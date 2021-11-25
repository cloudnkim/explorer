package com.ksjcloud.explorer.ui.fragment.defstate

import android.content.Context
import com.ksjcloud.explorer.ui.base.BasePresenter

class DefsPresenter<V : DefsI.View> : BasePresenter<V>(), DefsI.Presenter<V> {

    lateinit var mAppView:V

    override fun onAttach(context: Context, appView: V) {
        super.onAttach(context, appView)
    }
    override fun onDetach() {
        super.onDetach()
    }
}
