package com.example.dztwoandroidfour.data.repositories

import com.example.dztwoandroidfour.base.BaseRepository
import com.example.dztwoandroidfour.data.remote.api.MangaApiService
import javax.inject.Inject

class MangaRepository @Inject constructor(private val mangaApiService: MangaApiService): BaseRepository() {

    fun getManga() = doRequest {
        mangaApiService.getManga()
    }

    fun getDetailManga(id : Int) = doRequest {
       mangaApiService.getDetailManga(id = id)
    }
}