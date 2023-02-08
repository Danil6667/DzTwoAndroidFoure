package com.example.dztwoandroidfour.data.remote.api

import com.example.dztwoandroidfour.data.models.anime_models.anime_detail.AnimeDetail
import com.example.dztwoandroidfour.data.models.anime_models.Anime
import com.example.dztwoandroidfour.data.models.anime_models.AnimeResponce
import retrofit2.http.GET
import retrofit2.http.Path

interface AnimeApiService {

    @GET("anime")
    suspend fun getAnime(): AnimeResponce<Anime>

    @GET("anime/{id}")
    suspend fun getDetailAnime(
        @Path("id") id: Int
    ): AnimeDetail
}