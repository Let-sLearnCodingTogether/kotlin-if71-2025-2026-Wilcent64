package nextOOP

enum class DayOfTheWeek{
    Senin,
    Selas,
    Rabu,
    Kamis,
    Jumat,
    Sabtu,
    Minggu
}

fun main() {
    val days = DayOfTheWeek.values()

    days.forEach {
        println("${it.ordinal}.${it.name}")
    }
    println(DayOfTheWeek.valueOf("Senin"))
//    println(DayOfTheWeek.valueOf("senin"))

    val today =  DayOfTheWeek.valueOf("Senin")

    when(today){
        DayOfTheWeek.Senin -> println("Yah, senin lagi")
        DayOfTheWeek.Selas -> println("Yah, senin lagi")
        DayOfTheWeek.Rabu -> println("Yah, senin lagi")
        DayOfTheWeek.Kamis -> println("Yah, senin lagi")
        DayOfTheWeek.Jumat -> println("Yah, senin lagi")
        DayOfTheWeek.Sabtu -> println("Yah, senin lagi")
        DayOfTheWeek.Minggu -> println("Yah, senin lagi")
    }
}