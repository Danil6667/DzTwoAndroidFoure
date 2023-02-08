package com.example.dztwoandroidfour.data.remote.api

import com.example.dztwoandroidfour.data.models.manga_models.Manga
import com.example.dztwoandroidfour.data.models.manga_models.MangaResponce
import com.example.dztwoandroidfour.data.models.manga_models.manga_detail.MangaDetail
import retrofit2.http.GET
import retrofit2.http.Path

interface MangaApiService {

    @GET("manga")
    suspend fun getManga(): MangaResponce<Manga>

    @GET("manga/{id}")
    suspend fun getDetailManga(
        @Path("id") id: Int
    ): MangaDetail
}