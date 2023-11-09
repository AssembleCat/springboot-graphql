package com.graphql.springbootgraphql.controller

import com.graphql.springbootgraphql.entity.Food
import com.graphql.springbootgraphql.service.FoodService
import lombok.extern.slf4j.Slf4j
import org.springframework.graphql.data.method.annotation.Argument
import org.springframework.graphql.data.method.annotation.MutationMapping
import org.springframework.graphql.data.method.annotation.QueryMapping
import org.springframework.stereotype.Controller

@Slf4j
@Controller
class FoodController(
    private val foodService: FoodService
) {

    @MutationMapping
    fun save(@Argument name: String): Food {
        return foodService.save(name)
    }

    @MutationMapping
    fun update(@Argument id: Long, @Argument name: String): Food {
        return foodService.update(id, name)
    }

    @QueryMapping
    fun getFood(@Argument name: String): Food {
        return foodService.getFood(name)
    }

    @QueryMapping
    fun getFoods(): List<Food> {
        return foodService.getFoods()
    }
}