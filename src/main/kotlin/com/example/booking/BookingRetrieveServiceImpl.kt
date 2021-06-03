package com.example.booking

import org.springframework.stereotype.Service

@Service
class BookingRetrieveServiceImpl(
    val bookingRepository : BookingRepository
) : BookingRetrieveService {

    override fun retrieveAll() : Iterable<BookedClass> = bookingRepository.findAll()

}