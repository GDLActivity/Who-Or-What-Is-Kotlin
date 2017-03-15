package generics

import java.io.Serializable

/**
 * We know that sometimes we need generics, java have them and you can use them in Kotlin as well as in Java:
 */
class BaseWorker<T>

/**
 * And you can specify bounds, as well as you can in java, with the difference that only upper bounds are allowed,
 * this is similar to only allow <? extends Foo>. This is mainly because it only makes sense in class definition.
 */
class Fabric<T, W : BaseWorker<T>> // <-- Let's create a Fabric of "T" with "W" type of workers as long
                                    //     as they know how to work with "T"

//And when you need multiple bounds, you need to use the where clausule:
class Company<T> where  T: Cloneable,
                        T: Serializable,
                        T: Runnable
/**
 * But there's a problem with all this, the producer-consumer problem.
 *
 * You cannot use a List<String> as List<Object> because it creates runtime exceptions.
 *
 * But sometimes you need to define functions that allow you to read from a source and maybe you want to store it
 * as an abstract type, like:
 *
 * void elements(List<ReferenceImplementations> rList){
 *  List<ReferenceInterface> myList = rList;
 *  ...
 * }
 *
 * This is not valid in Java, but in kotlin we can specify that it's only used as producer using "out":
 */
abstract class Vehicle

class Car : Vehicle()

class Truck : Vehicle()

abstract class Garage<out T : Vehicle> {
    abstract fun showCar(): T
}

fun workElements(rList: Garage<Car>) {
    val myReferences: Garage<Vehicle> = rList // <-- this is valid because T was defined as out.
    //     so you won't have problems taking elements from there, because
    //     they all will be only produced, not consumed.
}

/**
 * The same works for methods when you have a consumer. But you have to use the word "in"
 */
abstract class HighWay<in T : Vehicle> {
    abstract fun tax(vehicle: T)
}

fun travel(route: HighWay<Vehicle>) {
    route.tax(Car())

    val finalHighWay: HighWay<Truck> = route
}

/**
 * And you can also use extension functions on generics.
 */
fun <T> T.capitalizeToString() {

}

fun <T> doInterestingThings(someObject: T){
    someObject.capitalizeToString()
}
