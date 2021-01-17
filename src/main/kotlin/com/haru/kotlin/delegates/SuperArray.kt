package com.haru.kotlin.delegates

class SuperArray<E>(
    private val list: MutableList<E?> = ArrayList(),
    private val map: MutableMap<Any, E> = HashMap()
): MutableList<E?> by list, MutableMap<Any, E> by map {
    override fun isEmpty() = list.isEmpty() && map.isEmpty()

    override val size: Int
        get() = list.size + map.size

    override fun clear() {
        list.clear()
        map.clear()
    }

    override fun set(index: Int, element: E?): E? {
        if (index >= list.size) {
            repeat(index - list.size + 1) {
                list.add(null)
            }
        }
        return list.set(index, element)
    }

    override fun toString(): String {
//        return "List: ${(0 until list.size).joinToString { list[it].toString() }}" +
//                "; Map: ${map.toString()}"
        return """List: $list; Map: $map"""
    }
}

fun main() {
    val superArray = SuperArray<String>()
    val superArray2 = SuperArray<String>()
    superArray += "Hello" //plusAssign() function, actually add()
    superArray["Hello"] = "World" //map set()
    println(superArray) //toString()
    superArray2[superArray] = "HHH"

//    superArray[0] = "hello" //list set()
    superArray[1] = "world"
    superArray[4] = "!!!"
    println(superArray)
    println(superArray2)
}