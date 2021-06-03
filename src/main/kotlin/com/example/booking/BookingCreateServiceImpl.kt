package com.example.booking

import org.springframework.stereotype.Service
import java.util.*

@Service
class BookingCreateServiceImpl(
    val bookingRepository: BookingRepository
) : BookingCreateService {

    override fun create() {
        bookingRepository.save( BookedClass( UUID.randomUUID(), "xpto" ) )
    }

}