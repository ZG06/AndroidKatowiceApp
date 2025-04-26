package com.example.katowiceapp.ui

import androidx.lifecycle.ViewModel
import com.example.katowiceapp.data.PlaceUiState
import com.example.katowiceapp.data.SelectableItem
import com.example.katowiceapp.data.SelectableItem.CategoryItem
import com.example.katowiceapp.data.SelectableItem.RecommendationItem
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.update


class KatowiceViewModel : ViewModel() {
    private val _uiState = MutableStateFlow(PlaceUiState())
    val uiState: StateFlow<PlaceUiState> = _uiState

    fun selectCategory(category: CategoryItem) {
        updateItem(category)
    }

    fun selectRecommendation(recommendation: RecommendationItem) {
        updateItem(recommendation)
    }

    fun resetCategory() {
        _uiState.update { currentState ->
            currentState.copy(
                selectedCategory = null,
            )
        }
    }

    fun resetRecommendation() {
        _uiState.update { currentState ->
            currentState.copy(
                selectedRecommendation = null,
            )
        }
    }

    private fun updateItem(newItem: SelectableItem) {
        _uiState.update { currentState ->
            currentState.copy(
                selectedCategory = if (newItem is CategoryItem) newItem else currentState.selectedCategory,
                selectedRecommendation = if (newItem is RecommendationItem) newItem else currentState.selectedRecommendation
            )
        }
    }
}