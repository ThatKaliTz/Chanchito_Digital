package com.example.chanchitodigital

import android.content.res.Configuration
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.chanchitodigital.ui.theme.Black
import com.example.chanchitodigital.ui.theme.ElectricViolet
import com.example.chanchitodigital.ui.theme.HanPurple
import com.example.chanchitodigital.ui.theme.Indigo
import com.example.chanchitodigital.ui.theme.LightGrey
import com.example.chanchitodigital.ui.theme.Orchid
import com.example.chanchitodigital.ui.theme.VividViolet
import com.example.chanchitodigital.ui.theme.White

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
        Content()
    }
}

@Composable
fun Background(gradientColors: List<Color>) {
    Box(
        modifier = Modifier.fillMaxSize(),
    ) {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(
                    brush = GradientBackgroundBrush(
                        isVerticalGradient = false,
                        colors = gradientColors
                    ),
                )
        )
    }
}

@Composable
fun Content(modifier: Modifier = Modifier) {
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
                shape = RoundedCornerShape(topEndPercent = 30)
            ) {
                // Contenido
                Column(
                    modifier = Modifier
                        .padding(top = 60.dp,start = 30.dp, end = 30.dp),
                    verticalArrangement = Arrangement.Top,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    TitleAndInfo(Modifier)
                    Spacer(modifier = Modifier.height(125.dp))
                    Buttons()
                }
            }
        }
    }
}

// Screen Resources


@Composable
fun TitleAndInfo(modifier: Modifier) {
    // Titulo
    Text(
        "Bienvenido a Chanchito Digital",
        color = Black,
        fontSize = 30.sp,
        textAlign = TextAlign.Center,
        modifier = modifier
            .padding(start = 40.dp, end = 40.dp)
        )
    Spacer(modifier = Modifier.height(15.dp))
    // Instrucciones
    Text(
        "Seleccione una opción para comenzar.",
        color = LightGrey,
        fontSize = 13.sp,
    )
}

@Composable
fun Buttons() {
    Text(
        "Boton 1",
        color = LightGrey,
        fontSize = 15.sp,
    )
    Spacer(modifier = Modifier.height(30.dp))
    Text(
        "Boton 2",
        color = LightGrey,
        fontSize = 15.sp,
    )
}

// General Resources

@Composable
fun GradientBackgroundBrush(
    isVerticalGradient: Boolean,
    colors: List<Color> ): Brush {
    val endOffset = if (isVerticalGradient) {
        Offset(0.0f, Float.POSITIVE_INFINITY)
    } else {
        Offset(Float.POSITIVE_INFINITY, 0.0f)
    }

    return Brush.linearGradient(
        colors = colors,
        start = Offset.Zero,
        end = endOffset
    )
}


@Preview(showBackground = true)
@Composable
fun ContentPreview() {
    LoginScreen()
}