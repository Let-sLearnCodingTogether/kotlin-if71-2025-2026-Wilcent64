fun main() {
    val NAMA_PETUALANG = "Wilcent"
    val KAPASITAS_TAS = 20.0
    var totalBeratBawaan = 0.0
    var i = 1

    while (i <= 3) {
        println("Masukkan Nama Barang : ")
        val namaBarang = readln()

        println("Masukkan Berat Barang : ")
        val beratBarang = readln().toDoubleOrNull() ?: 0.0

<<<<<<< Updated upstream
<<<<<<< Updated upstream
        if (beratBarang != 0.0) {
            totalBeratBawaan += beratBarang
        }
=======
//        if (beratBarang != 0.0) {
//            totalBeratBawaan += beratBarang
//        }
>>>>>>> Stashed changes
=======
//        if (beratBarang != 0.0) {
//            totalBeratBawaan += beratBarang
//        }
>>>>>>> Stashed changes

        if (totalBeratBawaan > KAPASITAS_TAS) {
            println("Bahaya! Kelebihan muatan! Berat saat ini: $totalBeratBawaan kg. Kapasitas hanya $KAPASITAS_TAS kg.")
            break
        } else if (totalBeratBawaan == KAPASITAS_TAS) {
            println("Optimal! Tas milik $NAMA_PETUALANG sekarang penuh dengan sempurna.")
            break
<<<<<<< Updated upstream
<<<<<<< Updated upstream
=======

>>>>>>> Stashed changes
=======

>>>>>>> Stashed changes
        } else {
            val sisaKapasitas = KAPASITAS_TAS - totalBeratBawaan
            println("Barang '$namaBarang' berhasil dimasukkan. Sisa kapasitas tas: $sisaKapasitas kg")
        }
        i++
    }
}