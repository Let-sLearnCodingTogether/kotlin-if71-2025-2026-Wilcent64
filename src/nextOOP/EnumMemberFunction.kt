package nextOOP

enum class DayOfTheWeek3(val isWeekend: Boolean = false) {
    Senin,
    Selas,
    Rabu,
    Kamis,
    Jumat,
    Sabtu(true),
    Minggu(true);

    fun daysUntil(targetHari: DayOfTheWeek3): Int {
        return if (this.ordinal < targetHari.ordinal) {
            targetHari.ordinal - this.ordinal
        } else {
            targetHari.ordinal - this.ordinal + DayOfTheWeek3.values().count()
        }
    }

    companion object {
        fun today(): DayOfTheWeek3 {
            val today = 0
            return DayOfTheWeek3.values().first { it.ordinal == today }
        }
    }
}

fun main() {
    val today = DayOfTheWeek3.Jumat
    val targetHari = DayOfTheWeek3.Senin

    val sisaHari = today.daysUntil(targetHari)
    println(sisaHari)

    println(DayOfTheWeek3.today())
}