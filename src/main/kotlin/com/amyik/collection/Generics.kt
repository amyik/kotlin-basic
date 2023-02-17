package com.amyik.collection

fun main() {

  val ints = listOf<Int>(1, 2, 3, 4)
  val shorts = listOf<Short>(5, 6, 7, 8)
  val floats = listOf<Float>(123.12f, -33.1f)
  val strings = listOf<String>("John", "Jane")

  convertToInt(ints)
  convertToInt(shorts)
  convertToInt(floats)
//  convertToInt(strings) // string은 toInt가 없으므로; upper bound type이 안맞으므로 error
  append(StringBuilder("string1"), StringBuilder("string2"))
  if (strings is List<String>) {
    println("Yes this is list type of string")
  }

  val listAny: List<Any> = strings

  if (listAny is List<*>) { // Check is List of Anything
    println("Yes, this tis list")
  }

}

/**
 * where 을 이용해 복수개의 upper bound를 지정 가능하다
 */
fun <T> append(item1: T, item2: T)
  where T : Appendable, T : CharSequence {
  println(item1.append(item2))
}

fun <T : Number> convertToInt(list: List<T>) {

  for (num in list) {
    println("converted to ${num.toInt()}")
  }
}