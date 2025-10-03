fun main() {
    println("--- 1. Inisialisasi Data ---")

    val daftarJudulBuku = listOf(
        "Laskar Pelangi",
        "Bumi Manusia",
        "Filosofi Teras",
        "Laskar Pelangi"
    )
    println("List judul buku berhasil dibuat (mengandung duplikat).")

    val koleksiGenre = setOf(
        "Novel",
        "Filsafat",
        "Sejarah",
        "Novel"
    )
    println("Set genre berhasil dibuat (hanya berisi nilai unik).")

    val inventarisBuku: MutableMap<String, String> = mutableMapOf(
        "978-602-03-8591-6" to "Laskar Pelangi",
        "978-979-3062-79-2" to "Bumi Manusia",
        "978-602-06-3534-7" to "Filosofi Teras"
    )
    println("Map inventaris buku berhasil dibuat (key unik).")

    println("----------------------------------\n")

    println("--- 2. Manipulasi dan Analisis Data ---")

    val isbnDicari = "978-979-3062-79-2"
    val judulDitemukan = inventarisBuku[isbnDicari]
    println("Judul buku dengan ISBN $isbnDicari adalah: $judulDitemukan")

    // Tambahkan buku baru menggunakan infix function
    val bukuBaru = "978-623-91289-8-2" to "Atomic Habits"
    inventarisBuku[bukuBaru.first] = bukuBaru.second
    println("Buku baru 'Atomic Habits' berhasil ditambahkan.")

    println("Isi inventaris sekarang: $inventarisBuku")

    val jumlahGenreUnik = koleksiGenre.size
    println("Jumlah genre unik yang ada di toko: $jumlahGenreUnik\n")

    println("Daftar semua judul buku yang tercatat:")
    for (judul in daftarJudulBuku) {
        println("- $judul")
    }

    println("----------------------------------")
}
