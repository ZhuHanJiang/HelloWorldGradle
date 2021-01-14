package com.haru.kotlin.advancedFunctions

fun main() {
    cost {
        val fibonacciNext = fibonacci()
        for (i in 0..10) {
            println(fibonacciNext())
        }
    }

    // region + fold
    val intArray = IntArray(5) { it + 1 }
    intArray.forEach { println(it) }
    intArray.forEach(::println)
    intArray.forEach {
        println("Hello $it")
    }
    // endregion
}

// high order function
// receive function class
fun cost(block: () -> Unit) {
    val start = System.currentTimeMillis()
    block()
    println("${System.currentTimeMillis() - start}ms")
}

// return function
fun fibonacci(): () -> Long {
    var first = 0L
    var second = 1L
    return {
        val next = first + second
        val current = first
        first = second
        second = next
        current
    }
}

