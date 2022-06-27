package com.example.androidcompose.merrybelt.util

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

object UtilCompose {

    @Composable
    fun UtilSpaceInBetween(unitOfMeasure:Int){
        Spacer(modifier = Modifier.padding(bottom = unitOfMeasure.dp))
    }

}