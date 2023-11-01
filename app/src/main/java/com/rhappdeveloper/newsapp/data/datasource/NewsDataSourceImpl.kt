package com.rhappdeveloper.newsapp.data.datasource

import com.rhappdeveloper.newsapp.data.api.ApiService
import com.rhappdeveloper.newsapp.data.entity.NewsResponse
import retrofit2.Response
import javax.inject.Inject

class NewsDataSourceImpl @Inject constructor(
    private val apiService: ApiService
) : NewsDataSource {


    override suspend fun getNewsHeadline(country: String): Response<NewsResponse> {
        return apiService.getNewsHeadline(country)
    }

}