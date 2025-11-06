package nextOOP

open class Hewan(val name : String){
    open fun suara(){
        println("Suara hewan")
    }
}

open class Ayam(name : String) : Hewan(name){
    override fun suara(){
        println("Kuku ruyuk")
    }
}

class AnakAyam(name : String) : Ayam(name){
    override fun suara() {
        println("Petok perok")
    }
}

fun main() {
    val rambo = Ayam("Rambo")
    rambo.suara()
}