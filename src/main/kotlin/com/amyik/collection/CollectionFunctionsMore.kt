package com.amyik.collection

fun main() {

  /**
   * Colleciton And Lambda Function
   */
  val intSet = setOf<Int>(1, 2, 3, 4, 5)

  println(intSet.filter { it % 2 !== 0 })

  val immutableMap =
    mapOf<Int, NewCar>(1 to NewCar("red", "toyota", 1996), 2 to NewCar("green", "ford", 2000))

  println(immutableMap.filter { it.value.year === 2000 })

  val mutableMap =
    mutableMapOf<Int, NewCar>(
      1 to NewCar("red", "toyota", 1996),
      2 to NewCar("green", "ford", 2000),
      2 to NewCar("silver", "ford", 2021),
    )

  println(mutableMap.map { it.value.year + 1 })

  println(mutableMap.filter { it.value.model == "ford" }.filter { it.value.color == "silver" })

  println(mutableMap.all { it.value.year > 1999 })
  println(mutableMap.any { it.value.year > 1999 })

  println(mutableMap.filter { it.value.color === "green" })
  println(mutableMap) // mutable, immutable 구분 없이, filter function은 원본을 수정하지 않는다.

  val cars = mutableMap.values
  println("find function: " + cars.find { it.model == "ford" })
  println("groupBy function: " + cars.groupBy { it.model })
  println("sortBy function: " + cars.sortedBy { it.year })

  val ints = arrayOf(1, 2, 3, 4)
  val add10List: MutableList<Int> = mutableListOf()

  for (i in ints) {
    add10List.add(i + 10)
  }
  println(add10List) // [11, 12, 13, 14]

  val add10ListMadeByMap = ints.map { it + 10 }
  println(add10ListMadeByMap)
}

private data class NewCar(val color: String, val model: String, val year: Int)

