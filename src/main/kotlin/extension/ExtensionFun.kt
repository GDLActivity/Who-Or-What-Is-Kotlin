package extension

/**
 * Created by sierisimo on 11/6/16.
 */
val cache = mutableListOf("",
        " ",
        "  ",
        "   ",
        "    ",
        "     ")

fun String.leftpad(size: Int, char: String = " " /*`char` defaults to `' '`*/): String {
    // `len` is the `pad`'s length now
    var len: Int = size - length

    if (len > 0) {
        return if (char == " " && len < cache.size) {
            // cache common use cases
            cache[len] + this
        } else if (char == " " && len > cache.size) {
            // If len is not cached, put it on the cache
            while (len >= cache.size) cache.add(cache[cache.size - 1] + " ")

            // now a cache common use case
            cache[len] + this
        } else {
            // `pad` starts with an empty string
            var pad = ""

            // mutable string
            var ch = char

            while (true) {
                // add `ch` to `pad` if `len` is odd
                if (len % 2 == 1) {
                    pad += ch
                }

                // divide `len` by 2, ditch the remainder
                len /= 2
                if (len > 0) {
                    // "double" the `ch` so this operation count grows logarithmically on `len`
                    // each time `ch` is "doubled", the `len` would need to be "doubled" too
                    // similar to finding a value in binary search tree, hence O(log(n))
                    ch += ch
                } else break  // `len` is 0, exit the loop
            }

            // return the new created string
            pad + this
        }
    } else {
        // doesn't need to pad
        return this
    }
}

fun Int.divideByTwo(): Int {
    return this / 2
}

fun String.leftpad(size: Int, value: Any): String = this.leftpad(size, value.toString())

fun main(args: Array<String>) {
    val word = "Perrito"

    println(word.leftpad(10))
    println(word.leftpad(20, "-"))

    println("GDLActivity".leftpad(20))
    println("GDLActivity".leftpad(30, ""))

    println(5.divideByTwo())
}
