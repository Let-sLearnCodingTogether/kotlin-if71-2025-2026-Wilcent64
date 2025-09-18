fun main() {
    val firstUser: Triple<String, Byte, String> = Triple("User 1", 20, "Jakarta")

    // destructuring
    val (username, age, city) = firstUser

    println(username)
    println(age)
    println(city)
}
