package com.example.chanchitodigital

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.chanchitodigital.ui.MyTextInput
import com.example.chanchitodigital.ui.MyTitle
import com.example.chanchitodigital.ui.theme.Black
import com.example.chanchitodigital.ui.theme.LightGrey
import com.example.chanchitodigital.ui.theme.aileronFontFamily


@Composable
fun AddIncomeScreen() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(LightGrey)
    ) {
        AddIncomeContent()
    }
}

@Composable
fun AddIncomeContent(modifier: Modifier = Modifier) {
        Column(
            modifier.fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            MyTitle(text = "Agregar ingreso")
            Spacer(modifier = Modifier.height(50.dp))
            AmountInput()
        }

}

@Composable
fun AmountInput() {
    Box(
        modifier = Modifier
            .shadow(
                elevation = 10.dp
            )
            .background(Color.White)
            .width(340.dp)
            .padding(
                top = 40.dp, bottom = 50.dp,
                start = 20.dp, end = 20.dp
            )
        ,
        contentAlignment = Alignment.Center
    ) {
        var amount by remember { mutableStateOf("") }
        MyTextInput(
            label = "MONTO",
            trailing = "",
            text = amount, // Aquí pasamos el valor de username al componente MyTextInput
            modifier = Modifier.fillMaxWidth(),
            onTextChanged = { newText ->
                amount = newText
            }
        )
    }
}

@Preview(showSystemUi = true)
@Composable
fun ShowAddIncome() {
    AddIncomeScreen()
}