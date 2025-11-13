package com.back.global.init

import com.back.domain.post.post.entity.Post
import com.back.domain.post.post.repository.PostRepository
import org.springframework.boot.ApplicationRunner
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class BaseInitData(
    private val postRepository: PostRepository
) {
    @Bean
    fun baseInitDataApplicationRunner(): ApplicationRunner {
        return ApplicationRunner {
            if (postRepository.count() > 0) {
                return@ApplicationRunner
            }

            val post1 = Post(0, "제목", "내용")
            postRepository.save(post1)
        }
    }
}