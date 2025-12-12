package Coroutine

import kotlinx.coroutines.Job
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() = runBlocking{
    println("aplikasi dimulai")

    val job : Job = launch {
        updateVersion1()
    }

    println("Apakah job ini selesai ? ${job.isCompleted}")
    println("Apakah job ini aktif ? ${job.isActive}")
    println("Apkash job ini dibatalkan ? ${job.isCancelled}")

    println("aplikasi sedang digunakan")
}

suspend fun updateVersion1(){
    delay(5000)
    println("Update selesai")
}