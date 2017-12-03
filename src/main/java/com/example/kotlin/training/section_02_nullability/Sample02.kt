package com.example.kotlin.training.section_02_nullability

fun main(args: Array<String>) {
    println(toUppercase1(null))
    println(toUppercase2("Kotlin"))
    println(toUppercase3("Kotlin"))
}

fun toUppercase1(name: String?): String {
    return if (name != null) {
        name.toUpperCase()
    } else {
        "Default value"
    }
}

fun toUppercase2(name: String?): String {
    return name?.toUpperCase() ?: "Default value"
}

fun toUppercase3(name: String?) = name?.toUpperCase() ?: "Default value"