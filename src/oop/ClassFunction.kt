package oop

class MahasiswaFunctionOverloading(val nama : String){
    fun sayHello(){
        println("Selamat malam $nama")
    }
}

fun main() {
    val mahasiswaPertama = MahasiswaFunction("Wilcent")

    mahasiswaPertama.sayHello()
    mahasiswaPertama.sayHello("Selamat Pagi")
}