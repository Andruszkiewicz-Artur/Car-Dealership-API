package com.example.CarDealership.controllers

import com.example.CarDealership.domain.dto.VisitDto
import com.example.CarDealership.services.VisitService
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api/visit")
class VisitController(
    private val service: VisitService
) {

    @PostMapping
    fun addVisit(@RequestBody visit: VisitDto) =
        service
            .addVisit(visit)

    @DeleteMapping("/{id}")
    fun removeVisit(@PathVariable id: Long) =
        service
            .removeVisit(id)
}