package com.example.androidcompose.merrybelt.ui.transfer.transfer_ui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.ScrollState
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.androidcompose.R
import com.example.androidcompose.merrybelt.assets.Fonts
import com.example.androidcompose.merrybelt.assets.Fonts.Montserrat
import com.example.androidcompose.merrybelt.assets.Fonts.RobotoBold
import com.example.androidcompose.merrybelt.theme.*
import com.example.androidcompose.merrybelt.ui.dto.Specimen
import com.example.androidcompose.merrybelt.ui.home.home_ui.screen.Links
import com.example.androidcompose.merrybelt.util.ScaffoldWithTopBar
import com.example.androidcompose.merrybelt.util.SubmitButton
import com.example.androidcompose.merrybelt.util.UtilCompose.InputWidget
import com.example.androidcompose.merrybelt.util.UtilCompose.SpecimenSpinners
import com.example.androidcompose.merrybelt.util.UtilCompose.UtilSpaceInBetween


class TransferActivity : ComponentActivity() {

    var selectedSpecimen: Specimen? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

            val specimen = ArrayList<Specimen>()
            specimen.add(Specimen(plantName = "Beautiful"))
            specimen.add(Specimen(plantName = "Paul"))
            specimen.add(Specimen(plantName = "Kayode"))
            val shape = RoundedCornerShape(12.dp)

            MaterialTheme {
                Scaffold(
                    topBar = {
                        TopAppBar(
                            title = {
                                Text(
                                    text = "Transfer Fund",
                                    style = TextStyle(
                                        fontFamily = Montserrat,
                                        fontSize = 14.sp
                                    )
                                )
                            },
                            navigationIcon = {
                                IconButton(onClick = {}) {
                                    Icon(Icons.Filled.ArrowBack,"backIcon", tint = White)
                                }
                            },
                            backgroundColor = MChild,
                            contentColor = Color.White,
                            elevation = 0.dp
                        )
                    }, content = {
                        Column(
                            modifier = Modifier
                                .background(color = MChild)
                                .fillMaxHeight()
                                .fillMaxWidth(),
                        ) {

                            Column(modifier = Modifier
                                .height(100.dp)
                                .fillMaxWidth()
                                .background(color = MChild)
                                .padding(20.dp),
                                verticalArrangement = Arrangement.Center

                            ) {

                                Text(
                                    text = "Current Balance",
                                    style = TextStyle(
                                        fontFamily = RobotoBold,
                                        color = White,
                                        fontSize = 13.sp
                                    ),
                                    modifier = Modifier
                                        .align(Alignment.CenterHorizontally),
                                )

                                Text(
                                    text = "3,533.00",
                                    modifier = Modifier
                                        .align(Alignment.CenterHorizontally),
                                    style = TextStyle(
                                        fontSize = 29.sp,
                                        fontFamily = RobotoBold,
                                        color = White
                                    )
                                )
                            }

                            Column(modifier = Modifier
                                .fillMaxHeight()
                                .fillMaxWidth(),
                            ) {
                                Column(
                                    modifier = Modifier
                                        .fillMaxHeight()
                                        .fillMaxWidth()
                                        .clip(RoundedCornerShape(topEnd = 30.dp, topStart = 30.dp))
                                        .background(White)
                                        .padding(start = 20.dp, end = 20.dp),
                                    horizontalAlignment = Alignment.CenterHorizontally,
                                ){
                                    UtilSpaceInBetween(40)
                                    SpecimenSpinners(specimen)
                                    InputWidget("Account Number",0)
                                    InputWidget("Account Name",1)
                                    InputWidget("Amount",2)
                                    InputWidget("Remark",3)
                                    UtilSpaceInBetween(5)
                                    SubmitButton("Continue")
                                }
                            }
                        }
                    }
                )
            }
        }
    }
}



@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    AndroidComposeTheme {
        ScaffoldWithTopBar()
    }
}



