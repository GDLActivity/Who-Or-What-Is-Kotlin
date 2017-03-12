package lambda

/**
 * Created by sierisimo on 11/6/16.
 */
fun printSomething(theLambda: (x: Int, y: Int) -> Int) {
    println(theLambda.invoke(1, 3))

    println(theLambda(4, 5))
}

fun doSomething(r: Int, s: Int): Int = r - s

fun main(args: Array<String>) {
    printSomething { x, y -> x + y }

    printSomething({ l, k -> l * k })

    printSomething(::doSomething)

    val listOfInts = listOf("Sier", "Sergio", "Miguel", "Ernesto", "Carla", "Christian", "Sandra", "Dany", "Chacon", "Aeropajita")

    println(listOfInts.filter { it.length > 5 }
            .sortedBy { it }
            .map(String::toUpperCase)
            .filterNot { it.contains("s", true) }
            .filter { it.endsWith(ignoreCase = true, char = 'a') }
            .reduce { s, t -> s + " - - " + t })
}