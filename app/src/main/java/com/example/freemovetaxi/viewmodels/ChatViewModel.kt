package com.example.freemovetaxi.viewmodels

import androidx.compose.runtime.*
import androidx.lifecycle.ViewModel

class ChatViewModel : ViewModel() {

    var message by mutableStateOf("")
        private set

    fun updateMessage(value: String) {
        message = value
    }

    fun sendMessage() {

        message = ""

    }

}