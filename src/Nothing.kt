fun fail(message: String): Nothing {
    throw IllegalArgumentException(message)
}
fun main() {
    fail("terjadi kesalahan fatal!!")
}