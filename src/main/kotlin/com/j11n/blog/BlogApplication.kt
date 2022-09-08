package com.j11n.blog

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.context.properties.EnableConfigurationProperties
import org.springframework.boot.runApplication

@SpringBootApplication
@EnableConfigurationProperties(BlogConfiguration:: class)
open class BlogApplication

fun main(args: Array<String>) {
	runApplication<BlogApplication>(*args)
}
