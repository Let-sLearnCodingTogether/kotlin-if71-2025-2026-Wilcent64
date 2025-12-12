package Coroutine

import kotlinx.coroutines.Job
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() = runBlocking{
    println("aplikasi dimulai")

    val job : Job = launch {
        updateVersion3()
    }

    println("Apakah job ini selesai ? ${job.isCompleted}")
    println("Apakah job ini aktif ? ${job.isActive}")
    println("Apkash job ini dibatalkan ? ${job.isCancelled}")

    job.cancel()
    println("Apakah job ini selesai ? ${job.isCompleted}")
    println("Apakah job ini aktif ? ${job.isActive}")
    println("Apkash job ini dibatalkan ? ${job.isCancelled}")

    job.join() //alkan menunggu sampai dengan job selesai
    println("Apakah job ini selesai ? ${job.isCompleted}")
    println("Apakah job ini aktif ? ${job.isActive}")
    println("Apkash job ini dibatalkan ? ${job.isCancelled}")

    println("Aplikasi sedang digunakan")
}

suspend fun updateVersion3(){
    delay(5000)
    println("Update selesai")
}