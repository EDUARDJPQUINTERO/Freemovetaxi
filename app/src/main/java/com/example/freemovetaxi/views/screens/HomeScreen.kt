package com.example.freemovetaxi.views.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*

import androidx.compose.runtime.Composable

import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.res.painterResource

import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController

import com.example.freemovetaxi.R
import com.example.freemovetaxi.navigation.Routes
import com.example.freemovetaxi.viewmodels.HomeViewModel

import com.example.freemovetaxi.views.components.DriverCard
import com.example.freemovetaxi.views.components.FakeMapCard
import com.example.freemovetaxi.views.components.InfoCard
import com.example.freemovetaxi.views.components.TaxiButton

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

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.Center
        ) {

            Image(
                painter = painterResource(
                    id = R.drawable.freemove_logo
                ),
                contentDescription = "Logo FreeMove Taxi",
                modifier = Modifier.size(120.dp)
            )

        }

        Spacer(
            modifier = Modifier.height(12.dp)
        )

        FakeMapCard()

        Spacer(
            modifier = Modifier.height(12.dp)
        )

        DriverCard(
            name = homeViewModel.driverName,
            rating = homeViewModel.driverRating,
            licenseStatus = "Permisos al día"
        )

        Spacer(
            modifier = Modifier.height(12.dp)
        )

        InfoCard(
            title = "Tarifa estimada",
            content = homeViewModel.estimatedFare
        )

        Spacer(
            modifier = Modifier.height(12.dp)
        )

        TaxiButton(
            text = "Solicitar viaje"
        ) {

            homeViewModel.requestTrip()

        }

        Spacer(
            modifier = Modifier.height(8.dp)
        )

        TaxiButton(
            text = "Abrir chat"
        ) {

            navController.navigate(
                Routes.CHAT
            )

        }

        Spacer(
            modifier = Modifier.height(8.dp)
        )

        TaxiButton(
            text = "Ver perfil"
        ) {

            navController.navigate(
                Routes.PROFILE
            )

        }

    }

}