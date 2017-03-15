package operators

import org.junit.After
import org.junit.Assert.*
import org.junit.Before
import org.junit.Ignore
import org.junit.Test

class WomanTest {
    lateinit var woman: Woman

    @Before
    fun setUp() {
        woman = Woman("Julia", "Lang")
    }

    @Test
    fun test_plus() {
        val man = Man("Pascal", "Math")
        val baby = woman + man

        assertEquals("Check baby name is... 'baby'", "Baby", baby.name)
    }
}
