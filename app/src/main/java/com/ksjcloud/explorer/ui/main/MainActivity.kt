package com.ksjcloud.explorer.ui.main

import android.content.Context
import android.os.Bundle
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.ksjcloud.explorer.R
import com.ksjcloud.explorer.ui.base.BaseActivity
import com.ksjcloud.explorer.ui.base.BaseFragment
import com.ksjcloud.explorer.ui.fragment.ContsAdapter
import com.ksjcloud.explorer.ui.fragment.defstate.DefsFragment
import com.ksjcloud.explorer.ui.fragment.disaster.DisaFragment
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.collections.ArrayList

class MainActivity : BaseActivity(), MainI.View {
    private val mPresenter:MainPresenter<MainI.View> = MainPresenter()
    private val mContext: Context = this

    private var mTabArray:ArrayList<String> = ArrayList()
    private lateinit var mTabAdapter:TabAdapter
    private lateinit var mPageAdapter: FragmentStateAdapter

    private var mFragmentArr:ArrayList<BaseFragment> = ArrayList()
    private lateinit var mDefsFragment: DefsFragment
    private lateinit var mDisaFragment: DisaFragment

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mPresenter.onAttach(mContext, this)

        mTabArray.addAll(mContext.resources.getStringArray(R.array.tabItem))
        mTabAdapter = TabAdapter(mContext, mTabArray)

        top_menu.adapter = mTabAdapter

        mDefsFragment = DefsFragment(this)
        mDisaFragment = DisaFragment(this)
        mFragmentArr.add(mDefsFragment)
        mFragmentArr.add(mDisaFragment)

        mPageAdapter = ContsAdapter(this, mFragmentArr)
        main_pager.adapter = mPageAdapter

        main_pager.currentItem = 0
        mPresenter.setPageChangeCallback(main_pager)
    }

    override fun onDestroy() {
        super.onDestroy()
        mPresenter.onDetach()
    }
}