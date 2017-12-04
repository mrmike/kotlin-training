package com.example.kotlin.training.section_05_class

data class Person(val firstName: String, val lastName: String, val age: Int) {

    val fullName = "$firstName $lastName"

    val fullNameBackedField: String
        get() {
            return "$firstName $lastName"
        }

    // secondary constructor
    constructor(firstName: String, age: Int) : this(firstName, "Default name", age)

    init {
        // init block
    }

}