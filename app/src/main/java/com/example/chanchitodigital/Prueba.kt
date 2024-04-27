package com.example.chanchitodigital

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.chanchitodigital.ui.MyTitle2
import com.example.chanchitodigital.ui.MyTitle3
import com.example.chanchitodigital.ui.MyTitle4
import com.example.chanchitodigital.ui.MyTitleColor


@Composable
fun MainContent(modifier: Modifier = Modifier) {
    LazyColumn(
        modifier.fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally,

        ) {
        item {
            MyTitleColor(text = "")
            Image(
                painterResource(R.drawable.logo),
                contentDescription = "Logo",
                Modifier
                    .clip(RoundedCornerShape(10))

                    .padding(15.dp)
                    .size(70.dp)
            )
        }

        item {
            MainTolal()
            Spacer(modifier = Modifier.height(50.dp))

        }

        item {
            MainChart()
            Spacer(modifier = Modifier.height(30.dp))

        }

    }

}
@Composable
fun MainTolal() {
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


        MyTitle3(text = "Dinero Total")
        Spacer(modifier = Modifier.height(25.dp))


        MyTitle2(text = "$4848,88")

    }
}


@Composable
fun MainChart() {
    MyTitle4(text = "Estadisticas de ingreso"

    )

    Box(
        modifier = Modifier
            .shadow(
                elevation = 10.dp
            )
            .background(Color.White)
            .width(340.dp)
            .height(300.dp)
            .padding(
                top = 40.dp, bottom = 30.dp,
                start = 20.dp, end = 20.dp
            )
        ,
        contentAlignment = Alignment.Center


    ) {
        Column (
            modifier = Modifier.fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally
        ){


        }
    }
}

@Preview(showSystemUi = true)
@Composable
fun showPantalla(){

    MainContent()


}


