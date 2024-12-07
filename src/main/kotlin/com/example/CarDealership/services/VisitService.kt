package com.example.CarDealership.services

import com.example.CarDealership.domain.dto.VisitDto
import com.example.CarDealership.domain.entity.VisitEntity

interface VisitService {
    fun addVisit(visit: VisitDto): VisitEntity

    fun removeVisit(visitId: Long)
}