package com.example.CarDealership.repository

import com.example.CarDealership.domain.entity.VisitEntity
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface VisitRepository: JpaRepository<VisitEntity, Long?>