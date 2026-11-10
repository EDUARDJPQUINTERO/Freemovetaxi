package com.example.freemovetaxi.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

import com.example.freemovetaxi.views.screens.ChatScreen
import com.example.freemovetaxi.views.screens.HomeScreen
import com.example.freemovetaxi.views.screens.LoginScreen
import com.example.freemovetaxi.views.screens.ProfileScreen
import com.example.freemovetaxi.views.screens.RegisterScreen
import com.example.freemovetaxi.views.screens.SplashScreen

@Composable
fun AppNavigation() {

    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = Routes.SPLASH
    ) {

        composable(Routes.SPLASH) {

            SplashScreen(navController)

        }

        composable(Routes.LOGIN) {

            LoginScreen(navController)

        }

        composable(Routes.REGISTER) {

            RegisterScreen(navController)

        }

        composable(Routes.HOME) {

            HomeScreen(navController)

        }

        composable(Routes.CHAT) {

            ChatScreen(navController)

        }

        composable(Routes.PROFILE) {

            ProfileScreen(navController)

        }

    }

}