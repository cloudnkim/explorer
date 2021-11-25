package com.ksjcloud.explorer.ui.main

import android.content.Context
import android.os.Bundle
import androidx.viewpager2.adapter.FragmentStateAdapter
import androidx.viewpager2.widget.ViewPager2
import com.ksjcloud.explorer.R
import com.ksjcloud.explorer.ui.base.BaseActivity
import com.ksjcloud.explorer.ui.base.BaseFragment
import com.ksjcloud.explorer.ui.fragment.ContsAdapter
import com.ksjcloud.explorer.ui.fragment.defstate.DefsFragment
import com.ksjcloud.explorer.ui.fragment.disaster.DisaFragment

class MainActivity : BaseActivity(), MainI.View {
    private val mPresenter:MainPresenter<MainI.View> = MainPresenter()
    private val mContext: Context = this

    private lateinit var mViewPager: ViewPager2
    private lateinit var mPageAdapter: FragmentStateAdapter

    private var mFragmentArr:ArrayList<BaseFragment> = ArrayList()
    private lateinit var mDefsFragment: DefsFragment
    private lateinit var mDisaFragment: DisaFragment

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mPresenter.onAttach(mContext, this)

        mViewPager = findViewById(R.id.main_pager)

        mDefsFragment = DefsFragment()
        mDisaFragment = DisaFragment()
        mFragmentArr.add(mDefsFragment)
        mFragmentArr.add(mDisaFragment)

        mPageAdapter = ContsAdapter(this, mFragmentArr)
        mViewPager.adapter = mPageAdapter

        mViewPager.currentItem = 0
        mPresenter.setPageChangeCallback(mViewPager)
    }

    override fun onDestroy() {
        super.onDestroy()
        mPresenter.onDetach()
    }
}