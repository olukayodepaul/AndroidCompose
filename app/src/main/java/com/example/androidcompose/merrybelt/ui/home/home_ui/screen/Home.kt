package com.example.androidcompose.merrybelt.ui.home.home_ui.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.androidcompose.merrybelt.theme.MChild
import com.example.androidcompose.merrybelt.theme.Monsoon
import com.example.androidcompose.merrybelt.theme.Shapes
import com.example.androidcompose.merrybelt.theme.White

@Composable
fun HomeScreen() {
    MaterialTheme{
        val shape = RoundedCornerShape(12.dp)
        Column(
            modifier = Modifier
                .background(color = MChild)
                .fillMaxHeight()
                .fillMaxWidth(),
        ) {

            Column(modifier = Modifier
                .height(150.dp)
                .fillMaxWidth()
                .background(color = MChild)
            ) {

            }

            Column(modifier = Modifier
                .fillMaxHeight()
                .fillMaxWidth(),
                ) {
                Box(
                    modifier = Modifier
                        .fillMaxHeight()
                        .fillMaxWidth()
                        .clip(RoundedCornerShape(topEnd = 25.dp, topStart = 25.dp))
                        .background(White)
                ){

                }
            }

        }
    }
}

@Composable
@Preview
fun HomeScreenPreview() {
    HomeScreen()
}