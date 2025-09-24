package com.example.myapplication.model

import android.content.Context
import androidx.annotation.DrawableRes
import androidx.compose.ui.graphics.Color
import com.example.myapplication.R
import kotlinx.serialization.decodeFromString
import kotlinx.serialization.json.Json
import java.util.Locale

object RecipeRepository {
    private val json = Json { ignoreUnknownKeys = true }
    private val titleLocale = Locale("tr", "TR")
    private var cachedCategories: List<RecipeCategory>? = null

    private val categoryTitles = mapOf(
        "makarna" to "Makarna",
        "corba" to "Çorba",
        "tatli" to "Tatlı",
        "tavuk" to "Tavuk",
        "balik" to "Balık",
        "salata" to "Salata"
    )

    private val categoryIcons = mapOf(
        "makarna" to R.drawable.ic_category_pasta,
        "corba" to R.drawable.ic_category_soup,
        "tatli" to R.drawable.ic_category_dessert,
        "tavuk" to R.drawable.ic_category_chicken,
        "balik" to R.drawable.ic_category_fish,
        "salata" to R.drawable.ic_category_salad
    )

    private val categoryColors = mapOf(
        "makarna" to Color(0xFFFFB1C1),
        "corba" to Color(0xFFFFDCC1),
        "tatli" to Color(0xFFF8CFFE),
        "tavuk" to Color(0xFFCCE8FF),
        "balik" to Color(0xFFBEE4FF),
        "salata" to Color(0xFFD1F8D8)
    )

    fun loadCategories(context: Context): List<RecipeCategory> {
        cachedCategories?.let { return it }
        val rawJson = context.resources.openRawResource(R.raw.recipes).bufferedReader().use { it.readText() }
        val payload = json.decodeFromString<List<RecipeCategoryPayload>>(rawJson)
        val categories = payload.map { categoryPayload ->
            val id = categoryPayload.kategori
            RecipeCategory(
                id = id,
                title = categoryTitles[id] ?: id.replaceFirstChar { char ->
                    if (char.isLowerCase()) char.titlecase(titleLocale) else char.toString()
                },
                iconRes = categoryIcons[id] ?: R.drawable.ic_category_pasta,
                accentColor = categoryColors[id] ?: Color(0xFFEFF4FF),
                recipes = categoryPayload.tarifler.map { recipePayload ->
                    Recipe(
                        id = recipePayload.id,
                        name = recipePayload.isim,
                        thumbnailRes = drawableForName(recipePayload.kucukResim),
                        prepMinutes = recipePayload.hazirlikDakika,
                        cookMinutes = recipePayload.pisirmeDakika,
                        totalMinutes = recipePayload.toplamDakika,
                        calories = recipePayload.kalori,
                        ingredients = recipePayload.malzemeler,
                        femaleSteps = recipePayload.adimlarKadin,
                        maleSteps = recipePayload.adimlarErkek
                    )
                }
            )
        }
        cachedCategories = categories
        return categories
    }

    @DrawableRes
    private fun drawableForName(name: String): Int = when (name) {
        "ic_recipe_thumb_peach" -> R.drawable.ic_recipe_thumb_peach,
        "ic_recipe_thumb_mint" -> R.drawable.ic_recipe_thumb_mint,
        "ic_recipe_thumb_lilac" -> R.drawable.ic_recipe_thumb_lilac,
        "ic_recipe_thumb_sunrise" -> R.drawable.ic_recipe_thumb_sunrise,
        "ic_recipe_thumb_sky" -> R.drawable.ic_recipe_thumb_sky,
        else -> R.drawable.ic_recipe_thumb_mint
    }
}
