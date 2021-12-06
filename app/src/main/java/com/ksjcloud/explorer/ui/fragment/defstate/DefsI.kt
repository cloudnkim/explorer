package com.ksjcloud.explorer.ui.fragment.defstate

import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.ksjcloud.explorer.ui.base.BaseI

interface DefsI {
    interface Presenter<V : View> : BaseI.Presenter<V> {
        fun requestDataApi()
    }

    interface View : BaseI.View {
        fun getContsView() : RecyclerView
        fun getTextView() : TextView
    }
}