package com.example.myapplication.model

import androidx.annotation.DrawableRes
import androidx.compose.ui.graphics.Color

data class RecipeCategory(
    val id: String,
    val title: String,
    @DrawableRes val iconRes: Int,
    val accentColor: Color,
    val recipes: List<Recipe>
)
