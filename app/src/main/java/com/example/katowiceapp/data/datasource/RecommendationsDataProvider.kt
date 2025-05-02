package com.example.katowiceapp.data.datasource

import com.example.katowiceapp.R
import com.example.katowiceapp.data.SelectableItem.RecommendationItem

object RecommendationsDataProvider {

    // List of coffee shops
    val CoffeeShopsRecommendationItemList = listOf<RecommendationItem>(
        RecommendationItem(
            image = R.drawable.proper_coffee,
            name = R.string.proper_coffee_name,
            description = R.string.slaska_prohibicja_description
        ),
        RecommendationItem(
            image = R.drawable.coffee_jka,
            name = R.string.coffee_jka_name,
            description = R.string.coffee_jka_description
        ),
        RecommendationItem(
            image = R.drawable.black_woolf_coffe_and_books,
            name = R.string.black_woolf_coffee_books_name,
            description = R.string.black_woolf_coffee_books_description
        ),
        RecommendationItem(
            image = R.drawable.urban_coffee,
            name = R.string.urban_coffee_name,
            description = R.string.urban_coffee_description
        ),
        RecommendationItem(
            image = R.drawable.kafej,
            name = R.string.kafej_name,
            description = R.string.kafej_description
        )
    )
    // List of restaurants
    val RestaurantsRecommendationItemList = listOf(
        RecommendationItem(
            image = R.drawable.zurownia,
            name = R.string.zurownia_name,
            description = R.string.zurownia_description
        ),
        RecommendationItem(
            image = R.drawable.slaska_prohibicja,
            name = R.string.slaska_prohibicja_name,
            description = R.string.slaska_prohibicja_description
        ),
        RecommendationItem(
            image = R.drawable.yogi_gogi_korea_grill,
            name = R.string.yogi_gogi_korea_grill_name,
            description = R.string.yogi_gogi_korea_grill_description
        ),
        RecommendationItem(
            image = R.drawable.len_arte,
            name = R.string.len_arte_name,
            description = R.string.len_arte_description
        ),
        RecommendationItem(
            image = R.drawable.floor_27,
            name = R.string.floor_27_name,
            description = R.string.floor_27_description
        )
    )

    // List of museums
    val MuseumsRecommendationItemList = listOf(
        RecommendationItem(
            image = R.drawable.muzeum_slaskie,
            name = R.string.muzeum_slaskie_name,
            description = R.string.muzeum_slaskie_description
        ),
        RecommendationItem(
            image = R.drawable.muzeum_historii_katowic,
            name = R.string.muzeum_historii_katowic_name,
            description = R.string.muzeum_historii_katowic_description
        ),
        RecommendationItem(
            image = R.drawable.galeria_szyb_wilson,
            name = R.string.galeria_szyb_wilson_name,
            description = R.string.galeria_szyb_wilson_description
        ),
        RecommendationItem(
            image = R.drawable.computer_museum,
            name = R.string.computer_museum_name,
            description = R.string.computer_museum_description
        ),
        RecommendationItem(
            image = R.drawable.walcownia,
            name = R.string.walcownia_name,
            description = R.string.walcownia_description
        )
    )

    // List of hotels
    val HotelsRecommendationItemList = listOf(
        RecommendationItem(
            image = R.drawable.hotel_diament_plaza_katowice,
            name = R.string.hotel_diament_plaza_katowice_name,
            description = R.string.hotel_diament_plaza_katowice_description
        ),
        RecommendationItem(
            image = R.drawable.q_hotel_plus_katowice,
            name = R.string.q_hotel_plus_katowice_name,
            description = R.string.q_hotel_plus_katowice_description
        ),
        RecommendationItem(
            image = R.drawable.campanile_katowice,
            name = R.string.campanile_katowice_name,
            description = R.string.campanile_katowice_description
        ),
        RecommendationItem(
            image = R.drawable.quality_silesian_hotel,
            name = R.string.quality_silesian_hotel_name,
            description = R.string.quality_silesian_hotel_description
        ),
        RecommendationItem(
            image = R.drawable.hotel_monopol,
            name = R.string.hotel_monopol_name,
            description = R.string.hotel_monopol_description
        )
    )
}