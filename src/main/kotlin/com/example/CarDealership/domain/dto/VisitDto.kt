package com.example.CarDealership.domain.dto

import com.example.CarDealership.domain.entity.CarEntity
import com.example.CarDealership.domain.entity.UserEntity
import com.example.CarDealership.domain.entity.VisitEntity
import java.time.LocalDateTime

data class VisitDto(
    val id: Long? = null,
    val date: LocalDateTime,
    val userId: Long,
    val carId: Long
)
