package com.search.itunes.apis

import com.search.itunes.models.iTunesModel
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query


interface ApiRequest {

    @GET("search?")
    fun getTunes(@Query("term") term: String ): Call<iTunesModel?>?


}