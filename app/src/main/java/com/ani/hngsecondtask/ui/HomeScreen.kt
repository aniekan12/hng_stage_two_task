package com.ani.hngfirsttask.ui

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.Card
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import com.ani.hngfirsttask.composables.AppBar
import com.ani.hngsecondtask.R

@Composable
fun CVHomeScreen(navController: NavController) {
    Scaffold(
        topBar = {
            AppBar(text = R.string.cv_home_screen, isAnotherScreen = false) {}
        },
    ) {
        Content(navController = navController)
    }

}

@Composable

fun Content(navController: NavController) {
    Card() {
        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .fillMaxSize()
                .fillMaxWidth()
        ) {
//            CircleAvatar(imageId = R.drawable.ani, contentDescription = "fine ani", circleSize = 200)
//            Heading1Text(text = R.string.slack_name, padding = 10)
//            AppButton(onClick = {
//                navController.navigate(Screen.WebViewScreen.route)
//            }, buttonText = R.string.open_github, padding = 10)
        }
    }
}
