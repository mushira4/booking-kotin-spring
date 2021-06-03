package com.example.booking

import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository
import java.util.*

@Repository
interface BookingRepository : CrudRepository<BookedClass, UUID>{

    fun findByName(name: String)

}
