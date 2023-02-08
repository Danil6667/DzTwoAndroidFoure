package com.example.dztwoandroidfour.data.repositories

import com.example.dztwoandroidfour.base.BaseRepository
import com.example.dztwoandroidfour.data.remote.api.AnimeApiService
import javax.inject.Inject

class AnimeRepository @Inject constructor(private val animeApiService: AnimeApiService): BaseRepository() {

    fun getAnime() = doRequest {
        animeApiService.getAnime()
    }

    fun getDetailAnime(id : Int) = doRequest {
       animeApiService.getDetailAnime(id = id)
    }
}