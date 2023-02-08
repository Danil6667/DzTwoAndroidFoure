package com.example.dztwoandroidfour.data.models.manga_models.manga_detail

import com.example.dztwoandroidfour.data.models.manga_models.Manga
import com.google.gson.annotations.SerializedName

data class MangaDetail(
    @SerializedName("data")
    val data: Manga
)