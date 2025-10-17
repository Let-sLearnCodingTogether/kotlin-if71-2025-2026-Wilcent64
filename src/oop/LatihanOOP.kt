package oop

import java.util.logging.Level

data class GameItem(val id : Int, val name : String, var value : Int, val rarity : String){

}
class Player(val name: String) {
    var health: Int = 100
    var level: Int = 1

    fun takeDamage(demage : Int) {
        health -= demage
        if (health <0){
            health = 0
        }
        println("$name menerima $demage demage")
    }
    fun levelUp() {
        level += 1
        health = 100
        println("$name naik ke level $level dan health dipulihkan ke 100!")
    }
    fun showStatus(){
        println("Nama: $name, Level: $level, Health: $health")
    }
}
fun main() {
    val player = Player("Wilcent")
    player.showStatus()
    player.takeDamage(30)
    player.showStatus()
    player.levelUp()
    player.showStatus()

    val item : List<GameItem> = listOf(
        GameItem(1, "Pedang Besi", 100, "Common"),
        GameItem(1, "Ramuan Kesehatan", 50, "Common"),
        GameItem(1, "Jubah Bayangan", 500, "Epic"))

    val crusedSword = item[0].copy(name = "Pedang Besi Terkutuk")

    println(item[0])
    println(crusedSword)
}