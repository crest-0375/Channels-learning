import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() {
    runBlocking {
        val channel = Channel<Int>(4)
        val sender = launch {
            repeat(10){
                channel.send(it)
                println("Sent $it")
            }
        }

        repeat(6) {
            delay(1000)
            println("Received ${channel.receive()}")
            println("Received ${channel.receive()}")
        }
        sender.cancel()
    }
}