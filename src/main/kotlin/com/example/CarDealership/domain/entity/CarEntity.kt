package com.example.CarDealership.domain.entity

import com.example.CarDealership.domain.dto.car.CarDto
import com.example.CarDealership.domain.dto.car.CarsResponse
import com.example.CarDealership.domain.enums.BodyType
import com.example.CarDealership.domain.enums.DriveType
import com.example.CarDealership.domain.enums.FuelType
import com.example.CarDealership.domain.enums.GearboxType
import jakarta.persistence.*

@Entity
@Table(name = "cars")
data class CarEntity(
    @Id
    @GeneratedValue
    val id: Long? = null,

    val brand: String,

    val vehicleModel: String,

    val generation: String,

    val vin: String,

    val price: Float,

    val yearOfManufacture: Int,

    @Enumerated(EnumType.STRING)
    val fuelType: FuelType,

    val description: String?,

    val mileage: Int,

    val capacity: Int,

    val power: Int,

    @Enumerated(EnumType.STRING)
    val gearbox: GearboxType,

    @Enumerated(EnumType.STRING)
    val bodyType: BodyType,

    val numberOfDoors: Int,

    val numberOfSeats: Int,

    @Enumerated(EnumType.STRING)
    val drive: DriveType,

//    @OneToMany(mappedBy = "car")
//    val images: MutableList<ImageEntity> = mutableListOf()
) {
    fun toDto() = CarDto(
        id = id.takeIf {
            it != null
        } ?: throw RuntimeException("Problem with taking data of car!"),
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
        drive = drive,
//        images = images.map {
//            it.toDto()
//        }
    )

    fun toCarsResponse() = CarsResponse(
        id = id ?: throw RuntimeException("Problem with taking data of car!"),
        brand = brand,
        vehicleModel = vehicleModel,
        yearOfManufacture = yearOfManufacture,
        fuelType = fuelType,
        mileage = mileage,
//        image = images.first().toDto()
    )
}
