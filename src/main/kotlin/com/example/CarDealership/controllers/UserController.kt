package com.example.CarDealership.controllers

import com.example.CarDealership.domain.dto.UserDto
import com.example.CarDealership.services.UserService
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class UserController(private val userService: UserService) {

    @PostMapping(path = ["/api/user"])
    fun createUser(@RequestBody userDto: UserDto): UserDto = userService.createUser(userDto.toEntity()).toDto()

}