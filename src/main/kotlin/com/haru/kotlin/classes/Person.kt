package com.haru.kotlin.classes

class Person(age: Int, name: String) {
    var age: Int = age //property
        get() {
            return field //property's value
        }
        set(value) {
            println("setAge: $value")
            field = value
        }

    var name: String = name
        get() {
            return field //backing field
        }
        set(value) {
            field = value
        }
}

fun main() {
    val ageReference = Person::age
    val person = Person(18, "haru")
    val nameReference = person::name //bind nameReference to instance "person"

    ageReference.set(person, 24) //not bind to any instance, just use class's name and method
                                // so we need to specify the receiver
    nameReference.set("hello") // already bind the instance "person",
                                // not need to pass receiver's name anymore
    nameReference.get()
}
