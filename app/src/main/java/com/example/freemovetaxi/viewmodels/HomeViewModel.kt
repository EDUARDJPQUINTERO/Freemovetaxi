package com.example.freemovetaxi.viewmodels

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel

class HomeViewModel : ViewModel() {

    var driverName by mutableStateOf("Carlos Rodríguez")
        private set

    var driverRating by mutableStateOf(4.9)
        private set

    var estimatedFare by mutableStateOf("$12.500 COP")
        private set

    fun requestTrip() {

    }
}