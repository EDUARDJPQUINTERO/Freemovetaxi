package com.example.freemovetaxi.views.screens

import androidx.compose.foundation.layout.*

import androidx.compose.material3.*

import androidx.compose.runtime.*

import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

import androidx.navigation.NavController

@Composable
fun ChatScreen(
    navController: NavController
) {

    var message by remember {
        mutableStateOf("")
    }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {

        Text(
            text = "Chat con el conductor",
            style = MaterialTheme.typography.headlineSmall
        )

        Spacer(
            modifier = Modifier.height(20.dp)
        )

        Card(
            modifier = Modifier.fillMaxWidth()
        ) {

            Column(
                modifier = Modifier.padding(16.dp)
            ) {

                Text(
                    text = "Conductor:"
                )

                Text(
                    text = "Hola, voy en camino."
                )

            }

        }

        Spacer(
            modifier = Modifier.height(10.dp)
        )

        Card(
            modifier = Modifier.fillMaxWidth()
        ) {

            Column(
                modifier = Modifier.padding(16.dp)
            ) {

                Text(
                    text = "Pasajero:"
                )

                Text(
                    text = "Perfecto, aquí te espero."
                )

            }

        }

        Spacer(
            modifier = Modifier.weight(1f)
        )

        OutlinedTextField(
            modifier = Modifier.fillMaxWidth(),
            value = message,
            onValueChange = {
                message = it
            },
            label = {
                Text("Escribe un mensaje")
            }
        )

        Spacer(
            modifier = Modifier.height(12.dp)
        )

        Button(
            modifier = Modifier.fillMaxWidth(),
            onClick = {
                message = ""
            }
        ) {

            Text("Enviar")

        }

    }

}