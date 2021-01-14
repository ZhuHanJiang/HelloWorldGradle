package com.haru.kotlin.extensions

fun main() {
    println("YOU".pad(3, '*'))
    println("*".times(10))

    val starFunc = "*"::times
    println(starFunc(3))
}

fun String.pad(count: Int, char: Char): String {
    val padding: String = (1 .. count).joinToString("|") { "abc" }
    return "${padding}${this}${padding}"
}

fun String.times(count: Int): String {
    return (1 .. count).joinToString("") { this }
}

