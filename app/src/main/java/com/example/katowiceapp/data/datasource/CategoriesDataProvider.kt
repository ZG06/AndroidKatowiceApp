package com.example.katowiceapp.data.datasource

import com.example.katowiceapp.R
import com.example.katowiceapp.data.SelectableItem.CategoryItem
import com.example.katowiceapp.data.datasource.RecommendationsDataProvider.CoffeeShopsRecommendationItemList
import com.example.katowiceapp.data.datasource.RecommendationsDataProvider.HotelsRecommendationItemList
import com.example.katowiceapp.data.datasource.RecommendationsDataProvider.MuseumsRecommendationItemList
import com.example.katowiceapp.data.datasource.RecommendationsDataProvider.RestaurantsRecommendationItemList

object CategoriesDataProvider {

    // List of categories
    val CategoryItemList = listOf<CategoryItem>(
        CategoryItem(
            image = R.drawable.general_coffee_shop,
            name = R.string.coffee_shops,
            recommendations = CoffeeShopsRecommendationItemList
        ),
        CategoryItem(
            image = R.drawable.general_restaurant,
            name = R.string.restaurants,
            recommendations = RestaurantsRecommendationItemList
        ),
        CategoryItem(
            image = R.drawable.general_kids_friendly_place,
            name = R.string.museums,
            recommendations = MuseumsRecommendationItemList
        ),
        CategoryItem(
            image = R.drawable.general_park,
            name = R.string.hotels,
            recommendations = HotelsRecommendationItemList
        )
    )
}