package com.example.booking

import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("booking")
class BookingRetrieveController(val bookingRetrieveService: BookingRetrieveService) {

    @GetMapping("findAll")
    fun retrieveAll() : ResponseEntity<Iterable<BookedClass>>{
        return ResponseEntity.ok(bookingRetrieveService.retrieveAll())
    }

}