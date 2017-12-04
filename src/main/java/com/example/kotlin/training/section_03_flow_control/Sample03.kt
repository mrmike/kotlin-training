package com.example.kotlin.training.section_03_flow_control

fun len(input: Any) {
    if (input is String) {
        println(input.length) // smart cast - calling String's method
    } else {
        println("...")
        val mutableListOf: MutableList<String> = mutableListOf("123")
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

fun map(items: List<String>): String {
    return items
            .filter { it.length > 10 }
            .map { item -> item.toUpperCase() }
            .map(String::toLowerCase)
            .first()
}