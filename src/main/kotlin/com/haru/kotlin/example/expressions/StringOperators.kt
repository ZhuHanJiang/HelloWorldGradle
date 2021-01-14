package com.haru.kotlin.example.expressions

fun main() {
    val value = "HelloWorld help"
    println(value - "World")
    println(value + "you")
    println(value * 2)

    val star = "*"
    println(star * 20)

    println(value / 3)
    println(value / "ld")

    var a = Array<String>(5) {(0..it).toString()}
    println(a.contentToString())
}

operator fun String.plus(right: String): String {
    return this + right
}

operator fun String.minus(right: Any?)
    = this.replaceFirst(right.toString(), "")

// CharSequence is an Interface of String
operator fun String.times(right: Int): String {
    /**
     * lambda function is used as the argument "transform"
     * because it is the last argument, we can move it outside of the ()
     */
//    return (1..right).joinToString("", transform = {this})
    return (1..right).joinToString("") {this}
}

operator fun String.div(right: Any?): Int {
    /**
     * null.toString() is illegal function
     * original: public fun Any?.toString(): String
     */
    val right = right.toString()

    println(this.windowed(right.length, 1) {
        it == right
    })
    return this.windowed(right.length, 1) {
        it == right
    }.count { it }
}