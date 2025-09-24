package com.example.myapplication.model

object RecipeRepository {
    fun loadCategories(): List<RecipeCategory> = RecipeData.categories
}
