package com.example.CarDealership.domain.entity

import com.example.CarDealership.domain.dto.VisitDto
import jakarta.persistence.*
import java.time.LocalDateTime

@Entity
@Table(name = "visits")
data class VisitEntity(
    @Id
    @GeneratedValue
    val id: Long,

    @Column(name = "date")
    val date: LocalDateTime,

    @ManyToOne
    @JoinColumn(name = "user_id")
    val user: UserEntity,

    @ManyToOne
    @JoinColumn(name = "car_id")
    val car: CarEntity
) {
    fun toDto() = VisitDto(
        id = id,
        date = date,
        userId = user.id,
        carId = car.id ?: throw RuntimeException("Problem with take id of car!")
    )
}