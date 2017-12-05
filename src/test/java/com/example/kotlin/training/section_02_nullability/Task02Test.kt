package com.example.kotlin.training.section_02_nullability

import org.junit.Assert.*
import org.junit.Before
import org.junit.Test

class Task02Test {

    lateinit var task02: Task02

    @Before
    fun setUp() {
        task02 = Task02()
    }

    @Test
    fun `should return default url if avatar is null`() {
        val person = Person("Bob", null)

        val imageUrl = task02.getImageUrl(person)

        assertEquals("example.com", imageUrl)
    }

    @Test
    fun `should return image url if avatar is provided`() {
        val expectedImageUrl = "image.com/1.jpg"
        val avatar = Avatar(expectedImageUrl)
        val person = Person("Bob", avatar)

        val imageUrl = task02.getImageUrl(person)

        assertEquals(expectedImageUrl, imageUrl)
    }
}
