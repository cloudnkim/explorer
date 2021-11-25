package com.ksjcloud.explorer.ui.main

import android.content.Context
import androidx.viewpager2.widget.ViewPager2
import com.ksjcloud.explorer.ui.base.BaseActivity

class MainPresenter<V:MainI.View> : MainI.Presenter<V> {
    var mContext:Context ?= null
    var mActivity:BaseActivity ?= null
    var mAppView:MainI.View ?= null

    override fun onAttach(context: Context, appView: V) {
        mContext = context
        mAppView = appView
    }

    override fun onAttach(context: Context, baseActivity: BaseActivity, appView: V) {
        mContext = context
        mActivity = baseActivity
        mAppView = appView
    }

    //뷰페이저 동작..
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