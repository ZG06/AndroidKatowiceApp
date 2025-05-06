package com.example.katowiceapp

import androidx.activity.ComponentActivity
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.test.junit4.createAndroidComposeRule
import androidx.compose.ui.test.onNodeWithContentDescription
import androidx.compose.ui.test.onNodeWithText
import androidx.compose.ui.test.performClick
import androidx.navigation.compose.ComposeNavigator
import androidx.navigation.testing.TestNavHostController
import com.example.katowiceapp.data.datasource.CategoriesDataProvider
import org.junit.Before
import org.junit.Rule
import org.junit.Test


class KatowiceAppScreenNavigationTest {

    @get:Rule
    val composeTestRule = createAndroidComposeRule<ComponentActivity>()

    private lateinit var navController: TestNavHostController

    // Setup Katowice App NavHost
    @Before
    fun setupKatowiceAppNavHost() {
        composeTestRule.setContent {
            navController = TestNavHostController(LocalContext.current).apply {
                navigatorProvider.addNavigator(ComposeNavigator())
            }
            KatowiceApp(navController = navController)
        }
    }

    // Verifying that the first screen is the category screen
    @Test
    fun katowiceNavHost_verifyStartDestination() {
        navController.assertCurrentRouteName(KatowiceScreen.Categories.name)
    }

    // Verify that there is no back button on the first category screen
    @Test
    fun katowiceNavHost_verifyBackNavigationNotShownOnStartCategoryScreen() {
        val backText = composeTestRule.activity.getString(R.string.back_button)

        composeTestRule.onNodeWithContentDescription(backText).assertDoesNotExist()
    }

    // Verify that there is the back button on the recommendations screen
    @Test
    fun katowiceNavHost_verifyBackNavigationShownOnRecommendationsScreen() {
        val backText = composeTestRule.activity.getString(R.string.back_button)

        composeTestRule.onNodeWithText(
            composeTestRule.activity.getString(CategoriesDataProvider.CategoryItemList[0].name)
        ).performClick()

        composeTestRule.onNodeWithContentDescription(backText).assertExists()
    }

    // Verify that there is the back button on the detailed recommendations screen
    @Test
    fun katowiceNavHost_verifyBackNavigationShownOnDetailedRecommendationsScreen() {
        val backText = composeTestRule.activity.getString(R.string.back_button)

        composeTestRule.onNodeWithText(
            composeTestRule.activity.getString(CategoriesDataProvider.CategoryItemList[0].name)
        ).performClick()

        composeTestRule.onNodeWithText(
            composeTestRule.activity.getString(CategoriesDataProvider.CategoryItemList[0].recommendations[0].name)
        ).performClick()

        composeTestRule.onNodeWithContentDescription(backText).assertExists()
    }

    // Verify that after clicking on the first category navigation to the selected recommendations happens
    @Test
    fun katowiceNavHost_selectFirstCategory_navigateToSelectedRecommendationsScreen() {
        composeTestRule.onNodeWithText(
            composeTestRule.activity.getString(CategoriesDataProvider.CategoryItemList[0].name)
        ).performClick()

        navController.assertCurrentRouteName(KatowiceScreen.Recommendations.name)
        composeTestRule.onNodeWithText(
            composeTestRule.activity.getString(CategoriesDataProvider.CategoryItemList[0].recommendations[0].name)
        ).assertExists()
    }

    // Verify that after clicking on the first category and first recommendation detailed recommendation is shown
    @Test
    fun katowiceNavHost_selectFirstCategoryFirstRecommendation_navigateToSelectedDetailedRecommendation() {
        composeTestRule.onNodeWithText(
            composeTestRule.activity.getString(CategoriesDataProvider.CategoryItemList[0].name)
        ).performClick()

        composeTestRule.onNodeWithText(
            composeTestRule.activity.getString(CategoriesDataProvider.CategoryItemList[0].recommendations[0].name)
        ).performClick()

        navController.assertCurrentRouteName(KatowiceScreen.DetailedRecommendation.name)
        composeTestRule.onNodeWithText(
            composeTestRule.activity.getString(CategoriesDataProvider.CategoryItemList[0].recommendations[0].description)
        ).assertExists()
    }
}