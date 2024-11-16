package com.example.CarDealership.services

import com.example.CarDealership.domain.entity.VisitEntity

interface VisitService {
    fun addVisit(visitEntity: VisitEntity): VisitEntity

    fun getVisits(): List<VisitEntity>

    fun removeVisit(visitEntity: VisitEntity)
}