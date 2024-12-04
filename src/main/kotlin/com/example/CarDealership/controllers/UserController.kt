package com.example.CarDealership.controllers

import com.example.CarDealership.domain.dto.user.UserRequest
import com.example.CarDealership.domain.dto.user.UserResponse
import com.example.CarDealership.services.UserService
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api/user")
class UserController(private val userService: UserService) {

    @PostMapping
    fun createUser(@RequestBody userRequest: UserRequest): UserResponse =
        userService
            .createUser(
                userRequest.toEntity()
            ).toResponse()

    @GetMapping
    fun getAll(): List<UserResponse> =
        userService
            .getAll()
            .map {
                it.toResponse()
            }
}