import android.graphics.Bitmap
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.compose.foundation.layout.*
import androidx.compose.material.CircularProgressIndicator
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.viewinterop.AndroidView
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import com.ani.hngfirsttask.composables.AppBar
import com.ani.hngfirsttask.composables.AppButton
import com.ani.hngfirsttask.navigation.Screen
import com.ani.hngsecondtask.R
import com.ani.hngsecondtask.view_model.CVViewModel


@Composable
fun CVEditScreen(
    viewModel: CVViewModel,
    navController: NavController
) {
    val user = viewModel.user

    var editFullName by remember {
        mutableStateOf(user.fullName)
    }
    var editSlackName by remember {
        mutableStateOf(user.slackName)
    }

    var editGitName by remember {
        mutableStateOf(user.gitName)
    }

    var editPersonalBio by remember {
        mutableStateOf(user.personalBio)
    }


    Scaffold(

        topBar = {
            AppBar(text = R.string.cv_edit_screen, isAnotherScreen = true, onBackButtonPressed = {
                navController.navigateUp()
            })
        },
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(all = 10.dp)
        ) {
            OutlinedTextField(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 10.dp),
                label = {
                    Text(text = "Full Name")
                },
                value = editFullName,
                onValueChange = {
                    editFullName = it
                })

            OutlinedTextField(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 10.dp),
                label = {
                    Text(text = "Slack Name")
                },
                value = editSlackName,
                onValueChange = {
                    editSlackName = it
                })

            OutlinedTextField(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 10.dp),
                label = {
                    Text(text = "Github Name")
                },
                value = editGitName,
                onValueChange = {
                    editGitName = it
                })

            OutlinedTextField(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 10.dp),
                label = {
                    Text(text = "Personal Bio")
                },
                maxLines = 8,
                value = editPersonalBio,
                onValueChange = {
                    editPersonalBio = it
                })

            AppButton(onClick = {
                user.fullName = editFullName
                user.slackName = editSlackName
                user.gitName = editGitName
                user.personalBio = editPersonalBio
                navController.popBackStack(
                    Screen.HomeScreen.route,
                    inclusive = false
                )

            }, buttonText = R.string.edit, padding = 20)
        }
    }
}

