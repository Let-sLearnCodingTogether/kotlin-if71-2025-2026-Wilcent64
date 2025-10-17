package oop

class MahasiswaThisKeyWord(val nama : String){
    fun sayGoodBye(nama: String){
        println("$nama : ${this.nama}")
    }
}

fun main() {
    val mahasiswaPertama = MahasiswaThisKeyWord(
        nama = "Mahasiswa Pertama"
    )
    mahasiswaPertama.sayGoodBye("Mahasiswa 1")
}