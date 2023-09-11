package com.ani.hngfirsttask.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.material.Card
import androidx.compose.material.Divider
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.ani.hngfirsttask.composables.*
import com.ani.hngfirsttask.ui.theme.Black
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
    Box(
        modifier = Modifier
            .padding(all = 10.dp)
            .border(width = 2.dp, color = Black)

    ) {


        Column(
//            verticalArrangement = Arrangement.SpaceBetween,
           // horizontalAlignment = Alignment.Start,
            modifier = Modifier
                .fillMaxSize()
                .fillMaxWidth()
        ) {
            Column(
                // verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier
                    .padding(top = 35.dp)
                    .fillMaxSize()
                    .fillMaxWidth()
            ) {
                Heading1Text(
                    text = R.string.slack_name,
                    padding = 10,
                    textAlign = TextAlign.Center,
                    modifier = Modifier.padding(top = 10.dp, bottom = 10.dp)
                )

                Row() {

                    Image(
                        painter = painterResource(id = R.drawable.slack),
                        contentDescription = "slack",
                        modifier = Modifier
                            .size(30.dp)

                    )
                    BodyText(
                        fontWeight = FontWeight.W400,
                        text = "aniekan akpakpan",
                        modifier = Modifier.padding(horizontal = 5.dp)
                    )
                }

                Row() {
                    Image(
                        painter = painterResource(id = R.drawable.github),
                        contentDescription = "github",
                        modifier = Modifier
                            .size(30.dp)


                    )

                    BodyText(
                        fontWeight = FontWeight.W400,
                        text = "@aniekan12",
                        modifier = Modifier.padding(vertical = 5.dp, horizontal = 4.dp)
                    )
                }

                Divider(
                    color = Black,
                    modifier = Modifier.padding(horizontal = 8.dp, vertical = 15.dp)
                )

                Column(
                    horizontalAlignment = Alignment.Start,

                    ) {

                    Heading1Text(
                        text = R.string.personal_bio,
                        textAlign = TextAlign.Start,
                        modifier = Modifier.padding(start = 8.dp)
                    )
                }




//            AppButton(onClick = {
//                navController.navigate(Screen.WebViewScreen.route)
//            }, buttonText = R.string.open_github, padding = 10)
            }

            Column() {
                Heading1Text(
                    text = R.string.personal_bio,
                    textAlign = TextAlign.Start,
                    modifier = Modifier.padding(start = 8.dp)
                )
            }
//            AppButton(onClick = {
//                navController.navigate(Screen.WebViewScreen.route)
//            }, buttonText = R.string.open_github, padding = 10)


        }



    }


}
