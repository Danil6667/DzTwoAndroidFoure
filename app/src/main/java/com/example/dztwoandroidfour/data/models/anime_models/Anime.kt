package com.example.dztwoandroidfour.data.models.anime_models

import com.google.gson.annotations.SerializedName

data class Anime(
    @SerializedName("attributes")
    val attributes: Attributes,
    @SerializedName("id")
    val id: String = "",
    @SerializedName("type")
    val type: String = ""
)