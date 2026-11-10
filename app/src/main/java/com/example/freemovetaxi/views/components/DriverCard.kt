package com.example.freemovetaxi.views.components

import androidx.compose.foundation.layout.*
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

    Card(
        modifier = Modifier.fillMaxWidth()
    ) {

        Column(
            modifier = Modifier.padding(16.dp)
        ) {

            Text("Conductor disponible")

            Spacer(
                modifier = Modifier.height(6.dp)
            )

            Text(name)

            Text("★ $rating")

            Text(licenseStatus)

        }

    }

}