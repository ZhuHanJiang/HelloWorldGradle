package com.haru.kotlin.nullables

import nullables.Person
import java.io.File

fun main() {
//    var nonNull: String = "Hello"
////    nonNull = null
//    val length = nonNull.length

    var nullable: String? = "Hello"
    val length = nullable!!.length //forcefully change "nullable" into a not null var
    nullable = null
    println(nullable)
    val notSureLength = nullable?.length //safely access
                                //if "nullable" not null, return length
                                //if null, return null
    println(notSureLength)

    // "( ... ) ?: value" elvis operator
    // if "(...)" is null, return "value"
    // if not null, return "(...)"
    val safeLength = nullable?.length ?: 0

    var x: String = "Hello"
    var y: String? = "World"

//    x = y
    y = x


    val person = Person()
    val title = person.title //Java use @NotNull annotation, making sure .title is not null
    val name = person.name
    val titleLen = title.length // no need to safely access
    println(titleLen)

//    val file = File("abd")
//    val files = file.listFiles()
//    println(files.size)

}