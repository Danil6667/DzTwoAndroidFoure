package com.example.dztwoandroidfour.ui.fragments.manga

import com.example.dztwoandroidfour.base.BaseViewModel
import com.example.dztwoandroidfour.data.repositories.MangaRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MangaViewModel @Inject constructor(private val repository: MangaRepository) : BaseViewModel() {

    fun getManga() = repository.getManga()
}