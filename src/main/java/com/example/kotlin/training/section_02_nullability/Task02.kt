package com.example.kotlin.training.section_02_nullability

class Task02 {

    /**
     * Return person image url if provided avatar is not null and contains not empty imageUrl
     * Return example.com in other case
     */
    fun getImageUrl(person: Person): String {
        TODO()
    }

}

class Avatar(val imageUrl: String)
class Person(val name: String, val avatar: Avatar?)