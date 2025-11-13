package com.back.domain.post.post.entity

import jakarta.persistence.*
import jakarta.persistence.GenerationType.IDENTITY
import org.springframework.data.annotation.CreatedDate
import org.springframework.data.annotation.LastModifiedDate
import org.springframework.data.jpa.domain.support.AuditingEntityListener
import java.time.LocalDateTime

@Entity
@EntityListeners(AuditingEntityListener::class)
class Post(
    @field:Id
    @field:GeneratedValue(strategy = IDENTITY)
    val id: Int = 0,
    var title: String,
    @field:Column(columnDefinition = "TEXT")
    var content: String,
) {
    @CreatedDate
    lateinit var createDate: LocalDateTime

    @LastModifiedDate
    lateinit var modifyDate: LocalDateTime
}