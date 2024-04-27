package com.example.chanchitodigital.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.chanchitodigital.ui.theme.Black
import com.example.chanchitodigital.ui.theme.White
import com.example.chanchitodigital.ui.theme.aileronFontFamily

@Composable
fun MyTitle(text : String) {
    Box(
        modifier = Modifier
            .shadow(
                elevation = 10.dp
            )
            .background(Color.White)
            .fillMaxWidth()
            .padding(top = 20.dp, bottom = 20.dp)
        ,
        contentAlignment = Alignment.Center
    ) {

        Text(
            text = text,
            color = Black,
            fontSize = 24.sp,
            textAlign = TextAlign.Center,
            lineHeight = 32.sp,
            fontFamily = aileronFontFamily,
            fontWeight = FontWeight.Bold,
            )
    }
}
@Composable
fun MyTitleColor(text : String) {
    Box(
        modifier = Modifier
            .shadow(
                elevation = 10.dp
            )
            .background(Color.hsv(258f,1f,1f))
            .fillMaxWidth()
            .padding(top = 20.dp, bottom = 20.dp)
        ,
        contentAlignment = Alignment.Center
    ) {

        Text(
            text = text,
            color = White,
            fontSize = 24.sp,
            textAlign = TextAlign.Center,
            lineHeight = 32.sp,
            fontFamily = aileronFontFamily,
            fontWeight = FontWeight.Bold,
        )
    }
}
@Composable
fun MyTitle2(text : String) {
    Box(
        modifier = Modifier
            .fillMaxWidth()
        ,
        contentAlignment = Alignment.TopCenter
    ) {

        Text(
            text = text,
            color = Black,
            fontSize = 24.sp,
            textAlign = TextAlign.Center,
            lineHeight = 32.sp,
            fontFamily = aileronFontFamily,
            fontWeight = FontWeight.Bold,
        )
    }
}

@Composable
fun MyTitle3(text : String) {

    Box(
        modifier = Modifier
            .fillMaxWidth()
        ,
        contentAlignment = Alignment.TopCenter
    ) {
        Spacer(modifier = Modifier.height(80.dp))

        Text(

            text = text,
            color = Black,
            fontSize = 16.sp,
            textAlign = TextAlign.Center,
            lineHeight = 22.sp,
            fontFamily = aileronFontFamily,
            fontWeight = FontWeight.Bold,
        )
    }
}
@Composable
fun MyTitle4(text : String) {

    Box(
        modifier = Modifier
            .fillMaxWidth()
        ,
        contentAlignment = Alignment.TopCenter
    ) {
        Spacer(modifier = Modifier.height(30.dp))

        Text(

            text = text,
            color = Black,
            fontSize = 16.sp,
            textAlign = TextAlign.Center,
            lineHeight = 22.sp,
            fontFamily = aileronFontFamily,
            fontWeight = FontWeight.Bold,
        )
    }
}