package com.ksjcloud.explorer.model.network

enum class ServerApis(url:String, method:String) {
    apiDataGoInfuser("api.odcloud.kr","GET"), //요소수
    apiDataGoDisaster("","GET") //재난
    ;

    val mUrl:String = url
    val mMethod:String = method

    fun getUrl() : String {
        return mUrl
    }
    fun getMethod() : String {
        return mMethod
    }
}