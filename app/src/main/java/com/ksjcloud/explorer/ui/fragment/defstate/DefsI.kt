package com.ksjcloud.explorer.ui.fragment.defstate

import android.widget.TextView
import com.ksjcloud.explorer.ui.base.BaseI

interface DefsI {
    interface Presenter<V : View> : BaseI.Presenter<V> {
        fun requestDataApi()
    }

    interface View : BaseI.View {
        fun getTextView() : TextView
    }
}