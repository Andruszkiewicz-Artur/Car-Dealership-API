package com.example.CarDealership.controllers

import com.example.CarDealership.domain.dto.authentication.AuthenticationRequest
import com.example.CarDealership.domain.dto.authentication.AuthenticationResponse
import com.example.CarDealership.services.impl.AuthenticationServiceImpl
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/auth")
class AuthController(
    private val authenticationService: AuthenticationServiceImpl
) {

    @PostMapping
    fun authenticate(@RequestBody authRequest: AuthenticationRequest): AuthenticationResponse =
        authenticationService.authentication(authRequest)

}