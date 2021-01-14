package com.haru.kotlin.operators

fun main() {
    "Hello" == "World"
    "Hello".equals("World")

    2 + 3
    2.plus(3)

    var list = listOf(1, 2, 3, 4)
    2 in list
    list.contains(2)

    val map = mutableMapOf(
        "hello" to 2,
        "world" to 3
    )
    val value = map["hello"]
//    val value = map.get("hello")

    map["world"] = 4
    map.set("world", 4)

    val func = fun() {
        println("YOU")
    }
    func()
    func.invoke()

    2 > 3
    2.compareTo(3) > 0


}