package com.example.kotlin.training.section_06_high_order_functions

import java.util.concurrent.locks.Lock

fun <T> filterList(list: List<T>, filterFunc: (T) -> Boolean): List<T> {
    return list.filter { item -> filterFunc.invoke(item) }
}

fun <T> lock(lock: Lock, body: () -> T): T {
    lock.lock()
    try {
        return body()
    }
    finally {
        lock.unlock()
    }
}

fun main(args: Array<String>) {
    val names = listOf("Alice", "Bob")
    val filteredList = filterList(names, { name -> name.length > 4 })
    println(filteredList)
}