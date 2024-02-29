import kotlinx.coroutines.*
import kotlin.system.measureTimeMillis

fun main() {
    runBlocking {
        val time = measureTimeMillis {
            coroutineScope {
                launch {
                    println("Coroutine 1 starts")
                    delay(1000)
                    println("Coroutine 1 finishes")
                }
                launch {
                    println("Coroutine 2 starts")
                    delay(1000)
                    println("Coroutine 2 finishes")
                }
                launch {
                    println("Coroutine 3 starts")
                    delay(1000)
                    println("Coroutine 3 finishes")
                }
            }
        }
        println("Time for second start")
        val time2 = measureTimeMillis {
            coroutineScope {
                println("Coroutine 4 starts")
                delay(1000)
                println("Coroutine 4 finishes")
            }
        }
        println("All coroutines finished in $time and $time2")
    }
}
