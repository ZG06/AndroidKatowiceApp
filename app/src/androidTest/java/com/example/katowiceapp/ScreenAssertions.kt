package com.example.katowiceapp

import androidx.navigation.NavController
import junit.framework.Assert.assertEquals


fun NavController.assertCurrentRouteName(expectedRouteName: String) {
    assertEquals(expectedRouteName, currentBackStackEntry?.destination?.route)
}