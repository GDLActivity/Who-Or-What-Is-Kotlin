/**
 * Created by sierisimo on 3/11/17.
 */

fun mutabilityAndImmutability() {
    //First things first, in Kotlin you have to types of data
    // val <- Read Only
    // var <- Read and Write
    val godzilla = Monster("Godzilla", 100)
    //godzilla.name = "Jorge" <<-- Won't compile
    godzilla.age = 101

    //This means that once asigned a value to a "val" it shouldn't change.
    // But actually it can change, you don't have it for sure, at least you can't write it.
    // One way that it could change is via getter. Look at the monster.anger, you can see that
    // it possibly be different every time you access it.
    // This shows that `val` is not "immutable", it's only "read only".
    val monsterAnger = godzilla.anger

    //When working with java, you don't have a way to have for sure that some objects couldn't mutate while being used.
    //this means that you can pass a map around functions and suddenly have an empty map because someone called `Map.clear`
    //on the map that you tougth contained all the info.

    //Kotlin tries to give a solution to this using immutable and mutable collections.
    val map = mapOf("sier" to 3, "ernesto" to 42)
    val mutableMap = mutableMapOf("jhon" to 45, "does" to 90)

    //So, immutable collections don't have methods for modifying
    mutableMap.put("rofl", 13)
    //map.put("nope", 50) // <- Won't compile, method doesn't exist on the type

    //The most you can do with immutable collections is create new collections with the content
    //plus new elements
    val newMap = map.plus(Pair("uncle", 52))
    //But the result is still an immutable colelction.
    //newMap.put() <<<-- Error.
}

class Monster(val name: String, var age: Int) {
    val anger: Int
        get() = Math.floor(Math.random() * 10).toInt()
}
