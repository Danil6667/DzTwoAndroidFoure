package com.example.dztwoandroidfour.data.remote

import com.example.dztwoandroidfour.data.remote.api.AnimeApiService
import com.example.dztwoandroidfour.data.remote.api.MangaApiService
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit

class RetrofitClient {

    private val okHttpClient = OkHttpClient().newBuilder()
        .addInterceptor(HttpLoggingInterceptor())
        .connectTimeout(30, TimeUnit.SECONDS)
        .readTimeout(30, TimeUnit.SECONDS)
        .writeTimeout(30, TimeUnit.SECONDS)
        .build()

    private val retrofitClient = Retrofit.Builder()
        .baseUrl("https://kitsu.io/api/edge/")
        .addConverterFactory(GsonConverterFactory.create())
        .client(okHttpClient)
        .build()

    private fun provideLoggingInterceptor() = HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.BODY)

    fun provideAnimeApiService() = retrofitClient.create(AnimeApiService::class.java)

    fun provideMangaApiService() = retrofitClient.create(MangaApiService::class.java)
}