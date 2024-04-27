package com.example.chanchitodigital

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.chanchitodigital.ui.MyButton
import com.example.chanchitodigital.ui.MyTitle2
import com.example.chanchitodigital.ui.MyTitle3
import com.example.chanchitodigital.ui.MyTitleColor

@Composable
fun Deudas(modifier: Modifier = Modifier) {
    LazyColumn(
        modifier.fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally,

        ) {
        item {
            MyTitleColor(text = "Deudas")
            Spacer(modifier = Modifier.height(50.dp))
        }

        item {
            DeudasBotones()
            Spacer(modifier = Modifier.height(50.dp))

        }

        item {
            DeudasHistorial()
            Spacer(modifier = Modifier.height(30.dp))

        }

    }

}
@Composable
fun DeudasBotones() {
    Box(
        modifier = Modifier
            .shadow(
                elevation = 10.dp
            )
            .background(Color.White)
            .width(340.dp)
            .padding(
                top = 0.dp, bottom = 10.dp,
                start = 20.dp, end = 20.dp
            )
        ,
        contentAlignment = Alignment.TopCenter,

    ) {
        Botones()


    }
}

@Composable
fun Botones(){
    MyButton(
        text = "Añadir deuda",
        modifier = Modifier
            .padding(top = 10.dp)
            .width(200.dp)

            .height(55.dp)
            .fillMaxWidth()
    )

    MyButton(
        text = "Eliminar deuda",
        modifier = Modifier
            .padding(top = 90.dp)
            .width(200.dp)

            .height(55.dp)
            .fillMaxWidth()
    )

}
@Composable
fun DeudasHistorial() {
    Box(
        modifier = Modifier

            .shadow(
                elevation = 10.dp
            )
            .background(Color.White)
            .width(340.dp)
            .padding(
                top = 20.dp, bottom = 0.dp,
                start = 0.dp, end = 150.dp
            )
        ,
        contentAlignment = Alignment.Center
    ) {


        MyTitle3(text = "Coppel")
        Spacer(modifier = Modifier.height(25.dp))


        MyTitle2(text = "$4,848.88")

    }
    Spacer(modifier = Modifier.height(25.dp))

    Box(
        modifier = Modifier

            .shadow(
                elevation = 10.dp
            )
            .background(Color.White)
            .width(340.dp)
            .padding(
                top = 20.dp, bottom = 0.dp,
                start = 0.dp, end = 150.dp
            )
        ,
        contentAlignment = Alignment.Center
    ) {


        MyTitle3(text = "Elizondo")
        Spacer(modifier = Modifier.height(25.dp))


        MyTitle2(text = "$742.22")

    }

    Spacer(modifier = Modifier.height(25.dp))

    Box(
        modifier = Modifier

            .shadow(
                elevation = 10.dp
            )
            .background(Color.White)
            .width(340.dp)
            .padding(
                top = 20.dp, bottom = 0.dp,
                start = 0.dp, end = 150.dp
            )
        ,
        contentAlignment = Alignment.Center
    ) {


        MyTitle3(text = "Famsa")
        Spacer(modifier = Modifier.height(25.dp))


        MyTitle2(text = "$1,234.01")

    }
}

@Preview(showSystemUi = true)
@Composable
fun DeudasShow(){

    Deudas()


}