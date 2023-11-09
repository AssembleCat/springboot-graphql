package com.graphql.springbootgraphql.entity

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.Id

@Entity
class Food(
    @Id @GeneratedValue
    val id: Long? = null,

    var name: String
) {
    companion object {
        fun from(name: String) = Food(null, name)
    }
}