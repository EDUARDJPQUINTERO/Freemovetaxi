package com.example.freemovetaxi.views.components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

import com.example.freemovetaxi.views.theme.TaxiBlack
import com.example.freemovetaxi.views.theme.TaxiYellow

@Composable
fun TaxiButton(
    text: String,
    onClick: () -> Unit
) {

    Button(
        modifier = Modifier.fillMaxWidth(),

        colors = ButtonDefaults.buttonColors(
            containerColor = TaxiYellow,
            contentColor = TaxiBlack
        ),

        onClick = onClick
    ) {
        Text(text)
    }

}