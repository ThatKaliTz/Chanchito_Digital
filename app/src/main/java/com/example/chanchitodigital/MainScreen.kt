package com.example.chanchitodigital

import androidx.navigation.NavController
import android.app.DatePickerDialog
import android.content.Context
import android.os.Bundle
import android.widget.DatePicker
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.chanchitodigital.ui.theme.DarkGrey
import com.example.chanchitodigital.ui.theme.dmSansFontFamily
import java.util.*
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.ui.unit.sp


@Composable
fun MainScreen(navController: NavController) {
    val context = LocalContext.current

    // Llamada a MyTextInput
    MyDateInput(
        modifier = Modifier.fillMaxWidth(),
        label = "Fecha de nacimiento",
        trailing = "Seleccionar fecha",
        onDateSelected = { selectedDate ->
            // Manejo de la fecha seleccionada aquí
            Toast.makeText(context, "Fecha seleccionada: $selectedDate", Toast.LENGTH_SHORT).show()
        }
    )
}


@Composable
fun MyDateInput(
    modifier: Modifier = Modifier,
    label: String,
    trailing: String,
    onDateSelected: (String) -> Unit // Callback para manejar la fecha seleccionada
) {
    var date by remember { mutableStateOf("") }

    Column(
        verticalArrangement = Arrangement.Top,
        modifier = modifier
    ) {
        Text(
            text = label,
            fontFamily = dmSansFontFamily,
            fontSize = 15.sp,
            color = DarkGrey,
            modifier = Modifier.padding(start = 10.dp, bottom = 5.dp)
        )

        Row(verticalAlignment = Alignment.CenterVertically) {
            TextField(
                modifier = Modifier.weight(1f),
                value = date,
                onValueChange = { date = it },
                placeholder = {
                    Text(
                        text = label,
                        fontFamily = dmSansFontFamily,
                        fontSize = 15.sp,
                        color = DarkGrey.copy(alpha = 0.5f)
                    )
                },
                colors = TextFieldDefaults.colors(
                    unfocusedPlaceholderColor = MaterialTheme.colorScheme.onSurface.copy(alpha = 0.5f),
                    focusedPlaceholderColor = MaterialTheme.colorScheme.onSurface.copy(alpha = 0.5f),
                    unfocusedIndicatorColor = Color.Transparent,
                    focusedIndicatorColor = Color.Transparent,
                    unfocusedLabelColor = MaterialTheme.colorScheme.onSurface.copy(alpha = 0.5f),
                    focusedLabelColor = MaterialTheme.colorScheme.onSurface.copy(alpha = 0.5f),
                    cursorColor = MaterialTheme.colorScheme.onSurface,
                    focusedTextColor = Color.Black
                ),
                shape = RoundedCornerShape(50)
            )

            Spacer(modifier = Modifier.width(8.dp))

            Button(
                onClick = { /* Open DatePicker */ },
                modifier = Modifier.size(120.dp, 48.dp)
            ) {
                Text(text = "Open Date Picker")
            }
        }
    }

    MyDatePicker(
        onDateSelected = {
            date = it
            onDateSelected(it)
        }
    )
}

@Composable
fun MyDatePicker(
    onDateSelected: (String) -> Unit // Callback para manejar la fecha seleccionada
) {
    val context = LocalContext.current

    val year: Int
    val month: Int
    val day: Int

    val calendar = Calendar.getInstance()
    year = calendar.get(Calendar.YEAR)
    month = calendar.get(Calendar.MONTH)
    day = calendar.get(Calendar.DAY_OF_MONTH)
    calendar.time = Date()

    val date = remember { mutableStateOf("") }
    val datePickerDialog = DatePickerDialog(
        context,
        { _: DatePicker, year: Int, month: Int, dayOfMonth: Int ->
            date.value = "$dayOfMonth/$month/$year"
            onDateSelected(date.value) // Llama al callback cuando se selecciona una fecha
        }, year, month, day
    )

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "Selected Date: ${date.value}")
        Spacer(modifier = Modifier.size(16.dp))
        Button(onClick = {
            datePickerDialog.show()
        }) {
            Text(text = "Open Date Picker")
        }
    }
}


