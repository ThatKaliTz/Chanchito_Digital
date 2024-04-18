package com.example.chanchitodigital.ui

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.chanchitodigital.ui.theme.Purple
import com.example.chanchitodigital.ui.theme.White
import com.example.chanchitodigital.ui.theme.poppinsFontFamily

@Composable
fun MyButton(modifier: Modifier = Modifier,
             text:String) {
    Button(
        modifier = modifier,
        onClick = {},
        colors = ButtonDefaults.buttonColors(
            containerColor = Purple,
            contentColor = White
        ),
        shape =  RoundedCornerShape(25)
    ) {
        Text(
            text = text,
            fontFamily = poppinsFontFamily,
            fontWeight = FontWeight.Bold,
            fontSize = 16.sp,
            color = White
        )
    }
}
