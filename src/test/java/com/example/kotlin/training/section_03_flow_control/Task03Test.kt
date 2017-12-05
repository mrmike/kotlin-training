package com.example.kotlin.training.section_03_flow_control

import org.junit.Assert.*
import org.junit.Before
import org.junit.Test

class Task03Test {

    lateinit var task03: Task03

    @Before
    fun setUp() {
        task03 = Task03()
    }

    @Test
    fun `should return correct length of the longest String`() {
        val emptyList = listOf<String>()
        assertEquals(0, task03.lengthOfLongestString(emptyList))

        val twoElementList = listOf("Bob", "Alice")
        assertEquals(5, task03.lengthOfLongestString(twoElementList))

        val listWithDuplicates = listOf("Bob", "Bob", "Bob")
        assertEquals(3, task03.lengthOfLongestString(listWithDuplicates))
    }

    @Test
    fun `should return correct number of occurrences`() {
        val emptyList = listOf<String>()
        assertEquals(0, task03.numberOfOccurrences(emptyList, "Bob"))

        val twoElementList = listOf("Bob", "Alice")
        assertEquals(1, task03.numberOfOccurrences(twoElementList, "Alice"))

        val listWithDuplicates = listOf("Bob", "Bob", "Bob", "Bob")
        assertEquals(4, task03.numberOfOccurrences(listWithDuplicates, "BOB"))
    }

    @Test
    fun `should return correct sum of odd numbers`() {
        val emptyList = listOf<Int>()
        assertEquals(0, task03.sumOfOddNumbers(emptyList))

        val evenNumbers = (2..10 step 2).toList()
        assertEquals(0, task03.sumOfOddNumbers(evenNumbers))

        val oneToTen = (1..10).toList()
        assertEquals(25, task03.sumOfOddNumbers(oneToTen))
    }

    @Test
    fun `should return correct subset of smallest values`() {
        val emptyList = listOf<Int>()
        assertEquals(emptyList, task03.takeNSortedSmallestValues(emptyList, 3))

        val tenToOne = (10 downTo 1).toList()
        assertEquals(listOf(1, 2, 3), task03.takeNSortedSmallestValues(tenToOne, 3))

        val evenNumbers = (100 downTo 50 step 2).toList()
        assertEquals(listOf(50, 52, 54), task03.takeNSortedSmallestValues(evenNumbers, 3))
    }
}