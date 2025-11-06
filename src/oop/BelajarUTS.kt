package oop

class BelajarUTS {
    companion object {
        fun salam() = "Halo dari companion object!"
    }
}

fun main() {
    //1
    println(BelajarUTS.salam()) // bisa dipanggil langsung tanpa membuat objek

    //2
    val nama: String? = null        // variabel nullable
    val hasil = nama ?: "Tanpa Nama" // jika null, pakai "Tanpa Nama"
    println(hasil)

    //3
    val daftarNama = listOf("Ani", "Budi", "Ani")   // List boleh duplikat
    val setNama = setOf("Ani", "Budi", "Ani","Evi")       // Set otomatis hapus duplikat

    println(daftarNama) // [Ani, Budi, Ani]
    println(setNama)    // [Ani, Budi]
}
