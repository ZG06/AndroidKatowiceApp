package com.example.katowiceapp.data

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes


sealed class SelectableItem(
    @DrawableRes open val image: Int,
    @StringRes open val name: Int
) {
    data class CategoryItem(
        @DrawableRes override val image: Int,
        @StringRes override val name: Int,
        val recommendations: List<RecommendationItem> = emptyList()
    ) : SelectableItem(image, name)

    data class RecommendationItem(
        @DrawableRes override val image: Int,
        @StringRes override val name: Int,
        @StringRes val description: Int
    ) : SelectableItem(image, name)
}