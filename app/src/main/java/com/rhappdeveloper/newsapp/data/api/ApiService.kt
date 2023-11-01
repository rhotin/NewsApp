package com.rhappdeveloper.newsapp.data.api

import com.rhappdeveloper.newsapp.data.entity.NewsResponse
import com.rhappdeveloper.newsapp.BuildConfig
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {

    @GET("v2/top-headlines")
    suspend fun getNewsHeadline(
        @Query("country") country: String,
        @Query("apiKey") apiKey: String = BuildConfig.apiKey
    ): Response<NewsResponse>

}

//https://newsapi.org/v2/top-headlines?country=us&apiKey=ec08bd1bdc42489ab314f2a57cdb3c3a