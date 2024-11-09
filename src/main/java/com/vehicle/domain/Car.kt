package com.vehicle.domain

import kotlinx.serialization.Serializable

@Serializable
data class Car(
    val name: String?,
    val colour: Colour?,
    val wheels: List<Wheel>?,
)
