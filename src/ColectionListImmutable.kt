fun main() {
    val mataKuliahWajib: List<String> = listOf(
    "Kotlin",
    "Kalkulus",
    "Algotima dan Struktur data"
    )
    println("List mataKuliah wajib : $mataKuliahWajib")
    println("Size List matakuliah wajib : ${mataKuliahWajib.size}")

    println("Index pertama matakuliah wajib : ${mataKuliahWajib[0]}")

    val mataKuliahUppercase = mataKuliahWajib.map {
        it.uppercase()
    }
    println("List matakuliah uppercase : $mataKuliahUppercase")

    val mataKuliahLebihDariNKarakter = mataKuliahWajib.filter {
        it.length > 10
    }
        println("Matakuliah lebih dari 10 karakter : $mataKuliahLebihDariNKarakter")
}