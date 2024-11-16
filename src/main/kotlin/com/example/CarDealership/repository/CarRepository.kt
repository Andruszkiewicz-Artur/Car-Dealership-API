package com.example.CarDealership.repository

import com.example.CarDealership.domain.entity.CarEntity
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface CarRepository: JpaRepository<CarEntity, Long?>