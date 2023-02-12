package com.amyik.collection

fun main() {
  val immutableMap = mapOf<Int, Car>(
    1 to Car("red", "toyota", 1986),
    2 to Car("green", "Ford", 2016),
    3 to Car("silver", "Honda", 2013)
  )

  println(immutableMap.javaClass) // class java.util.LinkedHashMap
  println(immutableMap)

  val mutableMap = mutableMapOf<String, Car>(
    "John's car" to Car("Red", "Range Rover", 2010),
    "Jane's Car" to Car("blue", "hyundai", 2012)
  )

  println(mutableMap.javaClass) // class java.util.LinkedHashMap
  /**
   *둘 다 Linked Hash Map Type이다.
   *이유는, LinkedHashMap이 Predictable Order를 갖기 때문에 코틀린은 List -> Map으로 변경을 쉽게 하기 위해서이다.
   */
  println(mutableMap)
  /**
   * LinkedHashMap을 원치 않으면 hashMapOf(..)함수를 이용한다.
   */

  val mutableHashMap = hashMapOf<String, Car>(
    "John's car" to Car("Red", "Range Rover", 2010),
    "Jane's Car" to Car("blue", "hyundai", 2012)
  )

  println(mutableHashMap.javaClass) // class java.util.HashMap
  println(mutableHashMap)

  // Destructuring
  for (entry in mutableHashMap) {
    println(entry.key)
    println(entry.value)
  }

  for ((key, value) in mutableHashMap) {
    println(key)
    println(value)
  }

  val pair = Pair(10, "ten")

//  val firstValue = pair.first
//  val secondValue = pair.second
  val (firstValue, secondValue) = pair

  println(firstValue)
  println(secondValue)

  val car = Car("blue", "Corvette", 1955)
  val (color, model, year) = car

  println("color:$color, model:$model, year:$year")

  val carDataClass = CarDataClass("blue", "Corvette", 1955)
  val (colorData, modelData, yearData) = carDataClass

  println("color:$colorData, model:$modelData, year:$yearData")
}

class Car(private val color: String, private val model: String, private val year: Int) {
  // destructuring 을 사용하기 위해 component function 이 필요하다
  operator fun component1() = color
  operator fun component2() = model
  operator fun component3() = year
}

// data class는 component function을 만들지 않아도 destruction을 사용 가능
data class CarDataClass(val color: String, val model: String, val year: Int)

