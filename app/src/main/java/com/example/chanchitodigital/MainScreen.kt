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
import androidx.compose.material3.TextButton
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
import com.example.chanchitodigital.ui.theme.focusedTextFieldText
import com.example.chanchitodigital.ui.theme.textFieldContainer
import com.example.chanchitodigital.ui.theme.unfocusedTextFieldText


@Composable
fun MainScreen(navController: NavController) {
    var selectedDate by remember { mutableStateOf("") }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Selecciona una fecha:",
            modifier = Modifier.padding(bottom = 16.dp)
        )

        MyDateInput(
            label = "Fecha de nacimiento",
            trailing = "Seleccionar",
            onDateSelected = { date ->
                selectedDate = date
                // Aquí puedes realizar cualquier acción adicional con la fecha seleccionada
            }
        )

        Spacer(modifier = Modifier.height(16.dp))

        Text(
            text = "Fecha seleccionada: $selectedDate",
        )
    }
}


@Composable
fun MyDateInput(
    modifier: Modifier = Modifier,
    label: String,
    trailing: String,
    onDateSelected: (String) -> Unit // Callback para manejar la fecha seleccionada
) {
    var selectedDate by remember { mutableStateOf("") }
    val context = LocalContext.current

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

        TextField(
            modifier = modifier,
            value = selectedDate,
            onValueChange = { selectedDate = it },
            placeholder = {
                Text(
                    text = label,
                    fontFamily = dmSansFontFamily,
                    fontSize = 15.sp,
                    color = DarkGrey.copy(alpha = 0.5f)
                )
            },
            colors = TextFieldDefaults.colors(
                unfocusedPlaceholderColor = MaterialTheme.colorScheme.unfocusedTextFieldText,
                focusedPlaceholderColor = MaterialTheme.colorScheme.focusedTextFieldText,
                unfocusedIndicatorColor = Color.Transparent,
                focusedIndicatorColor = Color.Transparent,
                unfocusedContainerColor = MaterialTheme.colorScheme.textFieldContainer,
                focusedContainerColor = MaterialTheme.colorScheme.textFieldContainer
            ),
            shape = RoundedCornerShape(50),
            trailingIcon = {
                TextButton(onClick = {
                    val calendar = Calendar.getInstance()
                    val year = calendar.get(Calendar.YEAR)
                    val month = calendar.get(Calendar.MONTH)
                    val day = calendar.get(Calendar.DAY_OF_MONTH)

                    val datePickerDialog = DatePickerDialog(
                        context,
                        { _, year, month, dayOfMonth ->
                            val date = "$dayOfMonth/$month/$year"
                            selectedDate = date
                            onDateSelected(date)
                        },
                        year, month, day
                    )
                    datePickerDialog.show()
                }) {
                    Text(
                        text = trailing,
                        fontFamily = dmSansFontFamily,
                        fontSize = 15.sp,
                        color = DarkGrey
                    )
                }
            }
        )
    }
}

@Composable
fun MyDatePicker(
    onDateSelected: (String) -> Unit, // Callback para manejar la fecha seleccionada
    showDialog: Boolean // Parámetro booleano para determinar si mostrar el diálogo
): String { // Devuelve la fecha seleccionada como String

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

    if (showDialog) {
        datePickerDialog.show()
    }

    return date.value
}

