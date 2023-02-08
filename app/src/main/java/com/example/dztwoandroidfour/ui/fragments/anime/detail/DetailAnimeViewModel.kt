package com.example.dztwoandroidfour.ui.fragments.anime.detail

import com.example.dztwoandroidfour.base.BaseViewModel
import com.example.dztwoandroidfour.data.repositories.AnimeRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class DetailAnimeViewModel  @Inject constructor(private val repository: AnimeRepository) : BaseViewModel() {

    fun getDetailAnime(id: Int) = repository.getDetailAnime(id = id)
}