package com.example.CarDealership.domain.dto.user

import com.example.CarDealership.domain.entity.UserEntity
import com.example.CarDealership.domain.enums.TypeOfAccount
import java.util.*

data class UserRequest(
    val name: String,
    val surname: String,
    val email: String,
    val password: String,
    val phoneNumber: String
) {

    fun toEntity() = UserEntity(
        id = Random().nextLong(),
        name = name,
        surname = surname,
        email = email,
        password = password,
        phoneNumber = phoneNumber,
        typeOfAccount = TypeOfAccount.User
    )
}
