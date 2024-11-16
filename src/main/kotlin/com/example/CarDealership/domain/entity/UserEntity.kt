package com.example.CarDealership.domain.entity

import com.example.CarDealership.domain.dto.UserDto
import com.example.CarDealership.domain.enums.TypeOfAccount
import com.fasterxml.jackson.annotation.JsonManagedReference
import jakarta.persistence.*

@Entity
@Table(name = "users")
data class UserEntity(
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "user_id_seq")
    @Column(name = "id", nullable = false)
    val id: Long? = null,

    @Column(name = "name", nullable = false)
    val name: String,

    @Column(name = "surname", nullable = false)
    val surname: String,

    @Column(name = "email", nullable = false, unique = true)
    val email: String,

    @Column(name = "password", nullable = false)
    val password: String,

    @Column(name = "phoneNumber", nullable = false)
    val phoneNumber: Int,

    @Column(name = "typeOfAccount", nullable = false)
    @Enumerated(EnumType.STRING)
    val typeOfAccount: TypeOfAccount
) {
    fun toDto() = UserDto(
        id = id,
        name = name,
        surname = surname,
        email = email,
        password = password,
        phoneNumber = phoneNumber
    )
}