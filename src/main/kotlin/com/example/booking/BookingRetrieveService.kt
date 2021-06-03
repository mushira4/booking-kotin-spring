package com.example.booking

interface BookingRetrieveService {

    fun retrieveAll(): Iterable<BookedClass>

}
