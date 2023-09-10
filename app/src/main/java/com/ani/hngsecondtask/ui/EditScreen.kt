import android.graphics.Bitmap
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.compose.foundation.layout.*
import androidx.compose.material.CircularProgressIndicator
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.viewinterop.AndroidView
import androidx.navigation.NavController
import com.ani.hngfirsttask.composables.AppBar
import com.ani.hngsecondtask.R


@Composable
fun CVEditScreen(navController: NavController) {
    val visibility = remember { mutableStateOf(false) }

    Scaffold(
        topBar = {
            AppBar(text = R.string.cv_edit_screen, isAnotherScreen = true, onBackButtonPressed = {
                navController.navigateUp()
            })
        },
    ) {
        if (visibility.value) {
            Column(
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally,
            ) {
            }
        }

    }
}

