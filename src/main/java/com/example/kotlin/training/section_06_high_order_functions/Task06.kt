package com.example.kotlin.training.section_06_high_order_functions

class Task06 {

    fun validate(value: String, validators: List<(String) -> Boolean>): Boolean {
        TODO()
    }

    /**
     * Returns function checking that string is not empty
     */
    fun isNotEmpty(): (String) -> Boolean {
        TODO()
    }

    /**
     * Returns function checking that string has minimum length
     */
    fun hasMinimumLength(minLength: Int): (String) -> Boolean {
        TODO()
    }

    /**
     * Return functions checking that string contains given character
     */
    fun includesSpecialChar(specialChar: Char): (String) -> Boolean {
        TODO()
    }
}