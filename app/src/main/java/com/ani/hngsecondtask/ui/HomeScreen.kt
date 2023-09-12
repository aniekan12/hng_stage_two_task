package com.ani.hngfirsttask.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Edit
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import androidx.navigation.NavOptions
import androidx.navigation.Navigator
import com.ani.hngfirsttask.composables.*
import com.ani.hngfirsttask.navigation.Screen
import com.ani.hngfirsttask.ui.theme.Black
import com.ani.hngsecondtask.R
import com.ani.hngsecondtask.view_model.CVViewModel

@Composable
fun CVHomeScreen(viewModel:CVViewModel, navController: NavController) {
    Scaffold(
        topBar = {
            AppBar(text = R.string.cv_home_screen, isAnotherScreen = false) {}
        },
    ) {
        Content(navController = navController, viewModel = viewModel)
    }

}

@Composable

fun Content(viewModel:CVViewModel, navController: NavController) {
    val user = viewModel.user

    Box(
        modifier = Modifier
            .padding(all = 10.dp)
            .border(width = 2.dp, color = Black)

    ) {
        Column(
            // verticalArrangement = Arrangement.Center,
            //horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .padding(top = 2.dp)
                .fillMaxSize()
                .fillMaxWidth()
        ) {
            Row(
                modifier = Modifier.align(Alignment.End)
            ) {
                IconButton(onClick = {
                    navController.navigate(route = Screen.EditScreen.route)

                }) {
                    Icon(Icons.Filled.Edit, contentDescription = "Edit Button")
                }
            }
            Row(
                modifier = Modifier.align(Alignment.CenterHorizontally)
            ) {
                Heading1Text(
                    text = user.fullName,
                    padding = 10,
                    textAlign = TextAlign.Center,
                    modifier = Modifier.padding(top = 0.dp, bottom = 10.dp)
                )

            }

            Row(
                modifier = Modifier.align(Alignment.CenterHorizontally)
            ) {

                Image(
                    painter = painterResource(id = R.drawable.slack),
                    contentDescription = "slack",
                    modifier = Modifier
                        .size(30.dp)

                )
                BodyText(
                    fontWeight = FontWeight.W400,
                    text = user.slackName,
                    textAlign = TextAlign.Justify,
                    modifier = Modifier.padding(horizontal = 5.dp)
                )
            }

            Row(
                modifier = Modifier.align(Alignment.CenterHorizontally).padding(top = 10.dp)
            ) {
                Image(
                    painter = painterResource(id = R.drawable.github),
                    contentDescription = "github",
                    modifier = Modifier
                        .size(30.dp)


                )

                BodyText(
                    fontWeight = FontWeight.W400,
                    text = user.gitName,
                    textAlign = TextAlign.Start,
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

                Heading4Text(
                    text = "Personal Bio",
                    modifier = Modifier.padding(start = 12.dp)
                )

                BodyText(
                    textAlign = TextAlign.Justify,
                    text = user.personalBio,
                    fontWeight = FontWeight.W200,
                    modifier = Modifier.padding(horizontal = 10.dp, vertical = 10.dp)
                )
            }


        }

    }


}



