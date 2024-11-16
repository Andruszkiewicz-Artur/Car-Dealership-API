package com.example.CarDealership.domain.dto

import com.example.CarDealership.domain.entity.UserEntity
import com.example.CarDealership.domain.enums.TypeOfAccount

data class UserDto(
    val id: Long? = null,
    val name: String,
    val surname: String,
    val email: String,
    val password: String,
    val phoneNumber: Int,
    val typeOfAccount: TypeOfAccount
) {
    fun toEntity() = UserEntity(
        id = id,
        name = name,
        surname = surname,
        email = email,
        password = password,
        phoneNumber = phoneNumber,
        typeOfAccount = typeOfAccount
    )
}
