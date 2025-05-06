package com.example.katowiceapp

import androidx.activity.ComponentActivity
import androidx.compose.ui.test.assertIsDisplayed
import androidx.compose.ui.test.junit4.StateRestorationTester
import androidx.compose.ui.test.junit4.createAndroidComposeRule
import androidx.compose.ui.test.onNodeWithText
import androidx.compose.ui.test.performClick
import com.example.katowiceapp.data.datasource.CategoriesDataProvider
import org.junit.Rule
import org.junit.Test

class ReplyAppStateRestorationTest {

    @get:Rule
    val composeTestRule = createAndroidComposeRule<ComponentActivity>()

    @Test
    fun device_selectCategoryCategoryRetained_afterConfigChange() {
        // Setup app
        val stateRestorationTester = StateRestorationTester(composeTestRule)
        stateRestorationTester.setContent { KatowiceApp() }

        // Verify that the first category is displayed
        composeTestRule.onNodeWithText(
            composeTestRule.activity.getString(CategoriesDataProvider.CategoryItemList[0].name)
        ).assertIsDisplayed()

        // Click on the first category
        composeTestRule.onNodeWithText(
            composeTestRule.activity.getString(CategoriesDataProvider.CategoryItemList[0].name)
        ).performClick()

        // Verify that there is the back button and the first recommendation for the selected category
        composeTestRule.onNodeWithContentDescriptionForStringId(
            R.string.back_button
        ).assertExists()
        composeTestRule.onNodeWithText(
            composeTestRule.activity.getString(CategoriesDataProvider.CategoryItemList[0].recommendations[0].name)
        ).assertExists()

        // Simulate a config change
        stateRestorationTester.emulateSavedInstanceStateRestore()

        // Verify that it still shows the back button and the first recommendation for the selected category
        composeTestRule.onNodeWithContentDescriptionForStringId(
            R.string.back_button
        ).assertExists()
        composeTestRule.onNodeWithText(
            composeTestRule.activity.getString(CategoriesDataProvider.CategoryItemList[0].recommendations[0].name)
        ).assertExists()
    }
}