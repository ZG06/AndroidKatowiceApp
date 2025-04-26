package com.example.katowiceapp.ui

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.katowiceapp.data.SelectableItem
import com.example.katowiceapp.data.SelectableItem.CategoryItem
import com.example.katowiceapp.data.datasource.CategoriesDataProvider
import com.example.katowiceapp.ui.theme.KatowiceAppTheme


@Composable
fun CategoryScreen(
    options: List<CategoryItem>,
    onClick: (CategoryItem) -> Unit,
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
fun CategoryScreenPreview() {
    KatowiceAppTheme {
        CategoryScreen(
            options = CategoriesDataProvider.CategoryItemList,
            onClick = {},
        )
    }
}