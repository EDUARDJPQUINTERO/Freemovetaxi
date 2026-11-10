package com.example.freemovetaxi.views.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*

import androidx.compose.material3.Card
import androidx.compose.material3.Text

import androidx.compose.runtime.Composable

import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun FakeMapCard() {

    Card(
        modifier = Modifier
            .fillMaxWidth()
            .height(250.dp)
    ) {

        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(Color(0xFFFFF8E1)),
            contentAlignment = Alignment.Center
        ) {

            Column(
                horizontalAlignment = Alignment.CenterHorizontally
            ) {

                Text(
                    text = "📍 Punto de recogida"
                )

                Spacer(
                    modifier = Modifier.height(16.dp)
                )

                Text(
                    text = "🚕 Taxi cercano"
                )

                Spacer(
                    modifier = Modifier.height(16.dp)
                )

                Text(
                    text = "Ruta estimada"
                )

            }

        }

    }

}