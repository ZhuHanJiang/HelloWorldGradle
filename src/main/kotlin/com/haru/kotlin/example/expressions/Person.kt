package com.haru.kotlin.example.expressions

class Person(val age: Int, val name: String) {
    override fun equals(other: Any?): Boolean {
        val other = (other as? Person) ?: return false
        return other.age == this.age && other.name == this.name
    }

    //different hashcode means definitely different instances
    override fun hashCode(): Int {
        return 1 + 7 * age + 13 * name.hashCode()
    }
}

fun main() {
    val persons = HashSet<Person>()

//    (0..5).forEach {
//        persons += Person(20, "haru")
//    }

    val person = Person(20, "haru")
    persons += person

    // a moment later

//    person.age++
    val person2 = Person(person.age + 1, person.name)
    persons -= person //cannot remove "person"

    /**
     * any values relative to Hashcode calculation and Equals function
     * (and key properties relative to the instance itself)
     * should not be changed anytime during the hashMap or HashSet
     *
     * so use "val" as properties in the class -> not able to be changed
     */

    println(persons.size) // 1
}