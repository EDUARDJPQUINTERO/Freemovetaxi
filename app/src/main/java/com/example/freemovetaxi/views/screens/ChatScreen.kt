package com.example.freemovetaxi.views.screens

import androidx.compose.foundation.layout.*

import androidx.compose.material3.*

import androidx.compose.runtime.*

import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

import androidx.navigation.NavController
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.freemovetaxi.viewmodels.ChatViewModel
import com.example.freemovetaxi.views.components.TaxiButton
import androidx.compose.foundation.background

import com.example.freemovetaxi.views.theme.TaxiBackground
import androidx.compose.material3.CardDefaults

import com.example.freemovetaxi.views.theme.TaxiYellow
@Composable
fun ChatScreen(
    navController: NavController
) {
    val chatViewModel: ChatViewModel = viewModel()


    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(TaxiBackground)
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
            modifier = Modifier.fillMaxWidth(),

            colors = CardDefaults.cardColors(
                containerColor = TaxiYellow
            )
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
            modifier = Modifier.fillMaxWidth(),

            colors = CardDefaults.cardColors(
                containerColor = TaxiYellow
            )
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
            value = chatViewModel.message,
            onValueChange = {
                chatViewModel.updateMessage(it)
            },
            label = {
                Text("Escribe un mensaje")
            }
        )

        Spacer(
            modifier = Modifier.height(12.dp)
        )

        TaxiButton(
            text = "Enviar"
        ) {

            chatViewModel.sendMessage()

        }

    }

}