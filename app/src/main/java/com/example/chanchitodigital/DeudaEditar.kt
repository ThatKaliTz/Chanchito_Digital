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
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.chanchitodigital.ui.MyButton
import com.example.chanchitodigital.ui.MyTitle
import com.example.chanchitodigital.ui.MyTitle2
import com.example.chanchitodigital.ui.MyTitle3
import com.example.chanchitodigital.ui.theme.LightGrey


@Composable
fun DeudaEditar() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(LightGrey)
    ) {
        DeudaEditarContent()
    }
}

@Composable
fun DeudaEditarContent(modifier: Modifier = Modifier) {
    LazyColumn(
        modifier.fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally,

        ) {
        item {
            MyTitle(text = "Deuda de: Cooppel")
            Spacer(modifier = Modifier.height(50.dp))
        }

        item {
            DeudaEditarAmount()
            Spacer(modifier = Modifier.height(50.dp))

        }

        item {
            DeudaEditarInput()
            Spacer(modifier = Modifier.height(50.dp))

        }

    }

}

@Composable
fun DeudaEditarAmount() {
    Box(
        modifier = Modifier
            .shadow(
                elevation = 10.dp
            )
            .background(Color.White)
            .width(340.dp)
            .padding(
                top = 40.dp, bottom = 50.dp,
                start = 20.dp, end = 200.dp
            )
        ,
        contentAlignment = Alignment.Center
    ) {


        MyTitle3(text = "Coppel")
        Spacer(modifier = Modifier.height(50.dp))


        MyTitle2(text = "$4848,88")

    }
}

@Composable
fun DeudaEditarInput() {
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
            horizontalAlignment = Alignment.CenterHorizontally
        ){
            var description by remember { mutableStateOf("") }
            var selectedDate by remember { mutableStateOf("") }
            val spacerSize = 25.dp
            val itemOptions = arrayOf(
                "Categoria 1", "Categoria 2", "Categoria 3", "Categoria 4", "Categoria 5")

            MyDateInput(
                label = "Cantidad",
                trailing = "",
                modifier = Modifier.fillMaxWidth(),
                onDateSelected = { date ->
                    selectedDate = date
                    // Aquí puedes realizar cualquier acción adicional con la fecha seleccionada
                }
            )

            Spacer(modifier = Modifier.height(spacerSize))




            MyDateInput(
                label = "Ingrese",
                trailing = "",
                modifier = Modifier.fillMaxWidth(),
                onDateSelected = { date ->
                    selectedDate = date
                    // Aquí puedes realizar cualquier acción adicional con la fecha seleccionada
                }
            )

            Spacer(modifier = Modifier.height(50.dp))

            MyButton(
                text = "Editar deuda",
                modifier = Modifier
                    .height(55.dp)
                    .fillMaxWidth()
            )

        }
    }
}

@Preview(showSystemUi = true)
@Composable
fun ShowDeudaEditar() {
    DeudaEditar()
}