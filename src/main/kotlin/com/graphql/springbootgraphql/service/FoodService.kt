package com.graphql.springbootgraphql.service

import com.graphql.springbootgraphql.entity.Food
import com.graphql.springbootgraphql.repository.FoodRepository
import jakarta.persistence.EntityNotFoundException
import lombok.extern.slf4j.Slf4j
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Slf4j
@Service
@Transactional
class FoodService(
    private val foodRepository: FoodRepository
) {

    fun save(name: String): Food {
        return foodRepository.save(Food.from(name))
    }

    fun update(id: Long, name: String): Food {
        val food = foodRepository.findById(id)
            .orElseThrow { throw EntityNotFoundException("No food to update") }
        return foodRepository.save(food.update(name))
    }

    fun getFood(name: String): Food {
        return foodRepository.findByName(name) ?: throw EntityNotFoundException("No food to query")
    }

    fun getFoods(): List<Food> {
        return foodRepository.findAll()
    }
}
