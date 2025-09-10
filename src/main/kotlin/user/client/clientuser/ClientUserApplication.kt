package user.client.clientuser

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class ClientUserApplication

fun main(args: Array<String>) {
    runApplication<ClientUserApplication>(*args)
}
