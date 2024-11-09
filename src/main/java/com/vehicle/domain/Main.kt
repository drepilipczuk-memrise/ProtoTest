package com.vehicle.domain

import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.protobuf.schema.ProtoBufSchemaGenerator

object Main {

    @OptIn(ExperimentalSerializationApi::class)
    @JvmStatic
    fun main(args: Array<String>) {
        val carSchema = ProtoBufSchemaGenerator.generateSchemaText(Car.serializer().descriptor)
        println(carSchema)
    }
}
