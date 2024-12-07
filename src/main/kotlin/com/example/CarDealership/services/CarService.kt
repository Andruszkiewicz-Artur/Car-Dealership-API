package com.example.CarDealership.services

import com.example.CarDealership.domain.entity.CarEntity
import com.example.CarDealership.domain.entity.ImageEntity

interface CarService {
    fun addCar(
        carEntity: CarEntity,
//        images: List<ByteArray>
    )

    fun updateCar(carEntity: CarEntity): CarEntity

    fun getCar(id: Long): CarEntity

    fun getCars(): List<CarEntity>

    fun removeCar(id: Long)
}