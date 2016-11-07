package npe

import classes.Meme

/**
 * Created by sierisimo on 11/6/16.
 */
fun main(args: Array<String>) {
    val notDoge: Meme? = null

    notDoge?.createdAt.let(::println)

    notDoge?.name.let(::println)

    val aNullObject: ClassWithNull? = ClassWithNull(FullName(null, "Violencia"), null)

    println(aNullObject?.name?.firstName)
    println(aNullObject?.name?.lastName)

    // Throw a NPE (NullPointerException
    aNullObject?.name?.firstName!!.let { println(it.length) }

    val neverNull: String = canReturnOrNot() ?: "Did not returned"

    println(neverNull)
}

data class FullName(var firstName: String?, var lastName: String?)

data class ClassWithNull(var name: FullName?, var age: Int?)


fun canReturnOrNot(): String? =
        if (Math.random().toInt() % 2 == 0)
            "Returned"
        else
            null