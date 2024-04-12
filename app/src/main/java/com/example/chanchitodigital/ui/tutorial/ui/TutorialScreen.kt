package com.example.chanchitodigital.ui.tutorial.ui

import android.content.res.Configuration
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.chanchitodigital.R
import com.example.chanchitodigital.ui.theme.ChanchitoDigitalTheme

// Funcion principal - pantalla
@Preview(uiMode = Configuration.UI_MODE_NIGHT_NO, showSystemUi = true) // Theme Mode
@Composable
fun TutorialScreen() {
    MyList(dataList)

}

// Objeto con la info que necesito
data class MyData(val title: String, val description: String)
private val dataList : List<MyData> = listOf(
    MyData("Chanchito 1", "Digital"),
    MyData("Chanchito 2", "Digital"),
    MyData("Chanchito 3", "Digital"),
    MyData("Chanchito 4", "Digital"),
    MyData("Chanchito 5", "Digital"),
    MyData("Chanchito 6", "Digital"),
    MyData("Chanchito 7", "Digital"),
    MyData("Chanchito 8", "Digital"),
    MyData("Chanchito 9", "Digital"),
    MyData("Chanchito 10", "Digital"),
    MyData("Chanchito 11", "Digital")
)

// Componente individual - un elemento
@Composable
fun MyComponent(singleData: MyData) {
    Row (modifier = Modifier.padding(16.dp)) {
        MyImage()
        ItemInfo(singleData)
    }
}

// Mi lista de elementos
@Composable
fun MyList(data: List<MyData>) {
    LazyColumn {
        items(data) {singleData ->
            MyComponent(singleData)
        }
    }
}

@Composable
fun ItemInfo(data: MyData) {
    /*
          * Start = left
          * Top
          * Bottom
          * End = Right
          *  */
    Column (modifier = Modifier.padding(start = 12.dp)) {
        MyText(
            data.title,
            MaterialTheme.colorScheme.primary,
            MaterialTheme.typography.bodyLarge
        )
        Spacer(modifier = Modifier.height(6.dp))
        MyText(
            data.description,
            MaterialTheme.colorScheme.onBackground,
            MaterialTheme.typography.bodySmall
        )
    }
}

@Composable
fun MyText(text: String, color: Color, style: TextStyle) {
    // val gradientColors = listOf(Color.Cyan, Color.Blue, Color.Magenta /*...*/)
    Text(text, color = color , style = style
        /*  fontWeight = FontWeight.Black,
        style = TextStyle(
             brush = Brush.linearGradient(
                 colors = gradientColors
             )
         )*/
    )
}

@Composable
fun MyImage() {
    Image(
        painterResource(R.drawable.ic_launcher_foreground), "Imagen",
        modifier = Modifier
            .clip(CircleShape)
            .background(MaterialTheme.colorScheme.primary)
            .size(52.dp)
    )
}

