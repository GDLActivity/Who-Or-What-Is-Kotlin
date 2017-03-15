import org.junit.Test

import org.junit.Assert.*

/**
 * Created by sierisimo on 3/15/17.
 */
class MonsterTest {
    @Test
    fun test_getAnger() {
        val monster = Monster("Kong", 60)
        assertTrue("Bigger than 0", monster.anger > 0)
        fail(monster.anger.toString())
    }

}
