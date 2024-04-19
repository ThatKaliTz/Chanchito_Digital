package com.example.chanchitodigital

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.chanchitodigital.ui.theme.Black
import com.example.chanchitodigital.ui.theme.ElectricViolet
import com.example.chanchitodigital.ui.theme.Grey
import com.example.chanchitodigital.ui.theme.HanPurple
import com.example.chanchitodigital.ui.theme.Indigo
import com.example.chanchitodigital.ui.theme.VividViolet
import com.example.chanchitodigital.ui.theme.White
import com.example.chanchitodigital.ui.theme.aileronFontFamily
import com.example.chanchitodigital.ui.theme.dmSansFontFamily
import com.example.chanchitodigital.ui.MyTextInput
import com.example.chanchitodigital.ui.Background
import com.example.chanchitodigital.ui.MyButton

@Composable
fun LoginScreen() {
    val gradientColors = listOf(
        HanPurple,
        Indigo,
        ElectricViolet,
        VividViolet
    )

    Box(
        modifier = Modifier.fillMaxSize()
    ) {
        // Fondo de la pantalla
        Background(gradientColors = gradientColors)
        // Contenido de la pantalla
        LoginContent()
    }
}


@Composable
fun LoginContent(modifier: Modifier = Modifier) {
    Box(
        contentAlignment = Alignment.Center,
        modifier = Modifier.fillMaxSize()
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Spacer(modifier = Modifier.height(100.dp))

            Image(
                painterResource(R.drawable.logo),
                contentDescription = "Logo",
                Modifier
                    .clip(RoundedCornerShape(10))
                    .background(White)
                    .padding(15.dp)
                    .size(100.dp)
            )

            Spacer(modifier = Modifier.height(80.dp))

            Card(
                modifier = modifier
                    .fillMaxSize(),
                shape = RoundedCornerShape(topEndPercent = 30),
                colors = CardDefaults.cardColors(
                    containerColor = Color.White, //Card background color
                    contentColor = Color.Black  //Card content color,e.g.text
                )
            ) {
                // Contenido
                Column(
                    modifier = Modifier
                        .padding(top = 60.dp,start = 30.dp, end = 30.dp),
                    verticalArrangement = Arrangement.Top,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    LoginTitle(Modifier)
                    Spacer(modifier = Modifier.height(45.dp))
                    LoginInputs()
                    Spacer(modifier = Modifier.height(35.dp))
                    LoginButtons()
                }
            }
        }
    }
}

// Screen Resources


@Composable
fun LoginTitle(modifier: Modifier) {
    // Titulo
    Text(
        "Iniciar sesión",
        color = Black,
        fontSize = 34.sp,
        textAlign = TextAlign.Center,
        lineHeight = 32.sp,
        fontFamily = aileronFontFamily,
        fontWeight = FontWeight.Bold,
        modifier = modifier
            .padding(start = 60.dp, end = 60.dp)
    )
    Spacer(modifier = Modifier.height(1.dp))
    // Instrucciones
    Text(
        "Ingresa a tu cuenta para continuar.",
        color = Grey,
        fontSize = 13.sp,
        fontFamily = dmSansFontFamily,
        fontWeight = FontWeight.Normal,
        modifier = modifier
            .padding(top = 12.dp)
    )
}

@Composable
fun LoginButtons() {
    MyButton(
        text = "Iniciar sesión",
        modifier = Modifier
            .height(55.dp)
            .fillMaxWidth()
    )
}

@Composable
fun LoginInputs() {
    var email by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }


    MyTextInput(
        label = "EMAIL",
        trailing = "",
        text = email, // Aquí pasamos el valor de username al componente MyTextInput
        modifier = Modifier.fillMaxWidth(),
        onTextChanged = { newText ->
            email = newText
        }
    )

    Spacer(modifier = Modifier.height(15.dp))

    MyTextInput(
        label = "CONTRASEÑA",
        trailing = "",
        text = password, // Aquí pasamos el valor de username al componente MyTextInput
        modifier = Modifier.fillMaxWidth(),
        onTextChanged = { newText ->
            password = newText
        }
    )

}

// General Resources


@Preview(showBackground = true)
@Composable
fun LoginContentPreview() {
    LoginScreen()
}