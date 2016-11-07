package operators

/**
 * Created by sierisimo on 11/6/16.
 */
data class Woman(val name: String, val lastName: String) {
    operator fun plus(man: Man): Baby {
        return Baby("Baby", man.lastName, lastName)
    }
}

data class Man(val name: String, val lastName: String) {
    operator fun plus(woman: Woman): Baby = Baby("Baby", lastName, woman.lastName)
    operator fun plus(man: Man): Love {
        if (Math.floor(Math.random()).toInt() % 3 == 0) {
            return Love("Gay")
        } else {
            return Love("Hobbie")
        }
    }
}

data class Baby(val name: String, val lastName: String, val surName: String)

data class Love(val whatsFor: String)