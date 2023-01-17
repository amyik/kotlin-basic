package com.amyik.ifstatement


fun main() {

    val someCondition = true
    val num = if(someCondition) 50 else 32

    val num2 = if (someCondition) {
        println("when true")
        50
    } else {
        println("when false")
        32
    }
    println(num2) // 50

}

class IfStatement {

}