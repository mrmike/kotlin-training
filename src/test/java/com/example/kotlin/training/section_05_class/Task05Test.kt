package com.example.kotlin.training.section_05_class

import junit.framework.Assert.assertEquals
import org.junit.Test

class Task05Test {

    @Test
    fun `should add every item twice`() {
        val doubledList = DoubledList<Int>()
        doubledList.add(1)

        assertEquals(listOf(1, 1), doubledList)
    }
}