package com.example.dztwoandroidfour.ui.fragments.anime

import com.example.dztwoandroidfour.base.BaseViewModel
import com.example.dztwoandroidfour.data.repositories.AnimeRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class AnimeViewModel @Inject constructor(private val repository: AnimeRepository) : BaseViewModel() {

     fun getAnime() = repository.getAnime()
}