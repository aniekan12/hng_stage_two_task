package com.ani.hngsecondtask.view_model

import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue

import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.lifecycle.ViewModel

class CVViewModel : ViewModel() {
    var firstNameAndLastName =
        mutableStateOf("Aniekan-abasi Godwin Akpakpan")

    var slackName = mutableStateOf("aniekan akpakpan")

    var githubUserName = mutableStateOf("@aniekan12")

    var personalBio = mutableStateOf(
        "" +
                "Calm, professional, and product-oriented Kotlin Developer with 4 months of experience working with and leading teams in implementing beautiful User Interfaces and functionalities in mobile applications."
    )

}