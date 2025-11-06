package nextOOP

open class Pegawai(val nama : String, val gajiDasar : Double){
    open fun hitungGaji(){
        println(gajiDasar)
    }
}

class Manager(nama : String, gajiDasar : Double) : Pegawai(nama,gajiDasar){
    final override fun hitungGaji() {
        println(gajiDasar+100000)
    }
}

class Programer(nama : String, gajiDasar : Double) : Pegawai(nama,gajiDasar){
    final override fun hitungGaji() {
        println(gajiDasar+200000)
    }
}

fun main() {

    val pekerja : MutableList<Pegawai> = mutableListOf()

    val wilcent = Manager("Wilcent", 5000000.0)
    val luky = Programer("Luky", 5000000.0)
    pekerja.add(wilcent)
    pekerja.add(luky)

    for (p in pekerja){
        p.hitungGaji()
    }

}
