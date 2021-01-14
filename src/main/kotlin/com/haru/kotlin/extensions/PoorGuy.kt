package com.haru.kotlin.extensions

class PoorGuy {
    var pocket: Double = 0.0
}

fun PoorGuy.noMoney() {

}

/**
 * property = backing field + getter + setter
 * but in extension methods & interface, property cannot have a backing field
 *
 * extension property belongs to the class itself, a class has no states
 * not like an instance, so a property binding to a class has no field
 */

var PoorGuy.moneyLeft: Double
    get() {
        //return field  //field has to belong to one instance, not a class
        return this.pocket
    }
    set(value) {
        pocket += value
    }

interface Guy {
    /**
     * backing field is a state, storing values
     * getter and setter are methods, a behavior
     */
    var moneyLeft: Double // Property in an interface cannot have a backing field
        get() {
            return 0.0
        }
        set(value) {

        }

    /**
     * in interface, a method can have body
     * BUT it can only be a behavior, cannot operate on any states
     * e.g. storing values or changing values
     */
    fun noMoney() {
        println("No money called. $moneyLeft")
    }
}