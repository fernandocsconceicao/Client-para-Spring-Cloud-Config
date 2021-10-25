package com.fernando.SpringCloudConfigClient.controller

import org.springframework.beans.factory.annotation.Value
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController


@RequestMapping("/")
@RestController
class HelloController {
    @Value("\${my.greeting}")
    lateinit var greeting: String

    fun home() {
        println( greeting)
    }

}