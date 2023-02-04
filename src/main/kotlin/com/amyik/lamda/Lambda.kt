package com.amyik.lamda

fun main() {
    run { println("I am a lambda !") }

    val employees = listOf(
        Employee("A", "B", 2022),
        Employee("C", "D", 2021),
        Employee("F", "G", 2023)
    )
    println(employees.minByOrNull { e: Employee -> e.startYear })
    println(employees.minByOrNull { it.startYear })
    println(employees.minByOrNull(Employee::startYear))
    run(::topLevelFunction)
}

fun topLevelFunction() = println("I am in a function")

data class Employee(val firstName: String, val lastName: String, val startYear: Int) {

}
