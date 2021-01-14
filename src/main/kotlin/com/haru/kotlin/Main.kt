package com.haru.kotlin

fun main() {
    var a = 2
    val b = "Hello World"

    val c = 12345678910L
    val d = 3.0

    val e = 10
    val f:Long = e.toLong()

    val x = 2.3F
    val y = x.toDouble()

    val g:UInt = 10u
    val h:ULong = 1000000000000000000u

    val i:UByte = 1u

    val j = "I heart China"
    println("Value of String 'j' is: $j")
    println("Length of String 'j' is: ${j.length}")
    System.out.printf("Length of String 'j' is: %s\n", j)

    val k = "Today is Monday"
    val m = String("Today is Monday".toCharArray())
    val n = "Today is Monday"
    println(k === m) //compare references
    println(k == m) //compare values
    println(k === n)

    val o = """
        <!doctype html>
        <html>
        <head>
            <meta charset="UTF-8"/>
            <title>$b</title>
        </head>
        <body>
            <div id="container">
                <H1>$b</H1>
                <p>This is a demo page.</p>
            </div>
        </body>
        </html>
    """.trimIndent()

    println(o)


}