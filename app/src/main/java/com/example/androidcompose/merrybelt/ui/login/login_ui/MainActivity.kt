package com.example.androidcompose.merrybelt.ui.login.login_ui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.androidcompose.merrybelt.ui.login.login_ui.LoginComposable.loginUi


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            loginUi(applicationContext)
        }
    }
}

