package com.example.androidcompose.merrybelt.ui.home.home_ui.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.androidcompose.R
import com.example.androidcompose.merrybelt.assets.Fonts.Montserrat
import com.example.androidcompose.merrybelt.assets.Fonts.RobotoBold
import com.example.androidcompose.merrybelt.theme.*
import com.example.androidcompose.merrybelt.util.UtilCompose.UtilSpaceInBetween


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
                .height(180.dp)
                .fillMaxWidth()
                .background(color = MChild)
                .padding(20.dp),
               verticalArrangement = Arrangement.Center

            ) {
                Text(text = "Available Balance",
                    modifier = Modifier
                        .align(Alignment.Start),
                    style = TextStyle(
                        fontSize = 12.sp,
                        fontFamily = RobotoBold,
                        color = White,
                        fontWeight = FontWeight.Bold
                    )
                )
                Spacer(modifier = Modifier.padding(bottom = 5.dp))

                Text(text = "012199039",
                    modifier = Modifier
                        .align(Alignment.Start),
                    style = TextStyle(
                        fontSize = 13.sp,
                        fontFamily = Montserrat,
                        color = White,
                        fontWeight = FontWeight.Bold,
                    )
                )

                Text(
                    text = "3,533.00",
                    modifier = Modifier
                        .align(Alignment.Start),
                    style = TextStyle(
                        fontSize = 25.sp,
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
                    UtilSpaceInBetween(35)
                    Links("Credit Account",0)
                    UtilSpaceInBetween(5)
                    Links("Withdraw",1)
                    UtilSpaceInBetween(5)
                    Links("Transfer",2)
                    UtilSpaceInBetween(5)
                    Links("Bill payment",3)
                }
            }
        }
    }
}

@Composable
fun Links(title:String, switchImage: Int){


    Card(
        elevation = 3.dp,
        shape = RoundedCornerShape(10.dp),
        modifier = Modifier
            .fillMaxWidth()
        ) {
        Row(
            modifier = Modifier.padding(10.dp)
        ) {

            Card(
                shape = RoundedCornerShape(3.dp),
                modifier = Modifier.padding(5.dp)
            ) {
                Column(
                    modifier = Modifier
                        .align(Alignment.CenterVertically)
                        .background(changeBgColor(switchImage))
                        .height(30.dp)
                        .width(30.dp)
                        .padding(5.dp),
                    verticalArrangement = Arrangement.Center,

                    ) {

                    Image(
                        painterResource(id = getNameInitialsBg(switchImage)),
                        modifier = Modifier
                            .fillMaxWidth()
                            .fillMaxHeight()
                            .align(Alignment.CenterHorizontally),
                        contentScale = ContentScale.Crop,
                        contentDescription = "Logo",
                    )
                }
            }

            Text(
                text = title,
                modifier = Modifier
                    .padding(start = 10.dp)
                    .align(Alignment.CenterVertically),
                style = TextStyle(
                    fontSize = 18.sp,
                    fontFamily = Montserrat,
                    color = Blues
                )

            )

            Column(
                horizontalAlignment = Alignment.End,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(5.dp, top = 9.dp),
                verticalArrangement = Arrangement.Center,
            ) {
                Image(
                    painterResource(id = R.drawable.ic_baseline_navigate_next_24),
                    modifier = Modifier
                        .height(25.dp)
                        .width(25.dp)
                        .align(Alignment.End),
                    contentScale = ContentScale.Crop,
                    contentDescription = "Logo",
                )
            }
        }

    }
}

@Composable
fun getNameInitialsBg(switchImage: Int):Int {
    val drawables = arrayOf(
        R.drawable.ic_baseline_domain_add_24, R.drawable.ic_baseline_business_center_24, R.drawable.ic_baseline_swap_horiz_24,
        R.drawable.ic_baseline_payments_24
    )
    return drawables[switchImage]
}

@Composable
fun changeBgColor(switchColor: Int):Color {
    val color = arrayOf(
        Blues, Blu,Purple200, reds
    )
    return color[switchColor]
}

@Composable
@Preview
fun HomeScreenPreview() {
    HomeScreen()
}