package delegation

import extension.leftpad
import kotlin.properties.Delegates

/**
 * Created by sierisimo on 11/6/16.
 */
interface ImportantMethods {
    fun importantMethod()

    fun someLessImportantMethod(aValue: String): String
}

class ImportantClass() : ImportantMethods {
    override fun importantMethod() {
        println("ImportantClass called an ImportantMethod")
    }

    override fun someLessImportantMethod(aValue: String): String = aValue.leftpad(30, ">")
}

class LessImportant(val importantImpl: ImportantClass) : ImportantMethods by importantImpl

class BankAccount {
    val accountNumber by lazy {
        val numb = (Math.random() * 1000).toInt()
        println("Your account number is: $numb")

        numb
    }

    var balance by Delegates.observable(0.0) { property, oldValue, newValue ->
        println("Your old balance is: $oldValue")
        println("Your new balance is: $newValue")
    }

    override fun toString(): String {
        return "BankAccount<$accountNumber>: $$balance"
    }

    operator fun plus(amount: Double): Double = balance + amount
}

class Animal(map: Map<String, String>) {
    val race by map
    val name by map
    val country by map
}

fun main(args: Array<String>) {
    val anImportantObject = ImportantClass()

    val lessImportantObj = LessImportant(anImportantObject)

    lessImportantObj.importantMethod()
    lessImportantObj.someLessImportantMethod(":D")

    val myAccount = BankAccount()
    println(myAccount)

    myAccount.balance = myAccount + 30.00
    println(myAccount)

    val cangaroo = Animal(mapOf(
            "name" to "Jumper",
            "race" to "Cangaroo",
            "country" to "Australia"
    ))

    println("Animal{name:${cangaroo.name}, race:${cangaroo.race}, country:${cangaroo.country}}")
}