package com.haru.kotlin.sams

fun main() {
    /**
     * submit() can only receive Invokable object
     * because Invokable is a Kotlin Interface
     * SAM transform is not available for a kotlin interface
    **/
    submit{
        println("pass lambda function as the argument \n" +
                "recommended operation in Kotlin")
    }

    submitRunnable{
        println("run in executor")
    }
}

fun submitRunnable(runnable: Runnable) {
    runnable.run()
}

fun submit(invokable: Invokable) {
    invokable.invoke()
}

typealias FunctionX = () -> Unit
fun submit(lambda: FunctionX) {
    lambda()
}

interface Invokable {
    fun invoke()
}
