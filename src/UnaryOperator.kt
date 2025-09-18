fun main() {
    val a = 5
    val b = -a //hasil: -5
    val c = +a //hasil: 5(tidak mengubah nilai, hanya menegaskan positif

    var x = 10
    println(x++) //post-decrement --> cetak dulu 10, lalu x jadi 11
    println(++x) //pre-decrement --> jadi 12 dulu, jadi cetak (12)
    println(x--) //post-decrement --> cetak dulu 12, lalu x jadi 11
    println(--x) //pre-decrement --> jadi 10 dulu, jadi cetak (10)

    val isTrue = false
    val result = isTrue //hasil: true
}