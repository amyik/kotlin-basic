package com.amyik.collection

fun main() {

  val setInts = setOf<Int>(10, 15, 19, 5, 3, -22)

  println(setInts.plus(20)) // [10, 15, 19, 5, 3, -22, 20]
  println(setInts) // [10, 15, 19, 5, 3, -22]
  println(setInts === setInts.plus(20)) // false; 새로운 Set Instance를 만들어 낸다

  println(setInts.plus(10)) // [10, 15, 19, 5, 3, -22]
  println(setInts === setInts.plus(10)) // false; 새로운 Set Instance를 만들어 낸다

  println(setInts.minus(19))
  // setOf로 맏는 instance는 immutable이다.


  println(setInts.average())
  println(setInts.drop(3)) // drop first 3 elements

  ////
  val mutableInts = mutableSetOf<Int>(1, 2, 3, 4, 5)
  mutableInts.plus(10)
  println(mutableInts) // [1, 2, 3, 4, 5] ; mutableSet도 plus연산에 의해 새로운 instance를 만들어낸다.
}