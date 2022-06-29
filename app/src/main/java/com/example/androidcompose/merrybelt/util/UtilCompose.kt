package com.example.androidcompose.merrybelt.util

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.TextFieldDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import com.example.androidcompose.R
import com.example.androidcompose.merrybelt.assets.Fonts
import com.example.androidcompose.merrybelt.theme.Blues
import com.example.androidcompose.merrybelt.theme.Borderline
import com.example.androidcompose.merrybelt.theme.GreyTransparent

object UtilCompose {

    @Composable
    fun UtilSpaceInBetween(unitOfMeasure:Int){
        Spacer(modifier = Modifier.padding(bottom = unitOfMeasure.dp))
    }

    var isMutableStateOf by mutableStateOf("")

    @Composable
    fun InputWidget(title:String) {
        // Outlined Text Input Field
        UtilSpaceInBetween(5)

        val bColor  = Borderline
        OutlinedTextField(
            modifier = Modifier.fillMaxWidth(),
            value = isMutableStateOf,
            onValueChange = { isMutableStateOf = it},
            label = { Text(
                text= title,
                style = TextStyle(
                    fontFamily = Fonts.Montserrat,
                    color = Blues
                )
            )
            },
            maxLines = 1,
            shape = RoundedCornerShape(6.dp),
            leadingIcon = {
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(
                        painter = painterResource(id = R.drawable.ic_baseline_business_center_24),
                        contentDescription = title)
                }
            },
            colors = TextFieldDefaults.outlinedTextFieldColors(
                backgroundColor = Color(
                    bColor.red, bColor.green, bColor.blue,
                    TextFieldDefaults.BackgroundOpacity
                ),
                focusedBorderColor = bColor,
                unfocusedBorderColor = Color(
                    bColor.red, bColor.green, bColor.blue,
                    TextFieldDefaults.UnfocusedIndicatorLineOpacity,
                ),
                focusedLabelColor = GreyTransparent,
                cursorColor = GreyTransparent
            )
        )
    }




}


