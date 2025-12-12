package Coroutine

import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() = runBlocking{
    println("aplikasi dimulai")

    launch {
        updateVersion()
    }

    println("aplikasi sedang digunakan")
}

suspend fun updateVersion(){
    delay(5000)
    println("Update selesai")
}