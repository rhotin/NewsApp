package com.rhappdeveloper.newsapp.data.datasource

import com.rhappdeveloper.newsapp.data.entity.NewsResponse
import retrofit2.Response

interface NewsDataSource {

    suspend fun getNewsHeadline(country: String) : Response<NewsResponse>

}