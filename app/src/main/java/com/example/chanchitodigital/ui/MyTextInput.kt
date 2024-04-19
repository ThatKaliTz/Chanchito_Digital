package com.example.chanchitodigital.ui

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
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.chanchitodigital.ui.theme.DarkGrey
import com.example.chanchitodigital.ui.theme.dmSansFontFamily
import com.example.chanchitodigital.ui.theme.focusedTextFieldText
import com.example.chanchitodigital.ui.theme.textFieldContainer
import com.example.chanchitodigital.ui.theme.unfocusedTextFieldText

@Composable
fun MyTextInput(
    modifier: Modifier = Modifier,
    label: String,
    trailing: String,
    text: String,
    onTextChanged: (String) -> Unit
) {
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
            value = text,
            onValueChange = onTextChanged,
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
                if (trailing.isNotEmpty()) {
                    TextButton(onClick = { /* TODO */ }) {
                        Text(
                            text = trailing,
                            fontFamily = dmSansFontFamily,
                            fontSize = 15.sp,
                            color = DarkGrey
                        )
                    }
                }
            }
        )
    }
}

@Composable
fun MyNumberInput(
    modifier: Modifier = Modifier,
    label: String,
    trailing: String,
    text: String,
    onTextChanged: (String) -> Unit
) {
    Column(
        verticalArrangement = Arrangement.Top,
        modifier = modifier
    ) {
        Text(
            text = label,
            fontSize = 15.sp,
            color = Color.DarkGray,
            modifier = Modifier.padding(start = 10.dp, bottom = 5.dp)
        )

        TextField(
            modifier = modifier,
            value = text,
            onValueChange = onTextChanged,
            placeholder = {
                Text(
                    text = label,
                    fontSize = 15.sp,
                    color = Color.DarkGray.copy(alpha = 0.5f)
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
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
            singleLine = true,
            trailingIcon = {
                if (trailing.isNotEmpty()) {
                    TextButton(onClick = { /* TODO */ }) {
                        Text(
                            text = trailing,
                            fontSize = 15.sp,
                            color = Color.DarkGray
                        )
                    }
                }
            }
        )
    }
}

@Composable
fun MyDescriptionInput(
    modifier: Modifier = Modifier,
    label: String,
    trailing: String,
    text: String,
    onTextChanged: (String) -> Unit
) {
    Column(
        verticalArrangement = Arrangement.Top,
        modifier = modifier
    ) {
        Text(
            text = label,
            fontSize = 15.sp,
            color = Color.DarkGray,
            modifier = Modifier.padding(start = 10.dp, bottom = 5.dp)
        )

        TextField(
            modifier = modifier,
            value = text,
            onValueChange = onTextChanged,
            placeholder = {
                Text(
                    text = label,
                    fontSize = 15.sp,
                    color = Color.DarkGray.copy(alpha = 0.5f)
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
            shape = MaterialTheme.shapes.large,
            keyboardOptions = KeyboardOptions.Default.copy(keyboardType = KeyboardType.Text, imeAction = ImeAction.Done),
            maxLines = 5,
            singleLine = false,
            trailingIcon = {
                if (trailing.isNotEmpty()) {
                    TextButton(onClick = { /* TODO */ }) {
                        Text(
                            text = trailing,
                            fontSize = 15.sp,
                            color = Color.DarkGray
                        )
                    }
                }
            }
        )
    }
}