package OperatorOverlodingAndConvention


data class MANA(var current: Int, var max: Int) {

    operator fun plus(other: MANA): MANA {
        val newCurrent = this.current + other.current
        val newMax = maxOf(this.max, other.max)
        return MANA(newCurrent, newMax)
    }

    operator fun inc(): MANA {
        val newCurrent = (this.current + 10).coerceAtMost(this.max)
        return MANA(newCurrent, this.max)
    }

    operator fun minus(value: Int): MANA {
        val newCurrent = (this.current - value).coerceAtLeast(0)
        return MANA(newCurrent, this.max)
    }
}

fun main() {
    var mana1 = MANA(50, 100)
    var mana2 = MANA(20, 150)

    println(mana1 + mana2)
    mana1++
    println(mana1)
    println(mana1 - 30)
}