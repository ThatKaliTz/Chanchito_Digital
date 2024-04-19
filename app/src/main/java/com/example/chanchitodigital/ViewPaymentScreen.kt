package com.example.chanchitodigital

import MyDateInput
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
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
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
import com.example.chanchitodigital.ui.Label
import com.example.chanchitodigital.ui.MyButton
import com.example.chanchitodigital.ui.MyCombobox
import com.example.chanchitodigital.ui.MyDescriptionInput
import com.example.chanchitodigital.ui.MyNumberInput
import com.example.chanchitodigital.ui.MyTextInput
import com.example.chanchitodigital.ui.MyTitle
import com.example.chanchitodigital.ui.theme.Black
import com.example.chanchitodigital.ui.theme.LightGrey
import com.example.chanchitodigital.ui.theme.aileronFontFamily
import com.example.chanchitodigital.ui.theme.dmSansFontFamily
import com.example.chanchitodigital.ui.tutorial.ui.MyComponent
import com.example.chanchitodigital.ui.tutorial.ui.MyData


@Composable
fun ViewPaymentScreen() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(LightGrey)
    ) {
        ViewPaymentContent(paymentInfo = paymentList)
    }
}


data class PaymentData(val title: String, val description: String)
private val paymentList : List<PaymentData> = listOf(
    PaymentData("CATEGORÍA", "Categoría 3"),
    PaymentData("DESCRIPCIÓN", "Soy una descripción " +
            "Soy una descripción Soy una descripción Soy una descripción"),
    PaymentData("FECHA DE EXPEDICIÓN", "00/00/0000"),
)

@Composable
fun ViewPaymentContent(modifier: Modifier = Modifier,
                       paymentInfo : List<PaymentData>) {

    LazyColumn(
        modifier.fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally,

        ) {
        item {
            MyTitle(text = "Detalles de pago")
            Spacer(modifier = Modifier.height(50.dp))
        }

        item {
            ViewPaymentAmount()
            Spacer(modifier = Modifier.height(50.dp))
        }


        item {
            ViewPaymentInfo(paymentInfo)
            Spacer(modifier = Modifier.height(50.dp))
        }

    }

}

@Composable
fun ViewPaymentAmount() {
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
        Column(
            modifier = Modifier.fillMaxWidth(),
            horizontalAlignment = Alignment.Start
        ) {
            // Categoría
            Label(text = "MONTO")

            // Precio
            Box(
                modifier = Modifier.fillMaxWidth(),
                contentAlignment = Alignment.Center
            ) {
                Text(
                    "$0.00",
                    color = Black,
                    fontSize = 45.sp,
                    textAlign = TextAlign.Center,
                    lineHeight = 32.sp,
                    fontFamily = aileronFontFamily,
                    fontWeight = FontWeight.Bold,
                )
            }
        }

    }
}

@Composable
fun ViewPaymentInfo(paymentInfo : List<PaymentData>) {
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
        Column (
            modifier = Modifier.fillMaxWidth(),
            horizontalAlignment = Alignment.Start
        ){
            val spacerSize = 25.dp
           // Loop
            for (paymentData in paymentInfo) {

                Label(text = paymentData.title)

                Text(
                    text = paymentData.description,
                    fontSize = 15.sp,
                    fontFamily = dmSansFontFamily,
                    color = Color.Black,
                    modifier = Modifier.padding(
                        start = 20.dp,
                        top = 5.dp,
                        bottom = 5.dp,
                        end = 15.dp
                    )
                )
                Spacer(modifier = Modifier.height(spacerSize))
            }

            Spacer(modifier = Modifier.height(80.dp))

        }
    }
}

@Preview(showSystemUi = true)
@Composable
fun ShowViewPayment() {
    ViewPaymentScreen()
}