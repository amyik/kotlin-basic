package com.amyik.companionobject


fun main() {
    println(SomeClass.accessPrivateVar())

    val instance = SomeClass.getInstance("hello")
    println(instance.strProperty)
}

class SomeClass private constructor(val strProperty: String){
    companion object {
        private val privateVar = "private variable value"
        fun accessPrivateVar() = "Accessing private variable $privateVar"

        fun getInstance(str: String): SomeClass {
            return SomeClass(str)
        }
    }
}