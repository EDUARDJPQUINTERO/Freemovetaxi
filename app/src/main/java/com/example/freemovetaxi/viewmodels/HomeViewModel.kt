package com.example.freemovetaxi.viewmodels

import androidx.compose.runtime.*
import androidx.lifecycle.ViewModel

class HomeViewModel : ViewModel() {

    var estimatedFare by mutableStateOf("12.500 COP")
        private set

    var driverName by mutableStateOf("Carlos Rodríguez")
        private set

    var driverRating by mutableStateOf(4.9)
        private set

}