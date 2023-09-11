package com.ani.hngfirsttask.navigation

import CVEditScreen
import android.util.Log
import androidx.compose.runtime.Composable
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.ani.hngfirsttask.ui.CVHomeScreen

@Composable
fun Navigation() {
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = Screen.HomeScreen.route,
    ) {
        composable(
            route = Screen.HomeScreen.route,
        ) {
            CVHomeScreen(navController = navController)
        }
        composable(
            route = Screen.EditScreen.route,
//            arguments = listOf(
//                navArgument("fullName") {
//                    type = NavType.StringType
//                },
//                navArgument("slackName") {
//                    type = NavType.StringType
//                },
//                navArgument("gitName") {
//                    type = NavType.StringType
//                },
//                navArgument("personalBio") {
//                    type = NavType.StringType
//                }
//            )
        ) {
//            val fullName = it.arguments?.getString("fullName") ?: ""
//            val slackName = it.arguments?.getString("slackName") ?: ""
//            val gitName = it.arguments?.getString("gitName") ?: ""
//            val personalBio = it.arguments?.getString("personalBio") ?: ""

            CVEditScreen(
//                fullName = fullName,
//                slackName = slackName,
//                gitHubName = gitName,
//                personalBio = personalBio,
                navController = navController
            )
            Log.d("navigation", "navigated")
        }
    }
}