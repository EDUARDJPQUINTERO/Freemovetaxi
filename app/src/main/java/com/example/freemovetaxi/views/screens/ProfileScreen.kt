package com.example.freemovetaxi.views.screens

import androidx.compose.foundation.layout.*

import androidx.compose.material3.*

import androidx.compose.runtime.Composable

import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

import androidx.navigation.NavController
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.freemovetaxi.viewmodels.ProfileViewModel
@Composable
fun ProfileScreen(
    navController: NavController
) {
    val profileViewModel: ProfileViewModel = viewModel()
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
                    text = "Nombre: ${profileViewModel.driverName}"
                )

                Text(
                    text = "Calificación: ${profileViewModel.rating} ★"
                )

                Text(
                    text = "Licencia: ${profileViewModel.licenseStatus}"
                )

                Text(
                    text = "Permisos: ${profileViewModel.permissions}"
                )

                Text(
                    text = "Vehículo: ${profileViewModel.vehicle}"
                )

                Text(
                    text = "Placa: ${profileViewModel.plate}"
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