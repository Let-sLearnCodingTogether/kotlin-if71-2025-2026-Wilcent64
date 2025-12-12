package FunctionalPrograming

import jdk.dynalink.Operation

fun operateOnNumbers(a : Int, b : Int, operation: (Int, Int) -> Unit){
    return operation(a,b)
}

fun main() {
    operateOnNumbers(1,3){x,y -> println(x + y)}
    val result1 = operateOnNumbers(1,3){x,y -> x * y}
    println(result1)
    operateOnNumbers(1,3){x,y -> x - y}
}