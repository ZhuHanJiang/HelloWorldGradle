package com.haru.kotlin.operators

fun main() {
    println("HelloWorld" rotate 5)

    val book = Book()
    val desk = Desk()
    book on desk
}

// infix fun Receiver.extensionFunctionName(only one argument): ReturnClassName{}
infix fun String.rotate(count: Int): String {
    val index = count % length
    return this.substring(index) + this.substring(0, index)
}

class Book
class Desk

infix fun Book.on(desk: Desk) {

}
