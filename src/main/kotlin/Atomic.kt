import kotlinx.coroutines.*
import java.util.concurrent.atomic.AtomicInteger
import kotlin.system.measureTimeMillis

fun main() {
    runBlocking {
        var counter = AtomicInteger(0)
        withContext(Dispatchers.Default) {
            MutexClass.massiveRunMutex { counter.incrementAndGet() }
        }
        println("Counter = $counter")
    }
}