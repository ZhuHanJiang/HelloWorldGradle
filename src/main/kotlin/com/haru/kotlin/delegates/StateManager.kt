package com.haru.kotlin.delegates

import kotlin.properties.Delegates
import kotlin.reflect.KProperty

/**
 * if you want to delegates on property,
 * implementing "ReadWriteProperty" interface is not necessary.
 * You only need to realize getValue() and setValue() functions
 * that delegate getter and setter
 */

class StateManager {
    /**
     * Delegates.observable() creates a new object to delegate property "state"
     * it returns a "ObservableProperty" instance
     * having setValue() and getValue() functions to delegate setter and getter
     */
    var state: Int by Delegates.observable(0) {
        property, oldValue, newValue ->
        println("$property changed from $oldValue to $newValue")
    }
}

class Foo {
    val x: Int by X()
    var y: Int by Y()
}

class X {
    // delegating a getter format (fixed):
    // "operator fun getValue(thisRef: Any?, property: KProperty<*>): returnClassName { return valueYouWant }"
    operator fun getValue(thisRef: Any?, property: KProperty<*>): Int {
        return 2
    }
}

class Y {
    operator fun getValue(thisRef: Any?, property: KProperty<*>): Int {
        return 3
    }

    operator fun setValue(thisRef: Any?, property: KProperty<*>, value: Int) {
        println(value)
    }

}

fun main() {
    val stateManager = StateManager()
    stateManager.state = 3
    stateManager.state = 4

    val foo = Foo()
    println(foo.x) //X getValue()
    foo.y = 10 // Y.setValue()
    println(foo.y) //Y.getValue()
}