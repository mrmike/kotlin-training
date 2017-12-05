package com.example.kotlin.training.section_06_high_order_functions

import org.junit.Assert.*
import org.junit.Before
import org.junit.Test

class Task06Test {

    lateinit var task06: Task06

    @Before
    fun setUp() {
        task06 = Task06()
    }

    @Test
    fun `should correctly validate value`() {
        val input = "12-33*1"

        val isValid = task06.validate(input, listOf(
                task06.isNotEmpty(),
                task06.hasMinimumLength(5),
                task06.includesSpecialChar('-'),
                task06.includesSpecialChar('*')
        ))

        assertTrue(isValid)
    }

    @Test
    fun `should return false of one of the criteria is missing`() {
        val input = "12-33*1"

        val isValid = task06.validate(input, listOf(
                task06.isNotEmpty(),
                task06.hasMinimumLength(5),
                task06.includesSpecialChar('<'),
                task06.includesSpecialChar('*')
        ))

        assertFalse(isValid)
    }

}