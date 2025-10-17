package oop

//Imutable dan mutable
class MahasiswaContructor(
    val npm: String,
    val nama: String,
    var ipk: Float
)

fun main() {
    val mahasiswaPertama = MahasiswaContructor(
        "202428250090",
        "Mahsiswa 1",
        1.3f
    )
    println(mahasiswaPertama.npm)
    println(mahasiswaPertama.nama)
    println(mahasiswaPertama.ipk)

    mahasiswaPertama.ipk = 1.2f
    println(mahasiswaPertama.ipk)
}