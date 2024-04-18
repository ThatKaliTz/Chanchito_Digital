package com.example.chanchitodigital.ui

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.sp
import com.example.chanchitodigital.ui.theme.DarkGrey
import com.example.chanchitodigital.ui.theme.dmSansFontFamily
import com.example.chanchitodigital.ui.theme.focusedTextFieldText
import com.example.chanchitodigital.ui.theme.textFieldContainer
import com.example.chanchitodigital.ui.theme.unfocusedTextFieldText

@Composable
fun MyTextInput(modifier: Modifier = Modifier,
                label: String,
                trailing: String
) {
    TextField(
        modifier = modifier,
        value = "",
        onValueChange = {},
        label = {
            Text(
                text = label,
                fontFamily = dmSansFontFamily,
                fontSize = 15.sp,
                color = DarkGrey
            )
        },
        colors = TextFieldDefaults.colors(
            unfocusedPlaceholderColor = MaterialTheme.colorScheme.unfocusedTextFieldText,
            focusedPlaceholderColor = MaterialTheme.colorScheme.focusedTextFieldText,
            unfocusedIndicatorColor = Color.Transparent, // Elimina la línea negra
            focusedIndicatorColor = Color.Transparent, // Elimina la línea negra
            unfocusedContainerColor = MaterialTheme.colorScheme.textFieldContainer,
            focusedContainerColor = MaterialTheme.colorScheme.textFieldContainer
        ),
        shape = RoundedCornerShape(50),
        trailingIcon = {
            TextButton(onClick = { /*TODO*/ }) {
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