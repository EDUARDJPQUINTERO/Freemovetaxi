package com.example.freemovetaxi.views.screens

import androidx.compose.foundation.layout.*

import androidx.compose.material3.*

import androidx.compose.runtime.Composable

import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

import androidx.navigation.NavController

@Composable
fun ProfileScreen(
    navController: NavController
) {

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {

        Text(
            text = "Perfil del Conductor",
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
                    text = "Nombre: Carlos Rodríguez"
                )

                Text(
                    text = "Calificación: 4.9 ★"
                )

                Text(
                    text = "Licencia: Vigente"
                )

                Text(
                    text = "Permisos: Al día"
                )

                Text(
                    text = "Vehículo: Hyundai Grand i10"
                )

                Text(
                    text = "Placa: ABC-123"
                )

            }

        }

        Spacer(
            modifier = Modifier.height(20.dp)
        )

        Text(
            text = "Historial de viajes"
        )

        Spacer(
            modifier = Modifier.height(10.dp)
        )

        Card(
            modifier = Modifier.fillMaxWidth()
        ) {

            Column(
                modifier = Modifier.padding(16.dp)
            ) {

                Text("Centro → Chapinero")

                Text("$14.000")

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

                Text("Centro → Aeropuerto")

                Text("$25.000")

            }

        }

    }

}