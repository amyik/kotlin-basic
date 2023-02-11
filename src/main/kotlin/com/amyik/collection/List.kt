package com.amyik.collection


fun main() {


    var strings = listOf("a", "b", "c")
    var mutableStrings = mutableListOf("a", "b", "c")

    println(strings.javaClass)

    val listOfNotNull = listOfNotNull("asdf", null)

    println(listOfNotNull.javaClass)

    val arrayOf = arrayOf("a", "b", "c")
    println(arrayOf)
    val listOf = listOf(*arrayOf)
    println(listOf)
}