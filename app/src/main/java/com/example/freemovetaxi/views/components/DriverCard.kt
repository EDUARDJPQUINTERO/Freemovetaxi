package com.example.freemovetaxi.views.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun DriverCard(
    name: String,
    rating: Double,
    licenseStatus: String
) {

    Card {

        Column(
            modifier = Modifier.padding(16.dp)
        ) {

            Text("Conductor: $name")

            Text("Calificación: $rating ★")

            Text("Estado: $licenseStatus")

        }

    }

}