package com.example.chanchitodigital.ui.theme

import androidx.compose.material3.ColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

val Purple80 = Color(0xFFD0BCFF)
val PurpleGrey80 = Color(0xFFCCC2DC)
val Pink80 = Color(0xFFEFB8C8)
val White = Color.White
val LightGrey = Color(0xFFD4D4D4)
val Grey = Color(0xFF8F8E8E)
val DarkGrey = Color(0xFF4D4C4C)

// Gradient
val HanPurple = Color(0xFF5E17EB)
val Indigo = Color(0xFF7612EF)
val Purple = Color(0xFF5E17EB)
val ElectricViolet = Color(0xFF870EF2)
val VividViolet = Color(0xFF9b0af6)
val Orchid = Color(0xFFCC00FF)

val Purple40 = Color(0xFF6650a4)
val PurpleGrey40 = Color(0xFF625b71)
val Pink40 = Color(0xFF7D5260)
val Black = Color.Black

// TextField
val ColorScheme.textFieldContainer
@Composable
get()  = LightGrey

val ColorScheme.unfocusedTextFieldText
@Composable
get() = Indigo

val ColorScheme.focusedTextFieldText
@Composable
get() = Indigo