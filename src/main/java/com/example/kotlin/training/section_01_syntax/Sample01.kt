package com.example.kotlin.training.section_01_syntax

fun main(args: Array<String>) {
    println("Hello Kotlin")

    greetings(name = "michał")
}

fun greetings(capitalize: Boolean = true, name: String = "Kotlin") {
    if (capitalize) {
        println("Hello ${name.capitalize()}")
    } else {
        println("Hello $name")
    }
}

