package com.haru.kotlin.classConstructors

class Person(var age: Int, var name: String, defaultName: String) {
    init {
        name = defaultName
    }

}