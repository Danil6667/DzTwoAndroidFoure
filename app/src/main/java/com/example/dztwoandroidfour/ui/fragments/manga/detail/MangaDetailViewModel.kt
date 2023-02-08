package com.example.dztwoandroidfour.ui.fragments.manga.detail

import com.example.dztwoandroidfour.base.BaseViewModel
import com.example.dztwoandroidfour.data.repositories.MangaRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MangaDetailViewModel  @Inject constructor(private val repository: MangaRepository) : BaseViewModel() {

    fun getDetailManga(id: Int) = repository.getDetailManga(id = id)
}