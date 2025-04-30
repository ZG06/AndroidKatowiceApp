package com.example.katowiceapp.data.datasource

import com.example.katowiceapp.R
import com.example.katowiceapp.data.SelectableItem.RecommendationItem
import com.example.katowiceapp.ui.RecommendationScreen

object RecommendationsDataProvider {

    // List of coffee shops
    val CoffeeShopsRecommendationItemList = listOf<RecommendationItem>(
        RecommendationItem(
            image = R.drawable.proper_coffee,
            name = "Proper COFFEE",
            description = "Minimalist café known for specialty brews and single-origin beans. Great for coffee purists and remote work."
        ),
        RecommendationItem(
            image = R.drawable.coffee_jka,
            name = "Coffee-jka",
            description = "Cozy and friendly spot with great coffee and homemade treats. A favorite for locals and casual meetups."
        ),
        RecommendationItem(
            image = R.drawable.black_woolf_coffe_and_books,
            name = "Black Woolf Coffee & Books",
            description = "Bookstore café with a creative vibe. Perfect for relaxing with a coffee and a good read."
        ),
        RecommendationItem(
            image = R.drawable.urban_coffee,
            name = "Urban Coffee",
            description = "Urban Coffee is a place created with Katowice in mind. In the morning, you can drop by for a good coffee and breakfast before work, and in the evening, unwind with a glass of wine."
        ),
        RecommendationItem(
            image = R.drawable.kafej,
            name = "Kafej",
            description = "Relaxed cafe offering breakfast & lunch menus, along with trendy decor & outdoor seating."
        )
    )

    // List of restaurants
    val RestaurantsRecommendationItemList = listOf<RecommendationItem>(
        RecommendationItem(
            image = R.drawable.zurownia,
            name = "Żurownia",
            description = "A cozy spot known for its traditional Silesian cuisine with a modern twist. The name comes from 'żur', a sour rye soup that's a local favorite. This restaurant focuses on comfort food, regional flavors, and a homely vibe."
        ),
        RecommendationItem(
            image = R.drawable.slaska_prohibicja,
            name = "Śląska Prohibicja",
            description = "Located in the historic Nikiszowiec district, this stylish restaurant serves upscale interpretations of Silesian dishes. Elegant interiors and live music make it perfect for a date night or special occasion."
        ),
        RecommendationItem(
            image = R.drawable.yogi_gogi_korea_grill,
            name = "Yogi Gogi Korea grill",
            description = "A popular Korean BBQ spot where guests can grill meats at their table. Known for authentic Korean flavors, attentive service, and great group dining experiences."
        ),
        RecommendationItem(
            image = R.drawable.len_arte,
            name = "Len Arte",
            description = "A well-loved Italian restaurant specializing in Neapolitan-style pizzas made in a wood-fired oven. Also offers pasta, antipasti, and a relaxed yet elegant setting."
        ),
        RecommendationItem(
            image = R.drawable.floor_27,
            name = "27th Floor",
            description = "The restaurant is located on the 27th floor of the Marriott Hotel in Katowice. From here, you can enjoy a stunning view of the Silesian metropolis and the Beskidy Mountains. However, the biggest highlight of the 27th Floor restaurant is its sensational cuisine."
        )
    )

    // List of museums
    val MuseumsRecommendationItemList = listOf<RecommendationItem>(
        RecommendationItem(
            image = R.drawable.muzeum_slaskie,
            name = "Muzeum Śląskie",
            description = "A flagship cultural institution in Katowice, built on the site of a former coal mine. The museum is mostly underground and features modern galleries on Silesian history, art, and industry. It’s a blend of heritage and cutting-edge design."
        ),
        RecommendationItem(
            image = R.drawable.muzeum_historii_katowic,
            name = "Muzeum Historii Katowic",
            description = "Housed in a beautiful Art Nouveau building, this museum takes visitors through Katowice’s transformation from a mining town to a modern city. Includes reconstructed period interiors and a rich photo archive."
        ),
        RecommendationItem(
            image = R.drawable.galeria_szyb_wilson,
            name = "Galeria Szyb Wilson",
            description = "Located in a former coal mine shaft, this is one of Poland’s largest private art galleries. It showcases contemporary art in a raw, industrial space. Also hosts festivals and events."
        ),
        RecommendationItem(
            image = R.drawable.computer_museum,
            name = "Museum of the History of Computers and Information Technology",
            description = "Technology museum tracing the history of computing & IT in Poland, with working vintage machines."
        ),
        RecommendationItem(
            image = R.drawable.walcownia,
            name = "WALCOWNIA Zinc Metallurgy Museum",
            description = "At the WALCOWNIA Zinc Metallurgy Museum in Katowice, visitors can see a unique, historically preserved zinc sheet production line—one of its kind in Europe. The massive, over 100-year-old machines are still used for their original purpose during occasional demonstrations. The museum also houses one of the largest collections of vintage Harley-Davidson and Indian motorcycles from 1920 to 1986."
        )
    )

    // List of hotels
    val HotelsRecommendationItemList = listOf<RecommendationItem>(
        RecommendationItem(
            image = R.drawable.hotel_diament_plaza_katowice,
            name = "Hotel Diament Plaza Katowice",
            description = "A 4-star hotel in the city center, just steps from the main railway station. Combines historic architecture with modern interiors. Known for its comfort, cleanliness, and business-friendly amenities."
        ),
        RecommendationItem(
            image = R.drawable.q_hotel_plus_katowice,
            name = "Q Hotel Plus Katowice",
            description = "Modern and centrally located, this hotel offers sleek rooms and a great breakfast buffet. It's a popular choice for both tourists and business travelers due to its accessibility and amenities."
        ),
        RecommendationItem(
            image = R.drawable.campanile_katowice,
            name = "Campanile Katowice",
            description = "Budget-friendly and practical, Campanile is about 2.5 km from the city center. Ideal for short stays, with simple rooms, decent food, and easy highway access."
        ),
        RecommendationItem(
            image = R.drawable.quality_silesian_hotel,
            name = "Quality Silesian Hotel",
            description = "A comfortable and modern 3-star hotel located near the A4 motorway, offering convenient access to the city center and major transport routes. It features well-equipped rooms, a restaurant, sauna, and fitness area, making it a good choice for both business and leisure travelers."
        ),
        RecommendationItem(
            image = R.drawable.hotel_monopol,
            name = "Hotel Monopol",
            description = "A luxurious 5-star hotel in the heart of Katowice, known for its elegant interiors, historic architecture, and high-end service. It offers spacious rooms, a fine dining restaurant, a wellness zone with a pool and spa, and is popular among celebrities and business guests."
        )
    )
}