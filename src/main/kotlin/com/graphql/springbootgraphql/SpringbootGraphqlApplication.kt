package com.graphql.springbootgraphql

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.web.servlet.config.annotation.EnableWebMvc

@EnableWebMvc
@SpringBootApplication
class SpringbootGraphqlApplication

fun main(args: Array<String>) {
    runApplication<SpringbootGraphqlApplication>(*args)
}
