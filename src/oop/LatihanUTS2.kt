package oop

class Karyawan(val nama : String, val id : String, val gajiPokok : Double){
    fun tampilkanProfil(): Unit{
        println("$nama $id")
    }
    fun hitungGajiBulanan(jumlahMasukKerja : Int): Double {
        val hitung = jumlahMasukKerja/22.0 * gajiPokok
        return hitung
    }
}

fun main() {
    val karyawanA = Karyawan("Wilcent", "2226250120", 5.0)
    val karyawanB = Karyawan("Tom", "2226250122", 4.0)

    karyawanA.tampilkanProfil()
    println("Gaji Bulanan : Rp${karyawanA.hitungGajiBulanan(20)}")
    println()
    karyawanB.tampilkanProfil()
    println("Gaji Bulanan : Rp${karyawanB.hitungGajiBulanan(19)}")
}
