package com.ani.hngsecondtask.view_model

import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue

import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.lifecycle.ViewModel
import com.ani.hngsecondtask.model.User

class CVViewModel : ViewModel() {
    var user = User(
        fullName = "Aniekan-abasi Godwin Akpakpan",
        slackName = "aniekan akpakpan",
        gitName = "@aniekan12",
        personalBio = "Calm, professional, and product-oriented Kotlin Developer with 4 months of experience working with and leading teams in implementing beautiful User Interfaces and functionalities in mobile applications.",
    )

}