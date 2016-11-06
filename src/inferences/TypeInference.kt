package inferences

/**
 * Created by sierisimo on 11/6/16.
 */


fun main(args: Array<String>) {
    // Explicit declaration of the type
    val name: String = "Sierisimo Sier"

    // Inference of the type
    val alsoAName = "Sinuhe J. Valencia"

    // Explicit
    val number: Long = 900000

    // Inference
    val anotherNumber = 90000L

    // Explicit:
    val chakonder: GDLActivityUser = GDLActivityUser()

    // Inference:
    val anotherChacon = GDLActivityUser()
}

class GDLActivityUser {
    val name = "Jesus"
    val lastName = "Chacon"
}