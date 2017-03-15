package functions

import org.junit.Assert.assertEquals
import org.junit.Assert.assertNotEquals
import org.junit.Test

/**
 * Created by sierisimo on 3/11/17.
 */
class FunctionsKtTest {
    @Test
    fun testAdd() {
        assertEquals("Check result from adding", 5, add(2, 3))
        assertEquals("Check result from adding", 5, add(-2, 7))
    }

    @Test
    fun testBuildAdd(){
        val add3 = buildAddByFunction(3)
        assertEquals("Check calling actually adds 3", 6, add3(3))
        assertEquals("Check calling actually adds 3", 9, add3(6))
        assertEquals("Check calling actually adds 3", 12, add3(9))
        assertNotEquals("Check calling actually adds 3", 12, add3(1))

        val add5 = buildAddByFunction(5)
        assertEquals("Check calling actually adds 3", 6, add5(1))
        assertNotEquals("Check calling actually adds 3", 1.8, add3(6))
        assertEquals("Check calling actually adds 3", 1.8, add3(6))
    }
}
