package com.example.myapplication.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class RecipeCategoryPayload(
    val kategori: String,
    val tarifler: List<RecipePayload>
)

@Serializable
data class RecipePayload(
    val id: String,
    val isim: String,
    @SerialName("hazirlikDakika") val hazirlikDakika: Int,
    @SerialName("pisirmeDakika") val pisirmeDakika: Int,
    @SerialName("toplamDakika") val toplamDakika: Int,
    val kalori: Int,
    val ikon: String,
    @SerialName("kucukResim") val kucukResim: String,
    val malzemeler: List<String>,
    @SerialName("adimlarKadin") val adimlarKadin: List<String>,
    @SerialName("adimlarErkek") val adimlarErkek: List<String>
)
