package com.example.chanchitodigital.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
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