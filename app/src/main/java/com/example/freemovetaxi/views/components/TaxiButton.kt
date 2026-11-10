package com.example.freemovetaxi.views.components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun TaxiButton(
    text: String,
    onClick: () -> Unit
) {

    Button(
        modifier = Modifier.fillMaxWidth(),
        onClick = onClick
    ) {

        Text(text)

    }

}