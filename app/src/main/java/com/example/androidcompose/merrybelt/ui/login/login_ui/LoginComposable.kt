package com.example.androidcompose.merrybelt.ui.login.login_ui


import android.content.Context
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.ClickableText
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.androidcompose.R
import com.example.androidcompose.merrybelt.util.UtilCompose.UtilSpaceInBetween
import com.example.androidcompose.merrybelt.assets.Fonts.MontserratBold
import com.example.androidcompose.merrybelt.theme.MChild
import com.example.androidcompose.merrybelt.theme.Menus
import com.example.androidcompose.merrybelt.theme.White


object LoginComposable {

    @Composable
    fun loginUi(context: Context) {
        MaterialTheme{
            Column(
                modifier = Modifier
                    .padding(0.dp)
                    .fillMaxWidth()
                    .fillMaxHeight()
                    .background(
                        color = White
                    )
            ) {
                Column(
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 60.dp)
                ) {

                    Image(
                        painterResource(id = R.drawable.mb1200x630),
                        modifier = Modifier
                            .height(70.dp)
                            .width(70.dp)
                            .align(Alignment.CenterHorizontally),
                        contentScale = ContentScale.Crop,
                        contentDescription = "Logo",
                    )
                    UtilSpaceInBetween(100)
                    InputForm("Username")
                    InputForm("Password")
                    SubmitButton("Login")
                    copyWrite("2022")
                }
            }
        }
    }

    @Composable
    fun InputForm(hint:String) {
        TextField(
            label = { Text(text = "$hint")},
            value = "",
            onValueChange = {},
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 30.dp, end = 30.dp, top = 10.dp)
        )
    }



    @Composable
    fun SubmitButton(isContent:String) {
        Button(
            onClick = {},
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 30.dp, end = 30.dp, top = 20.dp),
            colors = ButtonDefaults.buttonColors(
                backgroundColor = MChild
            ),

        ) {
            Text(
                text = isContent,
                style = TextStyle(
                    color = White,
                    fontSize = 20.sp,
                    fontFamily = MontserratBold
                ),
            )
        }
    }
    
    @Composable
    fun copyWrite(copyWriteYear:String){
        Box(modifier = Modifier.fillMaxSize()) {
            ClickableText(
                text = AnnotatedString("© $copyWriteYear Merry Belt. All Rights Reserved."),
                modifier = Modifier
                    .align(Alignment.BottomCenter)
                    .padding(20.dp),
                onClick = {},
                style = TextStyle(
                    fontSize = 10.sp,
                    fontFamily = MontserratBold,
                    //textDecoration = TextDecoration.Underline,
                    color = Menus
                )
            )
        }
    }

}