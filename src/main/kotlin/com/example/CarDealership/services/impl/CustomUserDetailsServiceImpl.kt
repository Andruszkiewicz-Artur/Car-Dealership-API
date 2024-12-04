package com.example.CarDealership.services.impl

import com.example.CarDealership.repository.UserRepository
import org.springframework.security.core.userdetails.UserDetails
import org.springframework.security.core.userdetails.UserDetailsService
import org.springframework.security.core.userdetails.UsernameNotFoundException
import org.springframework.stereotype.Service

@Service
class CustomUserDetailsServiceImpl(
    private val userRepository: UserRepository
): UserDetailsService {

    override fun loadUserByUsername(email: String): UserDetails =
        userRepository.findAll().first { it.email == email }
            ?.toUserDetails()
            ?: throw UsernameNotFoundException("Not found!")

}