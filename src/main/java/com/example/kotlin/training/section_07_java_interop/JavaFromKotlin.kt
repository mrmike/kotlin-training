package com.example.kotlin.training.section_07_java_interop

import com.example.kotlin.training.section_05_class.PersonJava

class JavaFromKotlin {

    fun personExample() {
        val personJava = PersonJava("firstName", "lastName", 25)
        val firstName: String? = personJava.firstName
        val lastName: String = personJava.lastName
        val age = personJava.age
    }
}