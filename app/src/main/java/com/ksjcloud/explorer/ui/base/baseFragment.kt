package com.ksjcloud.explorer.ui.base

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

abstract class baseFragment : Fragment(), baseI.View {

    lateinit var mContext: Context
    lateinit var mBaseActivity:baseActivity

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