package com.example.katowiceapp

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.example.katowiceapp.data.PlaceUiState
import com.example.katowiceapp.data.datasource.CategoriesDataProvider
import com.example.katowiceapp.ui.CategoryScreen
import com.example.katowiceapp.ui.DetailedRecommendationScreen
import com.example.katowiceapp.ui.KatowiceViewModel
import com.example.katowiceapp.ui.RecommendationScreen
import com.example.katowiceapp.ui.theme.KatowiceAppTheme


enum class KatowiceScreen {
    Categories,
    Recommendations,
    DetailedRecommendation
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun KatowiceAppBar(
    placeUiState: PlaceUiState,
    canNavigateBack: Boolean,
    navigateUp: () -> Unit,
    modifier: Modifier = Modifier
) {
    CenterAlignedTopAppBar(
        title = {
            if (placeUiState.selectedCategory != null && placeUiState.selectedRecommendation == null) {
                Text(
                    text = placeUiState.selectedCategory.name
                )
            } else if (placeUiState.selectedRecommendation != null) {
                Text(
                    text = placeUiState.selectedRecommendation.name
                )
            } else {
                Text(
                    text = stringResource(R.string.app_name)
                )
            }
        },
        modifier = modifier,
        navigationIcon = {
            if (canNavigateBack) {
                IconButton(onClick = navigateUp) {
                    Icon(
                        imageVector = Icons.AutoMirrored.Filled.ArrowBack,
                        contentDescription = stringResource(R.string.back_button)
                    )
                }
            }
        }
    )
}

@Composable
fun KatowiceApp(
    navController: NavHostController = rememberNavController()
) {

    // Create ViewModel
    val viewModel: KatowiceViewModel = viewModel()

    // Create uiState
    val uiState by viewModel.uiState.collectAsState()

    /*
    When navigating through the app, doing the following:
        * If the user navigates to the 'Category' screen -> reset the selectedCategory in the UiState
        * If the user navigates to the 'Recommendation' screen -> reset the selectedRecommendation in the UiState
    */
    navController.addOnDestinationChangedListener { _, destination, _ ->
        when (destination.route) {
            KatowiceScreen.Categories.name -> {
                viewModel.resetCategory()
                viewModel.resetRecommendation()
            }
            KatowiceScreen.Recommendations.name -> viewModel.resetRecommendation()
            else -> {}
        }
    }

    val backStackEntry = navController.currentBackStackEntryAsState().value

    Scaffold(
        topBar = {
            KatowiceAppBar(
                placeUiState = uiState,
                canNavigateBack = backStackEntry?.destination?.route != KatowiceScreen.Categories.name,
                navigateUp = { navController.navigateUp() }
            )
        }
    ) { innerPadding ->
        NavHost(
            navController = navController,
            startDestination = KatowiceScreen.Categories.name,
            modifier = Modifier.padding(innerPadding)
        ) {
            composable(route = KatowiceScreen.Categories.name) {
                CategoryScreen(
                    options = CategoriesDataProvider.CategoryItemList,
                    onClick = {
                        viewModel.selectCategory(it)
                        navController.navigate(KatowiceScreen.Recommendations.name)
                    }
                )
            }
            composable(route = KatowiceScreen.Recommendations.name) {
                uiState.selectedCategory?.let { category ->
                    RecommendationScreen(
                        options = category.recommendations,
                        onClick = {
                            viewModel.selectRecommendation(it)
                            navController.navigate(KatowiceScreen.DetailedRecommendation.name)
                        }
                    )
                }
            }
            composable(route = KatowiceScreen.DetailedRecommendation.name) {
                uiState.selectedRecommendation?.let { recommendation ->
                    DetailedRecommendationScreen(
                        image = recommendation.image,
                        description = recommendation.description,
                        modifier = Modifier.verticalScroll(rememberScrollState())
                    )
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun KatowiceAppPreview() {
    KatowiceAppTheme {
        KatowiceApp()
    }
}