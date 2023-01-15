package com.amyik.inheritance

abstract class Parent(val lastName: String) {
    open fun sayLastName(): String {
        return "Parent's lastname is $lastName"
    }
    abstract fun sayAge(): Int //abstract 함수는 final이 아니다.
}

open class Child1(lastName: String) : Parent(lastName) {
    override fun sayLastName(): String {
        return "Child1's lastname is $lastName"
    }
    final override fun sayAge(): Int = 20
}

class GrandChild(lastName: String) : Child1(lastName) {
//    override fun sayAge(): Int = 5 // 'sayAge' in 'Child1' is final and cannot be overridden
}

class Child2 : Parent {
    constructor(lastName: String) : super(lastName)
    override fun sayAge(): Int = 25
}