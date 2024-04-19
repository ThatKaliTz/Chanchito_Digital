import android.app.DatePickerDialog
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.chanchitodigital.ui.theme.DarkGrey
import com.example.chanchitodigital.ui.theme.dmSansFontFamily
import com.example.chanchitodigital.ui.theme.focusedTextFieldText
import com.example.chanchitodigital.ui.theme.textFieldContainer
import com.example.chanchitodigital.ui.theme.unfocusedTextFieldText
import java.util.Calendar

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
            enabled = false,
            value = selectedDate,
            onValueChange = {
                if (it.length <= 10) { // Limitar la longitud a 10 caracteres (dd/mm/yyyy)
                    selectedDate = it
                    onDateSelected(it)
                }
            },
            keyboardOptions = KeyboardOptions.Default.copy(keyboardType = KeyboardType.Number),
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
                focusedContainerColor = MaterialTheme.colorScheme.textFieldContainer,
                disabledTextColor = Color.Black,
                disabledIndicatorColor = Color.Transparent,
                disabledContainerColor = MaterialTheme.colorScheme.textFieldContainer

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
                            val date = String.format("%02d/%02d/%d", dayOfMonth, month + 1, year)
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
