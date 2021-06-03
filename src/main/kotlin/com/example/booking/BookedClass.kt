package com.example.booking

import java.util.*
import javax.persistence.Entity
import javax.persistence.Id

@Entity
data class BookedClass(
    @Id
    val id : UUID,
    val name : String
)