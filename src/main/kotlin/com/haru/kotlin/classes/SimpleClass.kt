package com.haru.kotlin.classes

open class SimpleClass(var x: Int, val y: String)
    :AbsClass(), SimpleInf{
    val z: Long = 0L
    fun zzz(string: String) {
        println(string)
    }

    override fun absMethod() {
        TODO("Not yet implemented")
    }

    //all properties can define its own setter and getter
    // this is a readable only val, so only getter
    override val simpleProperty: Int
        get() {
            return 2
        }

    override fun simpleMethod() {
        TODO("Not yet implemented")
    }

    //if set final, children classes cannot override this method anymore
    final override fun overridable() {
        super.overridable()
    }

}