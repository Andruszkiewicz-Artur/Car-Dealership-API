package com.example.CarDealership.domain.dto.user

import java.util.UUID

data class UserResponse(
    val id: Long,
    val name: String,
    val surname: String,
    val email: String,
)