package com.ksjcloud.explorer.model.network

import android.util.Log
import okhttp3.*
import okhttp3.logging.HttpLoggingInterceptor
import java.io.IOException
import java.util.concurrent.TimeUnit

class ServerReq(apiServer:ServerApis, result:OnResultListener) {

    private val apis:ServerApis = apiServer
    private var okHttpClient:OkHttpClient
    private var reqs:Request.Builder = Request.Builder()
    private var resultListener:OnResultListener = result

    interface OnResultListener {
        fun onFailed(reason:String)
        fun onSuccess(response:String)
    }

    init {
        okHttpClient = OkHttpClient().newBuilder()
            .connectTimeout(10, TimeUnit.SECONDS)
            .readTimeout(30, TimeUnit.SECONDS)
            .addInterceptor(httpLogInterceptor())
            .build()

        Log.d("ServerReq","readTimeout : ${okHttpClient.readTimeoutMillis}")

//        when(apis.getMethod()) {
//            "GET" -> {
//                reqs.url(apis.getUrl()).get()
//            }
//            "POST" -> {
////                reqs.url(apis.getUrl()).post()
//            }
//            else -> {
//
//            }
//        }

    }

    fun setParam(start:Int, end:Int) : ServerReq {
        var url:HttpUrl = HttpUrl.Builder()
            .scheme("https").host(apis.mUrl)
            .addPathSegment("api")
            .addPathSegment("15094782")
            .addPathSegment("v1")
            .addPathSegment("uddi:6b2017af-659d-437e-a549-c59788817675")
            .addQueryParameter("page", "$start")
            .addQueryParameter("perPage", "$end")
            .addEncodedQueryParameter("serviceKey", "yWES0kYsudaAISuNgXH5j%2F1EYB%2FdXsxXMnxF%2FOGHQ%2BVF4m5R8tLcXieHFKXU3mdQBb90JACVWt9boMGc1RuWMA%3D%3D")
            .build()

        Log.d("ServerReq", "URL : $url")

        reqs.url(url)

        return this
    }

    fun newCall() {
        okHttpClient.newCall(reqs.build()).enqueue(object : Callback {
            override fun onFailure(call: Call, e: IOException) {
                resultListener.onFailed("${call.toString()}, $e ")
            }

            override fun onResponse(call: Call, response: Response) {
                resultListener.onSuccess(response.body!!.source().buffer.readUtf8())
            }
        })
    }

    private fun httpLogInterceptor() : HttpLoggingInterceptor {
        var interceptor = HttpLoggingInterceptor(HttpLoggingInterceptor.Logger() {
            Log.d("HTTP_LOG", it)
        })
        return interceptor.setLevel(HttpLoggingInterceptor.Level.BODY)
    }
}
