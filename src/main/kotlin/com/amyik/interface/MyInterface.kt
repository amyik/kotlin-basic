package com.amyik.`interface`

interface MyInterface {
    val myProperty: String
    fun myFunction(param: String): String
}

interface MySubInterface : MyInterface {
    fun mySubFunction(param: Int): Int
}

class MyClass(override val myProperty: String) : MySubInterface {
    override fun mySubFunction(param: Int): Int {
        TODO("Not yet implemented")
    }

    override fun myFunction(param: String): String {
        TODO("Not yet implemented")
    }
}