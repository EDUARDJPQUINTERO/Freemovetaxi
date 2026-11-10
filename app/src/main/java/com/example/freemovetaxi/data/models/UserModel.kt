package com.example.freemovetaxi.data.models

import com.example.freemovetaxi.data.enums.UserType

data class UserModel(

    val id: String = "",

    val name: String = "",

    val email: String = "",

    val phone: String = "",

    val userType: UserType = UserType.PASSENGER

)