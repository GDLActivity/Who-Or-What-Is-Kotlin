package classes

import java.util.*

/**
 * Created by sierisimo on 11/6/16.
 *
 */

/**
 * This is a class, this is an example on how to create a famous "Java Bean",
 * it contains methods:
 *
 * - equals
 * - toString
 * - hashcode
 *
 * As well as constructor with parameters, this is equivalent to have:
 *
 * public Person(long id, String name, int age){
 *  this.id = id
 *  this.name = name
 *  this.age = age
 * }
 *
 */
data class Person(val id: Long, val name: String, val age: Int)

/**
 * If we want to have more than one constructor we can do it using the reserved word: constructor
 *
 * we can have a lot of constructors, but each one has to call the originally declared constructor.
 *
 */
data class Kid(val name: String, val surname: String) {
    constructor(name: String) : this(name, "") // Call the main constructor but passing an empty argument as 'surname'

    constructor() : this("", "") // We don't care about the data on this object, that's why we pass empty strings
}

/**
 * By default, a data class doesn't have methods, only accesors (getters and setters for every property)
 * The properties for this kind of classes by default are private final, but you can modify the behavior if you want.
 */
data class Dog(val name: String, val age: Int) {
    /**
     * But we can create functions on the body of the class and now we can have methods!
     */
    fun barf() {
        println("Barf!")
    }
}

/**
 * If we want to let other classes extend from a class, we must declare our class open
 */
open class Doggo(val name: String) {

}

/**
 * With that in mind, we can create a class that holds new properties and pass old properties to the super class.
 *
 * The properties marked with "var" are declared only private BUT NOT final.
 */
class ShibaInu(name: String, var isDoge: Boolean) : Doggo(name) {
    fun beMeme() {

    }
}

/**
 * If we want to keep similar structure that java, we can omit the constructor.
 *
 */
class Meme {
    public var name: String
    public var createdAt: Date = Date() // We can initialize the properties on declaration
    public var isFamous: Boolean

    /**
     * Or use the "init" function that is a kind of constructor/initializer (duh!)
     */
    init {
        name = ""
        isFamous = false
    }
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