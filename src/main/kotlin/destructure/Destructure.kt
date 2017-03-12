package destructure

/**
 * Created by sierisimo on 11/7/16.
 */
fun workWithList() {
    val list = listOf(1, 3, 5, 7, 9, 11, 13, 15, 17)
    val (first, second) = list
    println(first)
    println(second)
}

fun workWithMap(){
    val map = mapOf("name" to "sier","age" to "26", "nationality" to "mexican")

    for ((key, value) in map){
        println("Map<$key>: $value")
    }

    println("This person was ${map["name"]}")
}

fun main(args: Array<String>) {
    workWithList()
    workWithMap()
}