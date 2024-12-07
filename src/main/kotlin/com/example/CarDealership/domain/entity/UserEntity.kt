package com.example.CarDealership.domain.entity

import com.example.CarDealership.domain.dto.user.UserResponse
import com.example.CarDealership.domain.enums.TypeOfAccount
import jakarta.persistence.*
import org.springframework.security.core.userdetails.User
import org.springframework.security.core.userdetails.UserDetails

@Entity
@Table(name = "Users")
data class UserEntity(
    @Id
    @GeneratedValue
    val id: Long,

    val name: String,

    val surname: String,

    @Column(unique = true)
    val email: String,

    val password: String,

    val phoneNumber: String,

    @Enumerated(EnumType.STRING)
    val typeOfAccount: TypeOfAccount,

    @OneToMany(mappedBy = "user")
    val visits: List<VisitEntity> = mutableListOf()
) {
    fun toResponse() = UserResponse(
        id = id,
        name = name,
        surname = surname,
        email = email
    )

    fun toUserDetails(): UserDetails =
        User
            .builder()
            .username(email)
            .password(password)
            .roles(typeOfAccount.name)
            .build()
}