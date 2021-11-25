package com.ksjcloud.explorer.model.network

import okhttp3.*
import java.io.IOException

class ServerReq(apiServer:serverApis, result:OnResultListener) {

    private val apis:serverApis = apiServer
    private var okHttpClient:OkHttpClient = OkHttpClient()
    private var reqs:Request.Builder = Request.Builder()
    private var resultListener:OnResultListener = result

    interface OnResultListener {
        fun onFailed(reason:String)
        fun onSuccess(response:String)
    }

    init {
        when(apis.getMethod()) {
            "GET" -> {
                reqs.url(apis.getUrl()).get()
            }
            "POST" -> {
//                reqs.url(apis.getUrl()).post()
            }
            else -> {

            }
        }

    }

    fun newCall() {
        okHttpClient.newCall(reqs.build()).enqueue(object : Callback {
            override fun onFailure(call: Call, e: IOException) {
                resultListener.onFailed("${call.toString()}, $e ")
            }

            override fun onResponse(call: Call, response: Response) {
                resultListener.onSuccess(response.body.toString())
            }
        })
    }
}
