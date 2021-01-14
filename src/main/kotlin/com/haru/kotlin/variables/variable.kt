package com.haru.kotlin.variables

fun main() {
    var a = 2
    a = 3

    val b = 3

    val x = X()

    println(x.b)
    println(x.b)
    println(x.b)

    val c: Int //initialize
    if(a == 3) {
        c = 4
    } else {
        c = 5
    }
    println(c)
}

class X {
    val b: Int //property
    get() {
        return (Math.random() * 100).toInt()
    }
}