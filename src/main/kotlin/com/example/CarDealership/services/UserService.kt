package com.example.CarDealership.services

import com.example.CarDealership.domain.entity.UserEntity

interface UserService {
    fun createUser(userEntity: UserEntity): UserEntity

    fun updateUser(userEntity: UserEntity): UserEntity

    fun getAll(): List<UserEntity>
}