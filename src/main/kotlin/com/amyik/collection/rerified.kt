package com.amyik.collection

import java.math.BigDecimal
import java.util.StringJoiner

/**
 *
 * ## Rerified
 *
 * class cast exception이 발생하는 코드를 작성해도 문법적으로 에러는 나지 않는다. 실행하면 에러가 난다.
 *
 * kotlin에서 Generic Type에 대한 정보는 Runtime시에 지워진다?
 *
 * 이를 보존하는 방법?
 */

fun main() {
  val mixedList = listOf<Any>("str", 1, BigDecimal(11.23), "hello", BigDecimal(-123.123))
//  val elementsOfTypeBigDecimal = getElementsOfType<BigDecimal>(mixedList)
  val elementsOfTypeBigDecimal = getElementsOfType<String>(mixedList)
  for (element in elementsOfTypeBigDecimal) {
    println(element)
  }
}

inline fun <reified T> getElementsOfType(list: List<Any>): List<T> {
  val mutableListOf = mutableListOf<T>()
  for (element in list) {
    if (element is T) {
      mutableListOf.add(element)
    }
  }
  return mutableListOf
}