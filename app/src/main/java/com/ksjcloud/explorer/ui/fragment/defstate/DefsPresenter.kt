package com.ksjcloud.explorer.ui.fragment.defstate

import android.content.Context
import com.google.gson.Gson
import com.ksjcloud.explorer.data.DefsInfo
import com.ksjcloud.explorer.data.DefsInfoDetail
import com.ksjcloud.explorer.model.network.ServerApis
import com.ksjcloud.explorer.model.network.ServerReq
import com.ksjcloud.explorer.ui.base.BaseActivity
import com.ksjcloud.explorer.ui.base.BasePresenter

class DefsPresenter<V : DefsI.View> : BasePresenter<V>(), DefsI.Presenter<V> {
    lateinit var mContext:Context
    lateinit var defsAdpt:DefsAdapter

    lateinit var mDefsData:DefsInfo

    override fun onAttach(context: Context, baseActivity: BaseActivity, appView: V) {
        super.onAttach(context, baseActivity, appView)
        mContext = context
    }
    override fun onDetach() {
        super.onDetach()
    }

    override fun requestDataApi() {
        var serverReq = ServerReq(ServerApis.apiDataGoInfuser, object:ServerReq.OnResultListener {
            override fun onFailed(reason: String) {
            }

            override fun onSuccess(response: String) {
                mDefsData = Gson().fromJson(response, DefsInfo::class.java)
                mBaseActivity.runOnUiThread {
                    var strb = StringBuffer()
                    for(d:DefsInfoDetail in mDefsData.dataList) {
                        strb.append("명칭 : ${d.name}\n")
                    }

                    defsAdpt = DefsAdapter(mContext, mDefsData.dataList)
                    mAppView.getContsView().adapter = defsAdpt
                }
            }
        })
        serverReq.setParam(1,100).newCall()
    }
}
