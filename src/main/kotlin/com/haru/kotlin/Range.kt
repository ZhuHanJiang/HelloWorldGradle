package com.haru.kotlin

fun main() {
    val intRange = -1 .. 10
    val charRange = 'a' .. 'z'
    val longRange = 1L .. 100L
    val floatRange = 1f..2f // closed range [1,2] uncountable, not printable
    val doubleRange = 1.0..2.0

    println(intRange.joinToString())
    println(charRange.joinToString())
    println(longRange.joinToString())
    println(floatRange.toString())

    val uintRange = 1U .. 10U
    val ulongRange = 1UL .. 10UL
    println(uintRange.joinToString())
    println(ulongRange.joinToString())

    val intRangeWithStep = 1 .. 10 step 2
    val charRangeWithStep = 'a' .. 'z' step 2
    val longRangeWithStep = 1L .. 100L step 5
    println(intRangeWithStep.joinToString())
    println(charRangeWithStep.joinToString())
    println(longRangeWithStep.joinToString())

    val intRangeExclusive = 1 until 10
    val charRangeExclusive = 'a' until 'z'
    val longRangeExclusive = 1L until 13L
    println(intRangeExclusive.joinToString())
    println(charRangeExclusive.joinToString())
    println(longRangeExclusive.joinToString())

    val intRangeReverse = 10 downTo 1 // 10, 9, .. 1
    val charRangeReverse = 'z' downTo 'a'
    val longRangeReverse = 15L downTo 0L
    println(intRangeReverse.joinToString())

    for (element in intRange) {
        println(element)
    }
    intRange.forEach { println(it) }

    if (intRange.any { it == 3 }) {
        println("3 in range 'intRange'")
    }
    if (!intRange.any { it == 12 }) {
        println("12 not in range 'intRange'")
    }
    if (3f !in floatRange) {
        println("3 not in double range")
    }

    val array = intArrayOf(1, 3, 5, 7)
//    for (i in 0 until array.size) {
//        println(array[i])
//    }
    for (i in array.indices) {
        println(i)
        println(array[i])
    }
}