package com.example.katowiceapp.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import com.example.katowiceapp.R
import com.example.katowiceapp.data.SelectableItem


// Base list-structured composable for displaying categories and recommendations
@Composable
fun BaseListScreen(
    options: List<SelectableItem>,
    onClick: (SelectableItem) -> Unit,
    modifier: Modifier = Modifier
) {
    LazyColumn(
        modifier = modifier
    ) {
        items(options) { item ->
            BaseListItem(
                item = item,
                onClick = {
                    onClick(item)
                }
            )
        }
    }
}

@Composable
fun BaseListItem(
    item: SelectableItem,
    modifier: Modifier = Modifier,
    onClick: () -> Unit
) {
    Card(
        onClick = onClick,
        modifier = modifier
            .padding(
                top = dimensionResource(R.dimen.padding_small),
                start = dimensionResource(R.dimen.padding_small),
                end = dimensionResource(R.dimen.padding_small)
            )
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .fillMaxWidth()
        ) {
            Image(
                modifier = Modifier
                    .size(dimensionResource(R.dimen.list_image_size))
                    .padding(dimensionResource(R.dimen.padding_small))
                    .clip(MaterialTheme.shapes.small),
                painter = painterResource(item.image),
                contentDescription = null,
                contentScale = ContentScale.Crop
            )
            Text(
                text = stringResource(item.name)
            )
        }
    }
}