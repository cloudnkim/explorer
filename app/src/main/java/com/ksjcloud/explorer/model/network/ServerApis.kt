package com.ksjcloud.explorer.model.network

enum class ServerApis(host:String, path:String, method:String) {
    apiDataGoInfuser("api.odcloud.kr","api/uws/v1/inventory","GET"), //요소수
    apiDataGoDisaster("","","GET") //재난
    ;

    val mHost:String = host
    val mPath:String = path
    val mMethod:String = method

    fun getHost() : String {
        return mHost
    }

    fun getPath() : String {
        return mPath
    }

    fun getMethod() : String {
        return mMethod
    }
}