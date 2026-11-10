package com.example.freemovetaxi.viewmodels

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
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