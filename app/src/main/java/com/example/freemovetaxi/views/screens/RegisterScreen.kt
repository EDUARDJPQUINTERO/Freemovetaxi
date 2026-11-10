package com.example.freemovetaxi.views.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*

import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text

import androidx.compose.runtime.*

import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp

import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController

import com.example.freemovetaxi.R
import com.example.freemovetaxi.navigation.Routes
import com.example.freemovetaxi.viewmodels.RegisterViewModel

import com.example.freemovetaxi.views.components.TaxiButton

import com.example.freemovetaxi.views.theme.TaxiBackground
import com.example.freemovetaxi.views.theme.TaxiBlack
import com.example.freemovetaxi.views.theme.TaxiYellow

@Composable
fun RegisterScreen(
    navController: NavController
) {

    val registerViewModel: RegisterViewModel = viewModel()

    var isDriver by remember {
        mutableStateOf(false)
    }

    var license by remember {
        mutableStateOf("")
    }

    var plate by remember {
        mutableStateOf("")
    }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(TaxiBackground)
            .padding(24.dp),

        verticalArrangement = Arrangement.Center
    ) {

        Image(
            painter = painterResource(
                id = R.drawable.freemove_logo
            ),
            contentDescription = "FreeMove Taxi Logo",
            modifier = Modifier.fillMaxWidth()
        )

        Spacer(
            modifier = Modifier.height(16.dp)
        )

        Text(
            text = "Registro de usuarios",
            color = TaxiBlack
        )

        Spacer(
            modifier = Modifier.height(20.dp)
        )

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.Center
        ) {

            Button(
                colors = ButtonDefaults.buttonColors(
                    containerColor = TaxiYellow,
                    contentColor = TaxiBlack
                ),
                onClick = {
                    isDriver = false
                }
            ) {
                Text("Pasajero")
            }

            Spacer(
                modifier = Modifier.width(12.dp)
            )

            Button(
                colors = ButtonDefaults.buttonColors(
                    containerColor = TaxiYellow,
                    contentColor = TaxiBlack
                ),
                onClick = {
                    isDriver = true
                }
            ) {
                Text("Conductor")
            }

        }

        Spacer(
            modifier = Modifier.height(20.dp)
        )

        OutlinedTextField(
            modifier = Modifier.fillMaxWidth(),

            value = registerViewModel.name,

            onValueChange = {
                registerViewModel.updateName(it)
            },

            label = {
                Text("Nombre completo")
            }
        )

        Spacer(
            modifier = Modifier.height(12.dp)
        )

        OutlinedTextField(
            modifier = Modifier.fillMaxWidth(),

            value = registerViewModel.email,

            onValueChange = {
                registerViewModel.updateEmail(it)
            },

            label = {
                Text("Correo electrónico")
            }
        )

        Spacer(
            modifier = Modifier.height(12.dp)
        )

        OutlinedTextField(
            modifier = Modifier.fillMaxWidth(),

            value = registerViewModel.phone,

            onValueChange = {
                registerViewModel.updatePhone(it)
            },

            label = {
                Text("Número telefónico")
            }
        )

        if (isDriver) {

            Spacer(
                modifier = Modifier.height(12.dp)
            )

            OutlinedTextField(
                modifier = Modifier.fillMaxWidth(),

                value = license,

                onValueChange = {
                    license = it
                },

                label = {
                    Text("Número de licencia")
                }
            )

            Spacer(
                modifier = Modifier.height(12.dp)
            )

            OutlinedTextField(
                modifier = Modifier.fillMaxWidth(),

                value = plate,

                onValueChange = {
                    plate = it
                },

                label = {
                    Text("Placa del vehículo")
                }
            )

        }

        Spacer(
            modifier = Modifier.height(20.dp)
        )

        TaxiButton(
            text = "Registrarse"
        ) {

            if (registerViewModel.register()) {

                navController.navigate(
                    Routes.HOME
                )

            }

        }

    }

}