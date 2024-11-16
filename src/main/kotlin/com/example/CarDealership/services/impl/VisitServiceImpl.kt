package com.example.CarDealership.services.impl

import com.example.CarDealership.domain.entity.VisitEntity
import com.example.CarDealership.repository.VisitRepository
import com.example.CarDealership.services.VisitService
import org.springframework.stereotype.Service

@Service
class VisitServiceImpl(
    private val visitRepository: VisitRepository
): VisitService {
    override fun addVisit(visitEntity: VisitEntity): VisitEntity = visitRepository.save(visitEntity)

    override fun getVisits(): List<VisitEntity> = visitRepository.findAll()

    override fun removeVisit(visitEntity: VisitEntity) = visitRepository.delete(visitEntity)
}