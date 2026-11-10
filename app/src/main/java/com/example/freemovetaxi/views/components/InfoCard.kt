package com.example.freemovetaxi.views.components

import androidx.compose.foundation.layout.*
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text

import androidx.compose.runtime.Composable

import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

import com.example.freemovetaxi.views.theme.TaxiYellow

@Composable
fun InfoCard(
    title: String,
    content: String
) {

    Card(
        modifier = Modifier.fillMaxWidth(),

        colors = CardDefaults.cardColors(
            containerColor = TaxiYellow
        )
    ) {

        Column(
            modifier = Modifier.padding(16.dp)
        ) {

            Text(title)

            Spacer(
                modifier = Modifier.height(6.dp)
            )

            Text(content)

        }

    }

}