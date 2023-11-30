package cn.ijero.lovehut.routing

import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

fun Routing.userRouting(){
    route("/user"){
        post("/sign_in") {
            // 登录
        }
        post("sign_out") {
            // 登出
        }

        post("sign_up") {
            // 注册
        }

        post("cancel_account") {
            // 注销账号
        }

        get("/profile") {
            // 获取用户信息
            call.respondText("get UserProfile")
        }
        post("/profile") {
            // 修改用户信息
            call.respondText("post UserProfile")
        }
    }
}
