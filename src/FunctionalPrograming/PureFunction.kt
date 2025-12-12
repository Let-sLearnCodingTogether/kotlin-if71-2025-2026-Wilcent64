package FunctionalPrograming

fun add(a : Int, b : Int) : Int = a + b

var count = 0//anggap saja ini global variable
fun addInputreFunction(a : Int) : Int {
    count += 1
    return a + count
}

fun main() {
    add(1,2) //3
    add(1,2) //3
    add(1,2) //3

    println(addInputreFunction(1)) //2
    println(addInputreFunction(1)) //3
}