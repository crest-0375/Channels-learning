import kotlinx.coroutines.*
import kotlin.system.measureTimeMillis

fun main() {
    runBlocking {
        var counter = 0
        withContext(Dispatchers.Default) {
            MutexClass.massiveRunMutex { counter++ }
        }
        println("Counter = $counter")
    }
}

