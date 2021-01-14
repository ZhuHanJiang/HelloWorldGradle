package com.haru.kotlin

fun main() {
    val a = IntArray(5)
    println(a.size)

    val b = ArrayList<String>()
    println(b.size)

    val c0 = intArrayOf(1,2,3,4,5)
    val c1 = IntArray(5){it * 3 + 1}
    println("c0: ${c0.contentToString()}, c1: ${c1.contentToString()}")

    val d = arrayOf("Hello", "World")
    d[1] = "Kotlin"
    println("${d[0]}, ${d[1]}")

    //iteration method is similar as Java in two ways
    val e = floatArrayOf(1f, 3f, 5f, 7f)
    for (element in e) { // for loop
        println(element)
    }
    e.forEach { element ->
        println(element)
    } //lambda expression
    e.forEach { println(it) } //it: Float (it is the default name)

    //judge whether target element existing in an array
    if (e.any { it == 1f }) {
        println("1f exists in variable e")
    }

    if (!e.any { it == 1.2f }) {
        println("1.2f not exists in variable e")
    }



}