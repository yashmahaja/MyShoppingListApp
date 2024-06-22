package com.example.myshoppinglistapp

data class LocationData(
    val latitude: Double,
    val longitude: Double
)

data class GeoCodingResponse(
    val results: List<GeoCodingResponse>,
    val status: String

)

data class GeocodingResult(
    val formatted_address:String
)
