package com.example.CarDealership.services.impl

import com.example.CarDealership.domain.entity.CarEntity
import com.example.CarDealership.domain.enums.BodyType
import com.example.CarDealership.domain.enums.DriveType
import com.example.CarDealership.domain.enums.FuelType
import com.example.CarDealership.domain.enums.GearboxType
import com.example.CarDealership.repository.CarRepository
import com.example.CarDealership.repository.ImageRepository
import com.example.CarDealership.services.CarService
import jakarta.transaction.Transactional
import org.springframework.stereotype.Service

@Service
class CarServiceImpl(
    private val carRepository: CarRepository,
    private val imageRepository: ImageRepository
): CarService {

    @Transactional
    override fun addCar(
        carEntity: CarEntity,
//        images: List<ByteArray>
    ) {
        carRepository.save(carEntity)

//        imageRepository.saveAll(
//            images.map {
//                it
//            }
//        )
    }

    override fun updateCar(carEntity: CarEntity): CarEntity = carRepository.save(carEntity)

    override fun getCar(id: Long): CarEntity =
        carRepository
            .findById(id)
            .get()

    override fun getCars(): List<CarEntity> = carRepository.findAll()

    override fun removeCar(id: Long) = carRepository.deleteById(id)
}