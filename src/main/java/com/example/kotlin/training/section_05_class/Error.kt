package com.example.kotlin.training.section_05_class

sealed class Error

data class AuthError(val message: String) : Error()
data class ServerError(val code: String) : Error()
data class TimeoutError(val timeout: Long) : Error()

class ErrorHandler() {

    fun getErrorMessage(error: Error): String {
        return when (error) {
            is AuthError -> "Auth error: ${error.message}"
            is ServerError -> "${error.code} server error"
            is TimeoutError -> "Timeout (${error.timeout}) was exceeded"
        }
    }
}