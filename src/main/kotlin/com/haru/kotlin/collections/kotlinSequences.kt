package com.haru.kotlin.collections

import java.lang.StringBuilder

fun main() {
    val list = listOf(1, 2, 3, 4)

    //region + asSequence
    /**
     * like a stream (lazy mode)
     * each element execute all steps one by one
     */
    list.asSequence().filter {
        println("filter: $it")
        it % 2 == 0
    }.map {
        println("map: $it")
        it * 2 + 1
    }.forEach {
        println("forEach: $it")
    } // forEach function is necessary for a stream(Sequence)
    // without "forEach" function, this sequence cannot be executed
    // "forEach" is like a on-off for a sequence

    /**
     * (early mode)
     * all elements execute each step together
     * only when all elements finish this step,
     *  the next step will be executed for all
     */
    list.filter {
        println("filter: $it")
        it % 2 == 0
    }.map {
        println("map: $it")
        it * 2 + 1
    }.forEach {
        println("forEach: $it")
    }//endregion

    // flatMap(transform: (T) -> Iterable<R> or Sequence<R>)
    // both iterable and sequence are ok
    list.flatMap {
        0 until it // IntRange (Iterable)
//        (0 until it).asSequence() // Sequence
    }.joinToString().let(::println)

    list.asSequence().flatMap {
        0 until it // Iterable
//        (0 until it).asSequence() // Sequence
    }.joinToString().let(::println)

    val folded = list.fold(StringBuilder("you**")) {
        acc, i -> acc.append("$i**")
    }
    println(folded)
}