package com.example.kotlin.training.section_03_flow_control

fun len(input: Any) {
    if (input is String) {
        println(input.length) // calling String's method
    } else {
        print
    }
}

fun dayOfWeek(day: Int): String {
    return when (day) {
        0 -> "Monday"
        1 -> "Tuesday"
        2 -> "Wednesday"
        3 -> "Thursday"
        4 -> "Friday"
        else -> "Weekend"
    }
}