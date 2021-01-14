package sams

fun main() {
    val eventManager = EventManager()

    //inorder to make sure the add operation and the remove operation
    // are done on the same object
    // to make sure the val "onEvent" belongs to the target Java interface
    val onEvent = EventManager.OnEventListener {
        println("OnEvent: $it")
    }

    eventManager.addOnEventListener {
        println("OnEvent $it")
    }
    eventManager.addOnEventListener(onEvent)

    eventManager.removeOnEventListener {
        println("OnEvent $it")
    } // useless, create a new OnEventListener in SAM transformation
    eventManager.removeOnEventListener(onEvent) // useful on removing onEvent


}