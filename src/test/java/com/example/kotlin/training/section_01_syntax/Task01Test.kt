package com.example.kotlin.training.section_01_syntax

import org.junit.Assert.*
import org.junit.Before
import org.junit.Test

class Task01Test {

    lateinit var task01: Task01

    @Before
    fun setUp() {
        task01 = Task01()
    }

    @Test
    fun testGreetings() {
        val expectedOutput = "Hello KOTLIN!"

        assertEquals(expectedOutput, task01.generateGreetings("Kotlin"))
        assertEquals(expectedOutput, task01.generateGreetings("kotlin"))
        assertEquals(expectedOutput, task01.generateGreetings("KOTLIN"))
    }
}
