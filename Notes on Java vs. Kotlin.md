# Notes on Java vs. Kotlin

1. it's more verbose than many languages
   1. Solution: Kotlin removes type declaration and has type inference
   2. Solution: Kotlin autocasting removes parts
   3. Solution: Kotlin removes some reserved words allowing more focus on the actual code.
   4. Solution: Most classes are final and public by default
2. requires you to create a class for everything,
   1. Solution: Functions!
   2. Solution: Constants!
   3. Solution: Extension Functions!
3. POJO's, Getters/Setters
   1. Solution: Data Class
4. Lambdas in Java 8 are only for functional interfaces...
   1. Solution: Lambdas in Kotlin
5. Every object has **hashCode** and **equals** inherited from Object
   1. Solution: Data Class
6. Singleton and Globals - This patterns helps to hold a single instance of an object, maybe this isn't a problem of Java by itself, but it's common to use it to hold Utility functions or hold methods that depends on state but you don't need a full class, also `public static final ...` are frequently holded as global variables and used in a container class...
   1. Solution: `const val`
   2. Solution: `object ` and companion objects.
7. Access to public members and mutabillity
   1. Solution: val word
   2. Solution: mutable and immutable collections.
8. NullPointerException
   1. Solution: No null unless specified
   2. Solution: Elvis Operator
9. No operator overload
   1. Solution: Operators overloading (shortcut to functions)
10. Noun-orientedness - By design, Java encourages programmers to think of a programming solution in terms of nouns (classes) interacting with each other, and to think of verbs (methods) as operations that can be performed on or by that noun. Many argue that this causes an unnecessary restriction on language expressiveness because a class can have multiple functions that operate on it, but a function is bound to a class and can never operate on multiple types.
   1. Solution: Functions!
11. Literals over arrays and maps.