package com.amyik.lamda

import java.lang.StringBuilder

fun main() {

    val employees = listOf(
        Employee("A", "B", 2022),
        Employee("C", "D", 2021),
        Employee("F", "G", 2023)
    )
    println(countTo100())
    println(countTo100UsingWith())
    println(countTo100UsingApply())
    findByLastName(employees, "D")
    findByLastName(employees, "Z")
    findByLastNameImprove(employees, "D")
    findByLastNameImprove(employees, "Z")


    "Some String".apply somestring@{
        "Another String".apply {
            println(lowercase())
            println(uppercase())

            println(this@somestring.lowercase())
            println(this@somestring.uppercase())
        }
    }



}

fun findByLastNameImprove(employees: List<Employee>, lastName: String) {
    employees.forEach returnBlock@{
        if (it.lastName == lastName) {
            println("Yes, there is a employee with the last name $lastName")
            return@returnBlock
        }
    }
    println("No, there is no employee with the last name $lastName")
}

fun findByLastName(employees: List<Employee>, lastName: String) {
    for (employee in employees) {
        if (employee.lastName == lastName) {
            println("Yes, there is a employee with the last name $lastName")
            return
        }
    }
    println("No, there is no employee with the last name $lastName")
}

fun countTo100UsingApply() =
    StringBuilder().apply {
        for (i in 1..99) {
            append(i) // this.append(i)
            append(", ") // this.append(", ")
        }
        append(100)
    }.toString()


fun countTo100UsingWith() =
    with(StringBuilder()) {
        for (i in 1..99) {
            append(i) // this.append(i)
            append(", ") // this.append(", ")
        }
        append(100)
        toString()
    }

fun countTo100(): String {
    val numbers = StringBuilder()
    for (i in 1..99) {
        numbers.append(i)
        numbers.append(", ")
    }
    numbers.append(100)
    return numbers.toString()
}

