package com.haru.kotlin.delegates.eg

import java.io.File
import java.io.FileInputStream
import java.lang.Exception
import java.net.URL
import java.util.*
import kotlin.reflect.KProperty

class PropertiesDelegate(private val path: String, private val defaultValue: String = "") {
    private lateinit var url: URL
    // filepath is a URL

    // Properties: HashTable<String, String>
    // properties can uses Delegate "lazy" to load config file
    private val properties: Properties by lazy {
        val prop = Properties()
        url = try {
            javaClass.getResourceAsStream(path).use {
                prop.load(it) // read property lists
            }
            javaClass.getResource(path) // return URL
        } catch (e: Exception) {
            try {
                ClassLoader.getSystemClassLoader().getResourceAsStream(path).use {
                    prop.load(it)
                }
                ClassLoader.getSystemClassLoader().getResource(path)
            } catch (e: Exception) {
                FileInputStream(path).use {
                    prop.load(it)
                }
                URL("file://${File(path).canonicalPath}")
            }
        }

        prop
    }

    // create read & write functions for any property (property delegated) in val "properties"
    operator fun getValue(thisRef: Any?, property: KProperty<*>): String {
        return properties.getProperty(property.name, defaultValue)
    }
    operator fun setValue(thisRef: Any?, property: KProperty<*>, value: String) {
        properties.setProperty(property.name, value)
        File(url.toURI()).outputStream().use {
            properties.store(it, "Hello!")
        }

    }
}

// "prop" is the delegate (able to delegate any property)
abstract class AbsProperties(path: String) {
    // "protected": make sure all children classes can use "prop" val directly
    protected val prop = PropertiesDelegate(path)
}

class Config: AbsProperties("Config.properties") {
    var author by prop
    var version by prop
    var desc by prop
}

fun main() {
    val config = Config()
    println("""author=${config.author}
        |version=${config.version}
        |desc=${config.desc}""".trimMargin())

    config.author = "Jiang"
    println("""author=${config.author}
        |version=${config.version}
        |desc=${config.desc}""".trimMargin())
    config.desc="new demo"

}