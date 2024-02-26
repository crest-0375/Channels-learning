import kotlinx.coroutines.*
import kotlin.system.measureTimeMillis

fun main() {
    runBlocking {
        val counterContext = newSingleThreadContext("CounterContext")
        var counter = 0
        withContext(counterContext) {
//        withContext(Dispatchers.Default) {
            MutexClass.massiveRunMutex {
//                withContext(counterContext) {
                    counter++
//                }
            }
        }
        println("Counter = $counter")
    }
}