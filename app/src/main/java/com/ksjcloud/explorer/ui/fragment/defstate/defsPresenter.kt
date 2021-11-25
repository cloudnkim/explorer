package com.ksjcloud.explorer.ui.fragment.defstate

import android.content.Context
import com.ksjcloud.explorer.ui.base.baseFragment
import com.ksjcloud.explorer.ui.base.basePresenter

class defsPresenter<V : defsI.View> : basePresenter<V>(), defsI.Presenter<V> {

    lateinit var mAppView:V

    override fun onAttach(context: Context, appView: V) {
        super.onAttach(context, appView)
    }
    override fun onDetach() {
        super.onDetach()
    }
}
