package com.fernando.SpringCloudConfigClient

import com.fernando.SpringCloudConfigClient.controller.HelloController
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.CommandLineRunner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SpringCloudConfigClientApplication:CommandLineRunner {
	@Autowired
	val controller= HelloController()

	override fun run(vararg args: String?) {
		controller.home()
	}
}

fun main(args: Array<String>)  {
	runApplication<SpringCloudConfigClientApplication>(*args)

}
