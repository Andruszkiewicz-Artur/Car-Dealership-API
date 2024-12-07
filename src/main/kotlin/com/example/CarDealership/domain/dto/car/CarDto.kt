package com.example.CarDealership.domain.dto.car

import com.example.CarDealership.domain.dto.ImageDto
import com.example.CarDealership.domain.dto.VisitDto
import com.example.CarDealership.domain.entity.CarEntity
import com.example.CarDealership.domain.entity.ImageEntity
import com.example.CarDealership.domain.entity.VisitEntity
import com.example.CarDealership.domain.enums.BodyType
import com.example.CarDealership.domain.enums.DriveType
import com.example.CarDealership.domain.enums.FuelType
import com.example.CarDealership.domain.enums.GearboxType
import java.util.Random

data class CarDto(
    val id: Long,
    val brand: String,
    val vehicleModel: String,
    val generation: String,
    val vin: String,
    val price: Float,
    val yearOfManufacture: Int,
    val fuelType: FuelType,
    val description: String?,
    val mileage: Int,
    val capacity: Int,
    val power: Int,
    val gearbox: GearboxType,
    val bodyType: BodyType,
    val numberOfDoors: Int,
    val numberOfSeats: Int,
    val drive: DriveType,
    val visits: List<VisitDto>,
//    val images: List<ImageDto>
) {
    fun toEntity() = CarEntity(
        id = id,
        brand = brand,
        vehicleModel = vehicleModel,
        generation = generation,
        vin = vin,
        price = price,
        yearOfManufacture = yearOfManufacture,
        fuelType = fuelType,
        description = description,
        mileage = mileage,
        capacity = capacity,
        power = power,
        gearbox = gearbox,
        bodyType = bodyType,
        numberOfDoors = numberOfDoors,
        numberOfSeats = numberOfSeats,
        drive = drive
    )
}
