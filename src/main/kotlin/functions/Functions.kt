package functions

/**
 * Creating functions is pretty easy.
 *
 * You just need to create a function...
 * yeah, sounds stupid, but trust me, it's not hard, create it with:
 */
fun mySpecialFunction() {
}

/**
 * Even you can create functions that does one fast thing with:
 */
fun sayHi() = println("Hi!")

/**
 * Functions can have parameters and return types, think on functions as if they
 * were "static methods" BUT without using a class to call them.
 *
 * So, intead of:
 *      SomeUtilityClass.someMethod()
 * You can say:
 *      someFunction()
 *
 */
fun multiplyByTwo(x: Int): Int {
    return x * 2
}

/**
 * But more cooler than that, is that you can have functions with default value for his parameters
 */
fun sayHiTo(name: String = "Mr. Nobody") {
    println("Hi $name!")
}

fun testSayHiTo(){
    sayHiTo()
    sayHiTo("Sier")
}

/**
 * Additionally, you can use this functions as arguments to other functions
 */
fun sayAndMultiply(somethingToSay: () -> Unit, multiplyBySomething: (Int) -> Int) {
    somethingToSay()
    multiplyBySomething(5)
}

fun testSayAndMultiply() {
    sayAndMultiply(::sayHi, ::multiplyByTwo)
}

/**
 * And even we can return functions (yeah, that's not very readable at first, but it can lead to
 * awesome implementations
 */
fun add(a: Int, b: Int): Int = a + b

fun buildAddByFunction(x: Int): (y: Int) -> Int {
    fun addByX(y: Int): Int {
        return add(x, y)
    }

    return ::addByX
}

/**
 * Additionally, you can create functions that once they are passed as parameter they are
 * "inlined" this means that the compiler will took the actual body of the function and put it in
 * the final bytecode of the caller.
 * This helps to improves mostly when using lambdas, but the counterpart is that it will make final
 * bytecode bigger.
 *
 * for example the next function, will result in something similar to:
 *
 * fun testATalkingFunction() {
 *      println("I'm a function :D")
 *      println("And I'm a lambda!!")
 *      println("Bye")
 * }
 *
 * This also give the advantage that you can return from lambdas, killing the callback hell (well... partially)
 *
 */
inline fun aTalkingFunction(anotherFunction: () -> Unit) {
    println("I'm a function :D")
    anotherFunction()
    println("Bye")
}

fun testATalkingFunction() {
    aTalkingFunction { println("And I'm a lambda!!") }
}
