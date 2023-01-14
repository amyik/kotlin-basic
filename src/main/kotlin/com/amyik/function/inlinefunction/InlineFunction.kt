package com.amyik.function.inlinefunction

fun main() {
    normalFunction()
    functionTobeInlined()
}

fun normalFunction() {
    println("function called")
}

inline fun functionTobeInlined() {
    println("function to be inlined")
}