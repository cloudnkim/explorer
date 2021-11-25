package com.ksjcloud.explorer.ui.main

import androidx.viewpager2.widget.ViewPager2
import com.ksjcloud.explorer.ui.base.BaseI

class MainI {
    interface Presenter<V:View> : BaseI.Presenter<V> {
        fun setPageChangeCallback(pageView: ViewPager2)
    }
    interface View : BaseI.View {

    }
}