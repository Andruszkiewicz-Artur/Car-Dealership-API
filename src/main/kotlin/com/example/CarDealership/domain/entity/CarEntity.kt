package com.example.CarDealership.domain.entity

import com.example.CarDealership.domain.dto.CarDto
import com.example.CarDealership.domain.enums.BodyType
import com.example.CarDealership.domain.enums.DriveType
import com.example.CarDealership.domain.enums.FuelType
import com.example.CarDealership.domain.enums.GearboxType
import jakarta.persistence.*

@Entity
@Table(name="cars")
data class CarEntity(
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "car_id_seq")
    @Column(name = "id")
    val id: Long? = null,

    @Column(name = "brand", nullable = false)
    val brand: String,

    @Column(name = "vehicleModel", nullable = false)
    val vehicleModel: String,

    @Column(name = "generation", nullable = false)
    val generation: String,

    @Column(name = "vin", nullable = false)
    val vin: String,

    @Column(name = "price", nullable = false)
    val price: Float,

    @Column(name = "yearOfManufacture", nullable = false)
    val yearOfManufacture: Int,

    @Enumerated(EnumType.STRING)
    @Column(name = "fuelType", nullable = false)
    val fuelType: FuelType,

    @Column(name = "description")
    val description: String?,

    @Column(name = "mileage", nullable = false)
    val mileage: Int,

    @Column(name = "capacity", nullable = false)
    val capacity: Int,

    @Column(name = "power", nullable = false)
    val power: Int,

    @Enumerated(EnumType.STRING)
    @Column(name = "gearbox", nullable = false)
    val gearbox: GearboxType,

    @Enumerated(EnumType.STRING)
    @Column(name = "bodyType", nullable = false)
    val bodyType: BodyType,

    @Column(name = "numberOfDoors", nullable = false)
    val numberOfDoors: Int,

    @Column(name = "numberOfSeats", nullable = false)
    val numberOfSeats: Int,

    @Enumerated(EnumType.STRING)
    @Column(name = "drive", nullable = false)
    val drive: DriveType,
) {
    fun toDto() = CarDto(
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
