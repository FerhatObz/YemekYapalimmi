package com.example.myapplication.model

import androidx.annotation.DrawableRes
import androidx.compose.ui.graphics.Color
import com.example.myapplication.R
import com.example.myapplication.ui.theme.PastelBlue
import com.example.myapplication.ui.theme.PastelPink

enum class ChefRole(
    val displayName: String,
    @DrawableRes val icon: Int,
    val primaryColor: Color,
    val secondaryColor: Color,
    val gradient: List<Color>,
    val mission: String
) {
    Female(
        displayName = "Kadın Şef",
        icon = R.drawable.ic_role_female,
        primaryColor = PastelPink,
        secondaryColor = Color(0xFFFAD0E6),
        gradient = listOf(Color(0xFFFFF5FB), Color(0xFFEFF4FF)),
        mission = "Hazırlık & sos"
    ),
    Male(
        displayName = "Erkek Şef",
        icon = R.drawable.ic_role_male,
        primaryColor = PastelBlue,
        secondaryColor = Color(0xFFD7ECFF),
        gradient = listOf(Color(0xFFEFF6FF), Color(0xFFFDF7FF)),
        mission = "Pişirme & servis"
    );

    val shortLabel: String
        get() = if (this == Female) "Kadın" else "Erkek"

    fun opposite(): ChefRole = if (this == Female) Male else Female
}
