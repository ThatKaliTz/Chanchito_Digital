package com.example.chanchitodigital

import android.content.res.Configuration
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.chanchitodigital.ui.theme.Black
import com.example.chanchitodigital.ui.theme.ElectricViolet
import com.example.chanchitodigital.ui.theme.HanPurple
import com.example.chanchitodigital.ui.theme.Indigo
import com.example.chanchitodigital.ui.theme.LightGrey
import com.example.chanchitodigital.ui.theme.Orchid
import com.example.chanchitodigital.ui.theme.VividViolet

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
    Card(
        modifier = modifier
            .fillMaxSize()
            .padding(top = 300.dp),
        shape = RoundedCornerShape(topEndPercent = 30)
    ) {
        // Contenido
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(10.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            TitleAndInfo()
        }

    }
}

@Composable
fun TitleAndInfo() {
    // Titulo
    MyText(
        "Bienvenido a Chanchito Digital",
        Black,
        MaterialTheme.typography.titleLarge)
    // Instrucciones
    MyText(
        "Seleccione una opción para comenzar.",
        LightGrey,
        MaterialTheme.typography.bodySmall)
}
@Composable
fun MyText(text: String, color: Color, style: TextStyle) {
    Text(text, color = color , style = style)
}

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