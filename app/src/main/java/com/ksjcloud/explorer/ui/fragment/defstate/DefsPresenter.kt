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

    override fun onAttach(context: Context, baseActivity: BaseActivity, appView: V) {
        super.onAttach(context, baseActivity, appView)
    }
    override fun onDetach() {
        super.onDetach()
    }

    override fun requestDataApi() {
        var serverReq = ServerReq(ServerApis.apiDataGoInfuser, object:ServerReq.OnResultListener {
            override fun onFailed(reason: String) {
            }

            override fun onSuccess(response: String) {
                var data : DefsInfo = Gson().fromJson(response, DefsInfo::class.java)
                mBaseActivity.runOnUiThread {
                    var strb:StringBuffer = StringBuffer()
                    for(d:DefsInfoDetail in data.dataList) {
                        strb.append("명칭 : ${d.name}\n")
                    }

                    mAppView.getTextView().text = "currentCount : ${data.currentCount}\n$strb"
                }
            }
        })
        serverReq.setParam(1,2).newCall()
    }
}
