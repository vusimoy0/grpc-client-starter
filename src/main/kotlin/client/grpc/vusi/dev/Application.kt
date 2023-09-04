package client.grpc.vusi.dev

import client.grpc.vusi.dev.plugins.*
import io.ktor.server.application.*

fun main(args: Array<String>) {
    io.ktor.server.cio.EngineMain.main(args)
}

fun Application.module() {
    configureRouting()
}
