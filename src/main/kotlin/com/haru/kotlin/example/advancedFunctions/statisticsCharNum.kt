package com.haru.kotlin.example.advancedFunctions

/**
 * this program reads a file
 * and counts the number of each character
 */

import java.io.File

fun main() {
    /**
     * like a stream
     * do each function one by one
     */
    File("build.gradle") // create file instance
        .readText() // 1. read file text, as a string
        .toCharArray() // 2. transform string to char array
        .filterNot {
            it.isWhitespace() // 3. filter chars are not white space
            // .filterNot(Char::isWhitespace)
            // .filter{!it.isWhitespace()}
        }.groupBy {
            it // 4. group the char array by each char's value
            // Map<char, list of char>
        }.map {
            it.key to it.value.size // 5. map each entry to a Pair<key, size>
        }.let {
            println(it)
        }

//        .let {
//            println(it)
//            it.forEach { (c, list) ->
//                println("$c: ${list.size}")
//            }
//        }
}