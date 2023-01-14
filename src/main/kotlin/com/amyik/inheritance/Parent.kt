package com.amyik.inheritance

abstract class Parent(val lastName: String) {
}

class Child1(lastName: String) : Parent(lastName) {
}

class Child2 : Parent {
    constructor(lastName: String) : super(lastName)
}