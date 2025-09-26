fun main() {
    var student : String = "Budi"
    println(student)

//    student = null

    var prodiIf : String? = null
    println(prodiIf?.length)

    var prodiSi : String? = "Sistem Informasi"
    println(prodiSi ?: "Tanpa Pordi")

    var toksen : String? = null
    println(toksen!!.length)

    var email : String? = "email"
    if(email != null){
        println(email.length)
    }
}