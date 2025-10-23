package oop

class PersegiPanjang(val Panjang : Double, val Lebar : Double){
    val Luas : Double
            get() = Panjang * Lebar

}

fun main() {
    val persegiPanjang = PersegiPanjang(8.0, 9.0)
    println(persegiPanjang.Luas)
}