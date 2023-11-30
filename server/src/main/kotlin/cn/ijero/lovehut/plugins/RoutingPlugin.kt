package cn.ijero.lovehut.plugins

import Greeting
import cn.ijero.lovehut.routing.userRouting
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

fun Application.configRouting() {

    routing {
        userRouting()

        get("/") {
            call.respondText("Ktor: ${Greeting().greet()}")
        }
    }
}
