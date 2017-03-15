package operators

import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.describe
import org.jetbrains.spek.api.dsl.it
import org.jetbrains.spek.api.dsl.on
import org.junit.Assert.assertTrue

object WomanSpek : Spek({
    describe("Simple test of Woman class") {
        val woman = Woman("Ada", "Lovelace")

        on("sum") {
            val man = Man("John", "Does")

            it("Should create a baby") {
                val possibleBaby = woman + man
                assertTrue("Check it's a baby!", possibleBaby is Baby)
            }
        }
    }
})

