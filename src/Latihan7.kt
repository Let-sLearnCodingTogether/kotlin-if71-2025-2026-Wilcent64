fun hitungPanjangNama(name: String?): Int {
    if (name != null) {
        return name.length
    } else {
        return 0
    }
}

fun main() {
    println(hitungPanjangNama("Budi"))
    println(hitungPanjangNama(null))
}
