package com.veontomo.demo

import org.springframework.boot.autoconfigure.*
import org.springframework.web.bind.annotation.*

@RestController
@EnableAutoConfiguration
class Controller {
    @RequestMapping("/hello")
    @ResponseBody
    fun home(): String {
        return "Hello World!"
    }

}