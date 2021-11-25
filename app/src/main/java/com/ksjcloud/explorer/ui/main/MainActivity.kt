package com.ksjcloud.explorer.ui.main

import android.content.Context
import android.os.Bundle
import android.widget.FrameLayout
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import androidx.fragment.app.FragmentTransaction
import androidx.viewpager2.adapter.FragmentStateAdapter
import androidx.viewpager2.widget.ViewPager2
import com.ksjcloud.explorer.R
import com.ksjcloud.explorer.ui.base.baseActivity
import com.ksjcloud.explorer.ui.base.baseFragment
import com.ksjcloud.explorer.ui.fragment.ContsAdapter
import com.ksjcloud.explorer.ui.fragment.defstate.defsFragment
import com.ksjcloud.explorer.ui.fragment.disaster.disaFragment

class MainActivity : baseActivity(), MainI.View {
    private val mPresenter:MainPresenter<MainI.View> = MainPresenter()
    private val mContext: Context = this

    private var mFragmentManager:FragmentManager = supportFragmentManager
    private var mFragmentTransaction:FragmentTransaction = mFragmentManager.beginTransaction()

    private lateinit var mViewPager: ViewPager2
    private lateinit var mPageAdapter: FragmentStateAdapter

    private var mFragmentArr:ArrayList<baseFragment> = ArrayList()
    private lateinit var mDefsFragment: defsFragment
    private lateinit var mDisaFragment: disaFragment

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mPresenter.onAttach(mContext, this)

        mViewPager = findViewById(R.id.main_pager)

        mDefsFragment = defsFragment()
        mDisaFragment = disaFragment()
        mFragmentArr.add(mDefsFragment)
        mFragmentArr.add(mDisaFragment)

        mPageAdapter = ContsAdapter(this, mFragmentArr)
        mViewPager.adapter = mPageAdapter

        mViewPager.currentItem = 0
        mViewPager.registerOnPageChangeCallback(object: ViewPager2.OnPageChangeCallback() {
            override fun onPageScrolled(
                position: Int,
                positionOffset: Float,
                positionOffsetPixels: Int
            ) {
                super.onPageScrolled(position, positionOffset, positionOffsetPixels)
                if(positionOffsetPixels == 0) {
                    mViewPager.currentItem = position
                }
            }

            override fun onPageSelected(position: Int) {
                super.onPageSelected(position)
            }
        })
    }

    override fun onDestroy() {
        super.onDestroy()
        mPresenter.onDetach()
    }
}