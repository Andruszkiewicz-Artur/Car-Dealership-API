package com.example.CarDealership.controllers

import com.example.CarDealership.domain.dto.car.CarDto
import com.example.CarDealership.domain.dto.car.CarsResponse
import com.example.CarDealership.domain.enums.BodyType
import com.example.CarDealership.domain.enums.DriveType
import com.example.CarDealership.domain.enums.FuelType
import com.example.CarDealership.domain.enums.GearboxType
import com.example.CarDealership.services.CarService
import jakarta.websocket.server.PathParam
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api/car")
class CarController(
    private val carService: CarService
) {

    @PostMapping
    fun createCar(@RequestBody carDto: CarDto) {
        carService
            .addCar(
                carEntity = carDto.toEntity(),
//                images = carDto.images
            )
    }

    @GetMapping
    fun getCars(): List<CarsResponse> =
        carService
            .getCars()
            .map {
                it.toCarsResponse()
            }

    @GetMapping("/{id}")
    fun getCar(@PathVariable id: Long): CarDto =
        carService
            .getCar(id)
            .toDto()

    @DeleteMapping("/{id}")
    fun deleteCar(@PathVariable id: Long) =
        carService
            .removeCar(id)

    @PutMapping
    fun updateCar(@RequestBody carDto: CarDto) =
        carService
            .updateCar(
                carDto.toEntity()
            )
}