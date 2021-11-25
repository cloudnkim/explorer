package com.ksjcloud.explorer.ui.fragment.disaster

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.ksjcloud.explorer.R
import com.ksjcloud.explorer.ui.base.BaseActivity
import com.ksjcloud.explorer.ui.base.BaseFragment

class DisaFragment(baseActivity: BaseActivity) : BaseFragment(), DisaI.View{
    private var mActivity = baseActivity
    private lateinit var mView: View
    private var mPresenter:DisaPresenter<DisaI.View> = DisaPresenter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        mPresenter.onAttach(mContext, mActivity,this)
        mView = layoutInflater.inflate(R.layout.activity_disa, container, false)

        return mView
    }
}