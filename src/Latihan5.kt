fun main() {
    var totalBelanja: Double = 0.0

    // Status awal
    println("Status Awal -> Total Belanja: Rp$totalBelanja")

    // Pelanggan membeli 3 item A Rp 25000
    totalBelanja += 3 * 25000
    println("Setelah Item A -> Total Belanja: Rp$totalBelanja")

    // Pelanggan membeli 2 item B Rp 15000
    totalBelanja += 2 * 15000
    println("Setelah Item B -> Total Belanja: Rp$totalBelanja")

    // Diskon Rp 10000
    totalBelanja -= 10000
    println("Setelah Diskon -> Total Belanja: Rp$totalBelanja")

    // Biaya layanan flat Rp 950
    val biayaLayanan = totalBelanja/100
    totalBelanja += biayaLayanan
    println("Ditambah Biaya Layanan (Rp$biayaLayanan) -> Total Belanja: Rp$totalBelanja")

    // Total akhir
    println("===================================")
    println("Total Akhir yang Harus Dibayar: Rp$totalBelanja")
    println("===================================")
}
