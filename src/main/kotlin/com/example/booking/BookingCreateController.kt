package com.example.booking

import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("booking")
class BookingCreateController(
    val bs: BookingCreateService
) {

    @PostMapping("/create")
    fun create() {
        bs.create()
    }

}