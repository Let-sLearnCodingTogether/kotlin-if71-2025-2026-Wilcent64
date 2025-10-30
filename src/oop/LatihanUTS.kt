package oop

fun main() {
val stokBarang = mapOf(
    "Buku" to 45,
    "Pena" to 78,
    "Indomie" to 120,
    "Teh" to 30,
    "Binder" to 12,
    "Kopi" to 55
)
    val barangSedikit = stokBarang.minByOrNull { it.value }

    if(barangSedikit != null){
        println("Barang yang perlu di-restok adalah: ${barangSedikit.key}")
        println("Sisa Stoknya: ${barangSedikit.value}")
    }
}