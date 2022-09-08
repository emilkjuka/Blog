package com.j11n.blog

import Article
import ArticleRepository
import User
import UserRepository
import org.springframework.boot.ApplicationRunner
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
open class BlogConfiguration {

    @Bean
    open fun databaseInitializer(userRepository: UserRepository,
                                 articleRepository: ArticleRepository) = ApplicationRunner {

        val smaldini = userRepository.save(User("smaldini", "Stéphane", "Maldini"))
        articleRepository.save(Article(
                title = "Reactor Bismuth is out",
                headLine = "Lorem ipsum",
                content = "dolor sit amet",
                author = smaldini
        ))
        articleRepository.save(Article(
                title = "Reactor Aluminium has landed",
                headLine = "Lorem ipsum",
                content = "dolor sit amet",
                author = smaldini
        ))
    }
}