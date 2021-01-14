package com.haru.kotlin.example

// simple calculator
/**
 * input: 3 * 4
 */
fun main(vararg args: String) { //main function return <Unit>
    if (args.size < 3) {
        return showHelp() //showHelp() return <Unit>
    }

    val operators = mapOf(
        "+" to ::plus, //map from string to function reference
        "-" to ::minus,
        "*" to ::times,
        "/" to ::divide
    )

    val op = args[1]
    val opFunc = operators[op] ?: return showHelp() //if return null, go to showHelp()
    // opFunc is a function reference, we can directly run corresponding
    // function by calling opFunc(arg0, arg1)

    try {
        println("Input: ${args.joinToString(" ")}")
        println("Output: ${opFunc(args[0].toInt(), args[2].toInt())}")
        // directly using target function
    } catch (e: Exception) {
        println("Invalid Arguments")
        showHelp()
    }
}

fun plus(arg0: Int, arg1: Int): Int{
    return arg0 + arg1
}
fun minus(arg0: Int, arg1: Int): Int{
    return arg0 - arg1
}
fun times(arg0: Int, arg1: Int): Int{
    return arg0 * arg1
}
fun divide(arg0: Int, arg1: Int): Int{
    return arg0 / arg1
}

fun showHelp() {
    println("""
        
        Simple Calculator:
            input: 3 * 4
            output: 12
    """.trimIndent())
}