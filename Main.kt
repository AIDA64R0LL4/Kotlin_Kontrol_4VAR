import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
suspend fun main() {
    println("Если хотите выполнить программу задержкой, то напишите 1, если хотите выполнить программу несколько раз, то напишите 2")
    var X = readLine()!!.toInt()
    if (X==2) {
        var nameClass: Coroutines = Coroutines()
        var K = nameClass.input()
        GlobalScope.launch {
            for (i in 1..K) {
                println("$i запуск ")
                nameClass.Zapusk()
            }
        }
        runBlocking { delay(15000L) }
    }
    if (X==1){
        var nameClass: Coroutines = Coroutines()
        println("Запуск через")
        for(i in 0..3){
            delay(800)
            println(i)
        }
        nameClass.Zapusk()
    }
}