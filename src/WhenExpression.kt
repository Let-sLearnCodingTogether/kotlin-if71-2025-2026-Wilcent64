fun main() {
    val finalExam =  'A'
    val nilaiLulus = arrayOf('A', 'B')

    when(finalExam){
        'A','a' -> println("Lulus")
        'B','b' -> println("Lulus Juga")
        'C','c' -> println("Ya bisa lulus")
        else -> println("Tidak Lulus")
    }
    when(finalExam){
        'A','a', 'B','b' -> println("Lulus")
        'C','c' -> println("Ya bisa lulus")
        else -> println("Tidak Lulus")
    }
    when{
        finalExam == 'A' || finalExam == 'B' ->println("Lulus")
        finalExam == 'C' ->println("Ya bisa Lulus")
        else -> println("Tidak lulus")
    }

    var status1 = false
    when(finalExam){
        'A', 'B' -> status1 = true
        else -> status1 = false
    }

    val status = when(finalExam){
        'A','B' -> true
        else -> false
    }
    println(status)

    when(finalExam){
        in nilaiLulus -> println("lulus")
        !in nilaiLulus -> println("Tidak Lulus")
    }
    when(finalExam){
        is Char -> println("ya, ini char")
        is String -> println("Ini string")
        !is Char -> println("Bukan char")
    }
}