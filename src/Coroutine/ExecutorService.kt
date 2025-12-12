package Coroutine

import java.util.concurrent.Executors

fun main() {
//    val executor = Executors.newFixedThreadPool(10)
//    val executor = Executors.newCachedThreadPool()
    val executor = Executors.newSingleThreadExecutor()

    for(i in 1..100){
        executor.submit {
            val threadName = Thread.currentThread().name

            println("Tugas $i berjalan d thread $threadName")

            Thread.sleep(1000)
        }
    }
    executor.shutdown()
}