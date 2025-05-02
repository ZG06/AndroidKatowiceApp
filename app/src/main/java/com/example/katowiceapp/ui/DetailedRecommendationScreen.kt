package com.example.katowiceapp.ui

import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import com.example.katowiceapp.R
import com.example.katowiceapp.data.datasource.RecommendationsDataProvider
import com.example.katowiceapp.ui.theme.KatowiceAppTheme


@Composable
fun DetailedRecommendationScreen(
    @DrawableRes image: Int,
    description: String,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = painterResource(image),
            contentDescription = null,
            contentScale = ContentScale.FillWidth,
            modifier = Modifier
                .padding(
                    top = dimensionResource(R.dimen.padding_medium),
                    start = dimensionResource(R.dimen.padding_small),
                    end = dimensionResource(R.dimen.padding_small)
                )
                .fillMaxWidth()
        )
        Text(
            text = description,
            modifier = Modifier
                .padding(
                    top = dimensionResource(R.dimen.padding_large),
                    start = dimensionResource(R.dimen.padding_medium),
                    end = dimensionResource(R.dimen.padding_medium)
                ),
            textAlign = TextAlign.Right
        )
    }
}

@Preview(showBackground = true)
@Composable
fun DetailedRecommendationScreenPreview() {
    KatowiceAppTheme {
        DetailedRecommendationScreen(
            image = RecommendationsDataProvider.CoffeeShopsRecommendationItemList[0].image,
            description = stringResource(RecommendationsDataProvider.CoffeeShopsRecommendationItemList[0].description),
            modifier = Modifier.fillMaxWidth()
        )
    }
}