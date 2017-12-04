package com.example.kotlin.training.section_04_extensions_function

import org.junit.Assert.*
import org.junit.Test

class Task04Test {

    @Test
    fun `should recognize even numbers`() {
        assertFalse(null.isEven())

        assertFalse(1.isEven())

        assertTrue(2.isEven())
    }

    @Test
    fun `should return even numbers`() {
        val evenNumbers = listOf(1, 2, 3, 4, 5).evenNumbers()

        assertEquals(listOf(1, 3, 5), evenNumbers)
    }
}