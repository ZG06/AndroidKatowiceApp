package com.example.katowiceapp.data

import androidx.annotation.DrawableRes


sealed class SelectableItem(
    @DrawableRes open val image: Int,
    open val name: String
) {
    data class CategoryItem(
        @DrawableRes override val image: Int,
        override val name: String,
        val recommendations: List<RecommendationItem> = emptyList()
    ) : SelectableItem(image, name)

    data class RecommendationItem(
        @DrawableRes override val image: Int,
        override val name: String,
        val description: String
    ) : SelectableItem(image, name)
}