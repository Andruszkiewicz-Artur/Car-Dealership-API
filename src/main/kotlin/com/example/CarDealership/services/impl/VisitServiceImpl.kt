package com.example.CarDealership.services.impl

import com.example.CarDealership.domain.dto.VisitDto
import com.example.CarDealership.domain.entity.VisitEntity
import com.example.CarDealership.repository.CarRepository
import com.example.CarDealership.repository.UserRepository
import com.example.CarDealership.repository.VisitRepository
import com.example.CarDealership.services.VisitService
import org.springframework.stereotype.Service
import java.util.Random

@Service
class VisitServiceImpl(
    private val visitRepository: VisitRepository,
    private val carRepository: CarRepository,
    private val userRepository: UserRepository
): VisitService {

    override fun addVisit(visit: VisitDto): VisitEntity {
        val car = carRepository.findById(visit.carId).get()
        val user = userRepository.findById(visit.userId).get()

        val visitEntity = VisitEntity(
            date = visit.date,
            user = user,
            car = car,
            id = Random().nextLong()
        )

        visitRepository.save(visitEntity)

        return visitEntity
    }

    override fun removeVisit(visitId: Long) =
        visitRepository
            .deleteById(visitId)

}