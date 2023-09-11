package com.ani.hngsecondtask

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.ani.hngfirsttask.navigation.Navigation
import com.ani.hngfirsttask.ui.theme.HngSecondTaskTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            HngSecondTaskTheme {
                Navigation()
            }
        }
    }
}
