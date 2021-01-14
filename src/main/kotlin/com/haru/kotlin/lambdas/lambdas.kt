package com.haru.kotlin.lambdas

fun main() {
    val func: () -> Unit = fun() {
        println("func")
    }

    val lambda: () -> Unit = {
        println("lambda")
    }

    val f1: (Int) -> String = {p ->
        println(p)
        "hello" //return value
    }

    val f2 = {p: Int ->
        println(p)
        "you"
    }

    println(f1(1))
    println(f2(2))

    IntArray(5) { it + 1 } //the second argument of constructor is
                // the lambda expression (Int) -> Int
}