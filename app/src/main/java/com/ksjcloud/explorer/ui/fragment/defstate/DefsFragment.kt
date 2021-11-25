package com.ksjcloud.explorer.ui.fragment.defstate

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.ksjcloud.explorer.R
import com.ksjcloud.explorer.ui.base.BaseActivity
import com.ksjcloud.explorer.ui.base.BaseFragment

class DefsFragment(baseActivity: BaseActivity) : BaseFragment(), DefsI.View {
    private lateinit var mView:View
    private var mActivity = baseActivity
    private var mPresenter:DefsPresenter<DefsI.View> = DefsPresenter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        mPresenter.onAttach(mContext, mActivity,this)
        mView = layoutInflater.inflate(R.layout.activity_defs, container, false)
        return mView
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        mPresenter.requestDataApi()
    }

    override fun getTextView() : TextView {
        return mView.findViewById(R.id.testText)
    }
}