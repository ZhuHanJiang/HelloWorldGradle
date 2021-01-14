package com.haru.kotlin

fun main() {
    val intList: List<Int> = listOf(1, 2, 3, 4)
    val intList2: MutableList<Int> = mutableListOf(1, 2, 3, 4, 5)
    println(intList.toString())
    println(intList2.toString())

    for (element in intList) {
        println(element)
    }
    intList2.forEach{ println(it) }

    intList2 += 10
    println(intList2.toString())
    intList2 -= 2
    intList2[3] = 20
    println(intList2.toString())


    val map:Map<String, Any> = mapOf("name" to "benny", "age" to 20)
    val map2:MutableMap<String, Any> = mutableMapOf("name" to "benny", "age" to 20)

    println(map.toString())
    map2["hello"] = 'w'
    println(map2.toString())
    println(map2["age"])

    for (element in map) {
        println(element.key)
    }
    map2.forEach { (s, any) -> println("$s: $any") }

    val stringList = ArrayList<String>()
    stringList += "hello"
    stringList += "world"
    println(stringList.toString())

    val triple = Triple("Abc" , "AAA", "IEEE")
    val (x, y, z) = triple
    println("first is $x, second is $y, third is $z")
}