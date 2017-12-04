package com.example.kotlin.training.section_04_extensions_function

import java.time.LocalDateTime
import java.time.ZoneOffset

fun Int.daysAgo(): Long {
    val now = LocalDateTime.now()
    val localDateTime = now.minusDays(this.toLong())
    return localDateTime.toInstant(ZoneOffset.UTC).toEpochMilli()
}

fun usage() {
    val milliseconds = 5.daysAgo()
}