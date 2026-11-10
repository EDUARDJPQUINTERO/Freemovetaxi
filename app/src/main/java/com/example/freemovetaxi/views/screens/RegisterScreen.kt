package com.example.freemovetaxi.views.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding

import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text

import androidx.compose.runtime.*

import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

import androidx.navigation.NavController

import com.example.freemovetaxi.navigation.Routes
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.freemovetaxi.viewmodels.RegisterViewModel
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.width
import androidx.compose.ui.res.painterResource

import com.example.freemovetaxi.R
@Composable
fun RegisterScreen(
    navController: NavController
) {
    val registerViewModel: RegisterViewModel = viewModel()
    var isDriver by remember {
        mutableStateOf(false)
    }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(24.dp),

        verticalArrangement = Arrangement.Center
    ) {
        Image(
            painter = painterResource(
                id = R.drawable.freemove_logo
            ),
            contentDescription = "Logo FreeMove Taxi"
        )

        Spacer(
            modifier = Modifier.height(16.dp)
        )
        Text(
            text = "Registro"
        )

        Spacer(modifier = Modifier.height(16.dp))
        Row {

            Button(
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
                onClick = {
                    isDriver = true
                }
            ) {
                Text("Conductor")
            }

        }

        Spacer(
            modifier = Modifier.height(16.dp)
        )

        OutlinedTextField(
            value = registerViewModel.name,
            onValueChange = {
                registerViewModel.updateName(it)
            },
            label = {
                Text("Nombre completo")
            }
        )

        Spacer(modifier = Modifier.height(12.dp))

        OutlinedTextField(
            value = registerViewModel.email,
            onValueChange = {
                registerViewModel.updateEmail(it)
            },
            label = {
                Text("Correo electrónico")
            }
        )

        Spacer(modifier = Modifier.height(12.dp))

        OutlinedTextField(
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
                value = "",
                onValueChange = {},
                label = {
                    Text("Número de licencia")
                }
            )

            Spacer(
                modifier = Modifier.height(12.dp)
            )

            OutlinedTextField(
                value = "",
                onValueChange = {},
                label = {
                    Text("Placa del vehículo")
                }
            )

        }
        Button(
            onClick = {

                if (registerViewModel.register()) {

                    navController.navigate(Routes.HOME)

                }

            }
        ){

            Text("Registrarse")

        }

    }

}