package com.haru.kotlin.advanceFuncIntro

import java.io.File

class Person(var name: String, var age: Int)

fun main() {
    val person = Person("haru", 20)

    // pass "person" as the argument to the inline "let" function
    // returnVal is the return value of lambda expression
    val returnVal = person.let {
        println(it.name)
    }
    person.let(::println)
    println(returnVal)

    // using "person" as the receiver of this inline "run" function
    // not recommend
    // return value is also the return value of lambda expressions
    person.run {
        println(this.name)
    }
    person.run(::println)

    // same usage as "let" function
    // it returns the input argument "person" itself
    val person2 = person.also {
        it.name = "hhh"
    }
    println("${person.name} ${person2.name}")
    println("$person | $person2")

    // same usage as "run" function
    // return the receiver "person" itself
    val person3 = person.apply {
        name = "xxx" //"name" is directly name of "person"(this)
    }
    println("${person.name} | ${person2.name} | ${person3.name}")
    println("$person | $person2 | $person3")


    /**
     *  .use() function is used for Closeable Class
     *  help to deal with all exceptions and
     *  close the instance automatically
     */
    File("build.gradle").inputStream().reader().buffered()
        .use {
            println(it.readLines())
        }
}