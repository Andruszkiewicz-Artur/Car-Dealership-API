package com.example.CarDealership.services

import com.example.CarDealership.domain.entity.CarEntity

interface CarService {
    fun addCar(carEntity: CarEntity): CarEntity

    fun updateCar(carEntity: CarEntity): CarEntity

    fun getCar(id: Long): CarEntity

    fun getCars(): List<CarEntity>

    fun removeCar(carEntity: CarEntity)
}