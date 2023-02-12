package com.amyik.collection

fun main() {
  data class Car(val color: String, val model: String, val year: Int)

  val immutableMap = mapOf<Int, Car>(
    1 to Car("green", "toyota", 2015),
    2 to Car("red", "ford", 2016),
    3 to Car("silver", "honda", 2013),
    4 to Car("red", "bmw", 2015),
    5 to Car("green", "ford", 2010)
  )

  /**
   * Now one way to avoid the creation of intermediate instances is by using sequences.
   * Well sequences are pretty much the same as streams in Java Katlin provides its own classes for this
   * You only want to do this for large collections because Cartland collections are very efficient so there
   * is no need to use sequences unless you have a large collection and you're going to do something that creates intermediate results.
   */
  println(immutableMap.filter { it.value.model == "ford" }.map { it.value.color })
  println(immutableMap.asSequence().filter { it.value.model == "ford" }.map { it.value.color }
    .toList())

  val names = listOf<String>(
    "Joe", "Mary", "Jane"
  )

  names.asSequence().filter { println("filtering $it"); it[0] == 'J' }
    .map { println("mapping $it"); it.uppercase() }.toList()

}


