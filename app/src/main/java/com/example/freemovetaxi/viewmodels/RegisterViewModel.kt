package com.example.freemovetaxi.viewmodels

import androidx.compose.runtime.*
import androidx.lifecycle.ViewModel

class RegisterViewModel : ViewModel() {

    var name by mutableStateOf("")
        private set

    var email by mutableStateOf("")
        private set

    var phone by mutableStateOf("")
        private set

    fun updateName(value: String) {
        name = value
    }

    fun updateEmail(value: String) {
        email = value
    }

    fun updatePhone(value: String) {
        phone = value
    }

    fun register(): Boolean {

        return name.isNotBlank()
    }
}

