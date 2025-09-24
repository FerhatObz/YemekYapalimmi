package com.example.myapplication.model

import androidx.annotation.DrawableRes

data class Recipe(
    val id: String,
    val name: String,
    @DrawableRes val thumbnailRes: Int,
    val femaleSteps: List<String>,
    val maleSteps: List<String>
) {
    fun stepsFor(role: ChefRole): List<String> = if (role == ChefRole.Female) femaleSteps else maleSteps
}
