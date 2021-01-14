package com.haru.kotlin.inlines

fun main() {
    cost {
        println("Hello")
    }
}

fun cost(block: () -> Unit) {
    val start = System.currentTimeMillis()
    block()
    println("${System.currentTimeMillis() - start}ms")
}