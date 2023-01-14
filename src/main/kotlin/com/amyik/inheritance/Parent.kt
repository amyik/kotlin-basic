package com.amyik.inheritance

abstract class Parent(val lastName: String) {
    open fun sayLastName(): String {
        return "Parent's lastname is $lastName"
    }
}

class Child1(lastName: String) : Parent(lastName) {
    override fun sayLastName(): String {
        return "Child1's lastname is $lastName"
    }
}

class Child2 : Parent {
    constructor(lastName: String) : super(lastName)
}