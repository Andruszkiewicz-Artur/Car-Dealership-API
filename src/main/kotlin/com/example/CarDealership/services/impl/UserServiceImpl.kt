package com.example.CarDealership.services.impl

import com.example.CarDealership.domain.entity.UserEntity
import com.example.CarDealership.repository.UserRepository
import com.example.CarDealership.services.UserService
import org.springframework.stereotype.Service

@Service
class UserServiceImpl(private val userRepository: UserRepository): UserService {

    override fun createUser(userEntity: UserEntity): UserEntity = userRepository.save(userEntity)

    override fun updateUser(userEntity: UserEntity): UserEntity = userRepository.save(userEntity)

}