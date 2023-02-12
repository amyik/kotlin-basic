package com.amyik.collection

fun main() {
    val strings = listOf("spring", "summer", "fall", "summer", "winter")
    val colorList = listOf("black", "white", "red", "black")

    println(strings.last())
    println(strings.asReversed())

    println(strings.getOrNull(5))

    val ints = listOf(1, 2, 3, 4, 5)

    println(ints.maxOrNull())

    println(colorList.zip(strings))

    val mergeLists = listOf(colorList, strings)
    println(mergeLists)

    val combineList = colorList + strings
    println(combineList)


    val noDupList = colorList.union(strings)
    println(noDupList)

    val noDupColors = colorList.distinct()
    println(noDupColors)

    val mutableSeasons = strings.toMutableList()
    mutableSeasons.add("some other season")
    println(mutableSeasons)
}