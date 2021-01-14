package com.haru.kotlin.classes

fun main() {
    val simpleClass = SimpleClass(9, "you")
    println("${simpleClass.x}, ${simpleClass.y}, ${simpleClass.z}")
    simpleClass.zzz("Sleeping")

    println(simpleClass.simpleProperty)


}