package classes

import java.util.*

/**
 * Created by sierisimo on 11/6/16.
 */
data class Person(val id: Long, val name: String, val age: Int)

data class Kid(val name: String, val surname: String) {
    constructor(name: String) : this(name, "")

    constructor() : this("", "")
}

data class Dog(val name: String, val age: Int) {
    fun barf() {
        println("Barf!")
    }
}

open class Doggo(val name: String) {

}

class ShibaInu(name: String, var isDoge: Boolean) : Doggo(name) {
    fun beMeme() {

    }
}

class Meme {
    public var name = ""
    public var createdAt: Date = Date()
    public var isFamous = false
}

fun main(args: Array<String>) {
    val lenny = Person(1L, "Lenny Leonard", Calendar.getInstance().get(Calendar.YEAR) - 1971)

    val charlieBrown = Kid("Charlie", "Brown")
    val milhouse = Kid("Milhouse")

    val thatKid = Kid()

    val root = Dog("Root, perrita desastre", 1)
    val notRoot = Dog("Root, perrita desastre", 2)

    println(lenny)
    println(charlieBrown)
    println(milhouse.hashCode())
    println(thatKid.hashCode())

    println(root == notRoot)

    val pepeLeFrog = Meme()
    println(pepeLeFrog.createdAt)

    pepeLeFrog.isFamous = true
}