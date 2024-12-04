package com.example.CarDealership.services.impl

import com.example.CarDealership.domain.entity.UserEntity
import com.example.CarDealership.exceptions.EmailAlreadyExistsException
import com.example.CarDealership.repository.UserRepository
import com.example.CarDealership.services.UserService
import org.springframework.security.crypto.password.PasswordEncoder
import org.springframework.stereotype.Service

@Service
class UserServiceImpl(
    private val userRepository: UserRepository,
    private val encoder: PasswordEncoder
): UserService {

    override fun createUser(userEntity: UserEntity): UserEntity  {
        if (userRepository.findAll().find { it.email == userEntity.email } != null) {
            throw EmailAlreadyExistsException("This email already exist!")
        }

        return userRepository.save(
            userEntity.copy(
                password = encoder.encode(userEntity.password)
            )
        )
    }

    override fun updateUser(userEntity: UserEntity): UserEntity = userRepository.save(
        userEntity.copy(
            password = encoder.encode(userEntity.password)
        )
    )

    override fun getAll(): List<UserEntity> = userRepository.findAll()
}