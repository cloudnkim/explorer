package com.ksjcloud.explorer.ui.main

import android.content.Context
import androidx.viewpager2.widget.ViewPager2

class MainPresenter<V:MainI.View> : MainI.Presenter<V> {
    var mContext:Context ?= null
    var mAppView:MainI.View ?= null

    override fun onAttach(context: Context, appView: V) {
        mContext = context
        mAppView = appView
    }

    override fun setPageChangeCallback(pageView: ViewPager2) {
        pageView.registerOnPageChangeCallback(object:ViewPager2.OnPageChangeCallback() {
            override fun onPageScrolled(
                position: Int,
                positionOffset: Float,
                positionOffsetPixels: Int
            ) {
                super.onPageScrolled(position, positionOffset, positionOffsetPixels)
                if(positionOffsetPixels == 0) {
                    pageView.currentItem = position
                }
            }

            override fun onPageSelected(position: Int) {
                super.onPageSelected(position)
            }
        })
    }

    override fun onDetach() {
        mContext = null
        mAppView = null
    }
}