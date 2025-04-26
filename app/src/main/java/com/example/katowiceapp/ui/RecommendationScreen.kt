package com.example.katowiceapp.ui

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.katowiceapp.data.SelectableItem
import com.example.katowiceapp.data.SelectableItem.RecommendationItem
import com.example.katowiceapp.data.datasource.CategoriesDataProvider
import com.example.katowiceapp.ui.theme.KatowiceAppTheme


@Composable
fun RecommendationScreen(
    options: List<RecommendationItem>,
    onClick: (RecommendationItem) -> Unit,
    modifier: Modifier = Modifier
) {
    BaseListScreen(
        options = options,
        onClick = onClick as (SelectableItem) -> Unit,
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun RecommendationScreenPreview() {
    KatowiceAppTheme {
        RecommendationScreen(
            options = CategoriesDataProvider.CategoryItemList[0].recommendations,
            onClick = {},
        )
    }
}