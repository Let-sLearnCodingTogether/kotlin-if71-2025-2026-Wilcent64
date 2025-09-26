fun varargParameter(vararg angka: Int) {
    println("Jumlah angka: ${angka.size}")
    for (i in angka) {
        println("Angka: $i")
    }
}
fun main() {
    varargParameter(1, 2, 3, 4, 5)

    val angkaArray = intArrayOf(10, 20, 30, 40)
    varargParameter(*angkaArray)
}
