package com.example.freemovetaxi.data.models

data class DriverModel(

    val id: String = "",

    val name: String = "",

    val license: String = "",

    val rating: Double = 0.0,

    val vehicle: VehicleModel = VehicleModel()

)