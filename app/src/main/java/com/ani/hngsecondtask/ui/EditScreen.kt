import android.graphics.Bitmap
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.compose.foundation.layout.*
import androidx.compose.material.CircularProgressIndicator
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.viewinterop.AndroidView
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import com.ani.hngfirsttask.composables.AppBar
import com.ani.hngfirsttask.composables.AppButton
import com.ani.hngsecondtask.R
import com.ani.hngsecondtask.view_model.CVViewModel


@Composable
fun CVEditScreen(
    navController: NavController
) {
    val viewModel = viewModel<CVViewModel>()


    Scaffold(
        modifier = Modifier.fillMaxWidth(),
        topBar = {
            AppBar(text = R.string.cv_edit_screen, isAnotherScreen = true, onBackButtonPressed = {
                navController.navigateUp()
            })
        },
    ) {
        Column(
            modifier = Modifier.padding(all = 10.dp)
        ) {
            OutlinedTextField(
                label = {
                    Text(text = "Full Name")
                },
                value = viewModel.firstNameAndLastName.value,
                onValueChange = { text ->
                    viewModel.firstNameAndLastName.value = text
                })

            OutlinedTextField(
                label = {
                    Text(text = "Slack Name")
                },
                value = viewModel.slackName.value,
                onValueChange = { text ->
                    viewModel.slackName.value = text
                })

            OutlinedTextField(
                label = {
                    Text(text = "Slack Name")
                },
                value = viewModel.githubUserName.value,
                onValueChange = { text ->
                    viewModel.githubUserName.value = text
                })

            OutlinedTextField(
                label = {
                    Text(text = "Personal Bio")
                },
                maxLines = 8,
                value = viewModel.personalBio.value,
                onValueChange = { text ->
                    viewModel.personalBio.value = text
                })

            AppButton(onClick = { /*TODO*/ }, buttonText = R.string.edit, padding = 10)
        }
    }
}

