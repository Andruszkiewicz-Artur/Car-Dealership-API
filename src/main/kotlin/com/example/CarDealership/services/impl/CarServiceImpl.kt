package com.example.CarDealership.services.impl

import com.example.CarDealership.domain.entity.CarEntity
import com.example.CarDealership.repository.CarRepository
import com.example.CarDealership.services.CarService
import org.springframework.stereotype.Service

@Service
class CarServiceImpl(
    private val carRepository: CarRepository
): CarService {
    override fun addCar(carEntity: CarEntity): CarEntity = carRepository.save(carEntity)

    override fun updateCar(carEntity: CarEntity): CarEntity = carRepository.save(carEntity)

    override fun getCar(id: Long): CarEntity = carRepository.getReferenceById(id)

    override fun getCars(): List<CarEntity> = carRepository.findAll()

    override fun removeCar(carEntity: CarEntity) = carRepository.delete(carEntity)
}