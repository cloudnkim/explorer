package com.ksjcloud.explorer.ui.base

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment

abstract class BaseFragment : Fragment(), BaseI.View {

    lateinit var mContext: Context
    lateinit var mBaseActivity:BaseActivity

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        mContext = context
    }

    override fun onShowLoading() {

    }

    override fun onHideLoading() {

    }
}