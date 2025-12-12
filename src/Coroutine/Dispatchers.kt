package Coroutine

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() = runBlocking{
    launch (Dispatchers.IO){
        println("Dispatcher.IO")
    }

    launch (Dispatchers.Default){
        println("Dispatcher.Default")
    }

    println("Selesai")
}