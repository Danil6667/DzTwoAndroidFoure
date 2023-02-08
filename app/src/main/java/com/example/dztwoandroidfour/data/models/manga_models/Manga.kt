package com.example.dztwoandroidfour.data.models.manga_models

import com.example.dztwoandroidfour.data.models.manga_models.Attributes
import com.google.gson.annotations.SerializedName

data class Manga(
    @SerializedName("attributes")
    val attributes: Attributes,
    @SerializedName("id")
    val id: String = "",
    @SerializedName("type")
    val type: String = ""
)