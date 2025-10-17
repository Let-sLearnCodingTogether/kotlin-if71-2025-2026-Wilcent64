package oop

class MahasiswaFunction(val nama : String){
    fun sayHello(){
        println("Selamat malam $nama")
    }
    fun sayHello(word : String){
        println("$word $nama")
    }
}

fun main() {
    val mahasiswaPertama = MahasiswaFunction("Wilcent")

    mahasiswaPertama.sayHello()
}