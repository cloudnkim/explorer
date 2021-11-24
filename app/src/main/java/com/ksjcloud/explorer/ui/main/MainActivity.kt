package com.ksjcloud.explorer.ui.main

import android.content.Context
import android.os.Bundle
import android.widget.FrameLayout
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction
import com.ksjcloud.explorer.R
import com.ksjcloud.explorer.ui.base.baseActivity

class MainActivity : baseActivity(), MainI.View {
    private val mPresenter:MainPresenter<MainI.View> = MainPresenter()
    private val mContext: Context = this

    private var mFragmentManager:FragmentManager = supportFragmentManager
    private var mFragmentTransaction:FragmentTransaction = mFragmentManager.beginTransaction()

    private lateinit var mFragmentArea:FrameLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mFragmentArea = findViewById(R.id.fragment_root)
        mPresenter.onAttach(mContext, this)

    }

    override fun onDestroy() {
        super.onDestroy()
        mPresenter.onDetach()
    }
}