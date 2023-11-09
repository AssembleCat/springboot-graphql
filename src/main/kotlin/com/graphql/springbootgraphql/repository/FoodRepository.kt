package com.graphql.springbootgraphql.repository

import com.graphql.springbootgraphql.entity.Food
import org.springframework.graphql.data.GraphQlRepository
import org.springframework.data.jpa.repository.JpaRepository

@GraphQlRepository
interface FoodRepository : JpaRepository<Food, Long>{
    fun findByName(name: String): Food?
}