package com.example.CarDealership.domain.entity

import com.example.CarDealership.domain.dto.VisitDto
import jakarta.persistence.*
import java.time.LocalDateTime

@Entity
@Table(name = "visits")
data class VisitEntity(
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "visit_id_seq")
    @Column(name = "id")
    val id: Long? = null,

    @Column(name = "date", nullable = false)
    val date: LocalDateTime,

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", nullable = false)
    val user: UserEntity,

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "car_id", nullable = false)
    val car: CarEntity
) {
    fun toDto() = VisitDto(
        id = id,
        date = date,
        user = user,
        car = car
    )
}