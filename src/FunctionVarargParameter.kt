fun printUser(firstName : String, vararg users : String){
    for (user in users){
        println(user)
    }
}

fun main() {
    printUser(firstName = "TEST", "User 1", "User 2")
}