package com.haru.kotlin

fun main(vararg args: String) {
    println(args.contentToString())

    val x = Foo::bar
    //x0, x1, x2 are equal expressions, same meaning
    val x0: (Foo, String, Long) -> Any = Foo::bar
    val x1: Foo.(String, Long) -> Any = Foo::bar
    val x2: Function3<Foo, String, Long, Any> = Foo::bar

    val y: (Foo, String, Long) -> Any = x
    val z: Function3<Foo, String, Long, Any> = x

    yy(x)

    defaultParameter(y = "you", x = 9)

    multiParameters(1, 2, 3, 4)

    listOf(1, 2, 3, 4) // listOf is a multi parameters function

    val (a, b, c) = multiReturnValues()
    val r = a + b
    val r1 = a + c
    println("$a, $b, $c")
}

fun yy(p: (Foo, String, Long) -> Any) {
    //p(Foo(), "hello", 3L)
    //p.invoke(Foo(), "world", 2L)
}

class Foo {
    fun bar(p0: String, p1: Long):Any {
        TODO()
    }
}

fun defaultParameter(x: Int = 10, y: String, z: Long = 0L) {
    println("$x, $y, $z")
}

fun multiParameters(vararg ints: Int) {
    println(ints.contentToString())
}

fun multiReturnValues(): Triple<Int, Long, Double> {
    return Triple(1, 3L, 4.0)
}