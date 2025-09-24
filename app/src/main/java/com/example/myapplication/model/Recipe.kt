package com.example.myapplication.model

import androidx.annotation.DrawableRes

data class Recipe(
    val id: String,
    val name: String,
    @DrawableRes val thumbnailRes: Int,
    val prepMinutes: Int,
    val cookMinutes: Int,
    val totalMinutes: Int,
    val calories: Int,
    val ingredients: List<String>,
    val femaleSteps: List<String>,
    val maleSteps: List<String>
) {
    fun stepsFor(role: ChefRole): List<String> = if (role == ChefRole.Female) femaleSteps else maleSteps
}
