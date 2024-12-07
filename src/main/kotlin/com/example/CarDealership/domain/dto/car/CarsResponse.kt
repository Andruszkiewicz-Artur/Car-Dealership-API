package com.example.CarDealership.domain.dto.car

import com.example.CarDealership.domain.dto.ImageDto
import com.example.CarDealership.domain.enums.FuelType

data class CarsResponse(
    val id: Long,
    val brand: String,
    val vehicleModel: String,
    val yearOfManufacture: Int,
    val fuelType: FuelType,
    val mileage: Int,
//    val image: ImageDto
)