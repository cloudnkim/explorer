package com.ksjcloud.explorer.ui.fragment.disaster

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.ksjcloud.explorer.R
import com.ksjcloud.explorer.ui.base.baseFragment

class disaFragment : baseFragment(), disaI.View{
    private lateinit var mView: View
    private var mPresenter:disaPresenter<disaI.View> = disaPresenter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        mPresenter.onAttach(mContext, this)
        mView = layoutInflater.inflate(R.layout.activity_disa, container, false)

        return mView
    }
}