package com.ani.hngfirsttask.navigation

import CVEditScreen
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.ani.hngfirsttask.ui.CVHomeScreen

@Composable
fun Navigation() {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = Screen.HomeScreen.route) {
        composable(route = Screen.HomeScreen.route){
            CVHomeScreen(navController = navController)
        }
        composable(route = Screen.WebViewScreen.route){
            CVEditScreen(navController = navController)
        }
    }
}