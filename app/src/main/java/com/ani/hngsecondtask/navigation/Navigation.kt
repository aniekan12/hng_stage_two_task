package com.ani.hngfirsttask.navigation

import CVEditScreen
import android.util.Log
import androidx.compose.runtime.Composable
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.ani.hngfirsttask.ui.CVHomeScreen
import com.ani.hngsecondtask.view_model.CVViewModel

@Composable
fun Navigation() {
    val navController = rememberNavController()
    val viewModel = viewModel<CVViewModel>()

    NavHost(
        navController = navController,
        startDestination = Screen.HomeScreen.route,
    ) {
        composable(
            route = Screen.HomeScreen.route,
        ) {

            CVHomeScreen(
                viewModel = viewModel,
                navController = navController,
            )
        }
        composable(
            route = Screen.EditScreen.route,
        ) {
            CVEditScreen(
                navController = navController,
                viewModel = viewModel
            )
            Log.d("navigation", "navigated")
        }
    }
}