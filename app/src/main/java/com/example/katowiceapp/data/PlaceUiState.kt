package com.example.katowiceapp.data

import com.example.katowiceapp.data.SelectableItem.CategoryItem
import com.example.katowiceapp.data.SelectableItem.RecommendationItem


data class PlaceUiState(
    val selectedCategory: CategoryItem? = null,
    val selectedRecommendation: RecommendationItem? = null
)