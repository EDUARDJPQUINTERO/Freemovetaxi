package com.example.freemovetaxi.data.models

import com.example.freemovetaxi.data.enums.TripStatus

data class TripModel(

    val id: String = "",

    val passengerId: String = "",

    val driverId: String = "",

    val origin: String = "",

    val destination: String = "",

    val estimatedFare: Double = 0.0,

    val status: TripStatus = TripStatus.PENDING

)