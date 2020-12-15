package nl.codelines.example.bootws

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class BootWsExampleApplication

fun main(args: Array<String>) {
    runApplication<BootWsExampleApplication>(*args)
}
