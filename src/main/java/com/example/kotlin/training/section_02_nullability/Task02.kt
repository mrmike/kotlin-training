package com.example.kotlin.training.section_02_nullability

class Task02 {

    /**
     * Function should returns 0 for null value or length of modified string in such way
     * that new string starts a
     *
     * value = null, index = 10 should returns 0
     * value = Kotlin, index = 1 should return 4 (cause length for tlin is 4)
     */
    fun isValidInput(value: String?, minLength: Int, maxLength: Int?): Boolean {
        val length = value?.length ?: 0
        return length >= minLength
        TODO()
    }

}