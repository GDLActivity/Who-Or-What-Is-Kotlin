package operators

import org.junit.After
import org.junit.Assert.*
import org.junit.Before
import org.junit.Ignore
import org.junit.Test

class WomanTest {
    lateinit var woman: Woman
    lateinit var baby: Baby
    lateinit var man: Man

    @Before
    fun setUp() {
        println("Before")
        woman = Woman("Julia", "Lang")
        man = Man("Pascal", "Math")
        baby = Baby("Baby", "Math", "Lang")
    }

    @After
    fun tearDown() {
        println("Finished")
    }

    @Ignore
    @Test
    fun test_plus() {

    }

    @Test
    fun test_getName() {
        assertEquals("Check that woman name is Julia", "Julia", woman.name)
        assertNotEquals("Name shouldn't be Pascal", "Pascal", woman.name)
    }

}
