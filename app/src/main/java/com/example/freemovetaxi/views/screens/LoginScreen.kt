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
import androidx.compose.material3.TextButton

import androidx.compose.runtime.*

import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

import androidx.navigation.NavController

import com.example.freemovetaxi.navigation.Routes
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.freemovetaxi.viewmodels.LoginViewModel

@Composable
fun LoginScreen(
    navController: NavController
) {
    val loginViewModel: LoginViewModel = viewModel()
    val email = loginViewModel.email

    val password = loginViewModel.password

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(24.dp),

        verticalArrangement = Arrangement.Center
    ) {

        Text(
            text = "Iniciar sesión"
        )

        Spacer(
            modifier = Modifier.height(16.dp)
        )

        OutlinedTextField(
            value = email,
            onValueChange = {
                loginViewModel.updateEmail(it)
            },
            label = {
                Text("Correo electrónico")
            }
        )

        Spacer(
            modifier = Modifier.height(12.dp)
        )

        OutlinedTextField(
            value = password,
            onValueChange = {
                loginViewModel.updatePassword(it)
            },
            label = {
                Text("Contraseña")
            }
        )

        Spacer(
            modifier = Modifier.height(20.dp)
        )

        Button(
            onClick = {

                if (loginViewModel.login()) {

                    navController.navigate(Routes.HOME)

                }

            }
        ) {
            Text("Ingresar")
        }

        TextButton(
            onClick = {
                navController.navigate(Routes.REGISTER)
            }
        ) {
            Text("Registrarse")
        }

    }

}