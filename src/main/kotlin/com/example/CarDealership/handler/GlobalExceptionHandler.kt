package com.example.CarDealership.handler

import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.ExceptionHandler
import org.springframework.web.bind.annotation.RestControllerAdvice

@RestControllerAdvice
class GlobalExceptionHandler {

    @ExceptionHandler(Exception::class)
    fun handleException(ex: Exception): ResponseEntity<String> =
        ResponseEntity
            .badRequest()
            .body(ex.message)

}