package com.example.androidcompose.merrybelt.ui.home.trabsfer.transfer_presentation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.TextField
import androidx.compose.material.TextFieldDefaults
import androidx.compose.material.icons.Icons
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.androidcompose.merrybelt.ui.home.trabsfer.transfer_presentation.ui.theme.AndroidComposeTheme
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.androidcompose.R
import com.example.androidcompose.merrybelt.assets.Fonts
import com.example.androidcompose.merrybelt.theme.*
import com.example.androidcompose.merrybelt.ui.home.home_ui.screen.getNameInitialsBg
import com.example.androidcompose.merrybelt.util.UtilCompose.InputWidget
import com.example.androidcompose.merrybelt.util.UtilCompose.UtilSpaceInBetween
import com.example.androidcompose.merrybelt.util.UtilCompose.isMutableStateOf

class TransferActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                Column(modifier = Modifier
                    .fillMaxSize()
                    .background(White),
                    horizontalAlignment = Alignment.CenterHorizontally,
                ) {
                   Column(modifier = Modifier.padding(end = 20.dp, start = 20.dp)) {
                       UtilSpaceInBetween(20)
                       Spinner()
                   }
                }
            }
        }
    }
}

@Composable
fun Spinner() {

}


@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    AndroidComposeTheme {
        UtilSpaceInBetween(20)

    }
}