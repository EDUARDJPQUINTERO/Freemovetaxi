package com.example.freemovetaxi.views.screens

import androidx.compose.foundation.layout.*

import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.Text

import androidx.compose.runtime.Composable

import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

import androidx.navigation.NavController

import com.example.freemovetaxi.navigation.Routes
import com.example.freemovetaxi.views.components.DriverCard
import com.example.freemovetaxi.views.components.InfoCard
import com.example.freemovetaxi.views.components.TaxiButton
import com.example.freemovetaxi.views.components.TaxiTopBar
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.freemovetaxi.viewmodels.HomeViewModel
@Composable
fun HomeScreen(
    navController: NavController
) {
    val homeViewModel: HomeViewModel = viewModel()
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {

        TaxiTopBar(
            title = "Freemovetaxi"
        )

        Spacer(
            modifier = Modifier.height(16.dp)
        )

        DriverCard(
            name = homeViewModel.driverName,
            rating = homeViewModel.driverRating,
            licenseStatus = "Permisos al día"
        )

        Spacer(
            modifier = Modifier.height(16.dp)
        )

        Card(
            modifier = Modifier.fillMaxWidth()
        ) {

            Column(
                modifier = Modifier.padding(16.dp)
            ) {

                Text(
                    text = "Conductor Disponible"
                )

                Text(
                    text = "Carlos Rodríguez"
                )

                Text(
                    text = "Calificación: 4.9 ★"
                )

                Text(
                    text = "Permisos al día"
                )

            }

        }

        Spacer(
            modifier = Modifier.height(16.dp)
        )

        InfoCard(
            title = "Tarifa estimada",
            content = homeViewModel.estimatedFare
        )

        Spacer(
            modifier = Modifier.height(16.dp)
        )

        TaxiButton(
            text = "Solicitar viaje"
        ) {
        }

        Spacer(
            modifier = Modifier.height(8.dp)
        )

        TaxiButton(
            text = "Abrir chat"
        ) {
            navController.navigate(Routes.CHAT)
        }

        Spacer(
            modifier = Modifier.height(8.dp)
        )

        TaxiButton(
            text = "Ver perfil"
        ) {
            navController.navigate(Routes.PROFILE)
        }

    }

}