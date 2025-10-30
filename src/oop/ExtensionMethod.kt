package oop

//Library yang kita tidak punya akses
class UserProfile1(val usernama : String){}

fun UserProfile1.usernameToUppercase() : String {
    return this.usernama.uppercase()
}

fun main() {
    val user1 = UserProfile1("tom")
    println(user1.usernameToUppercase())
}