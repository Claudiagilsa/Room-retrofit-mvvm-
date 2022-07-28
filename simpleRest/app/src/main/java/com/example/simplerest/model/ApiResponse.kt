package com.example.simplerest.model

data class ApiResponse (
    val result: List<Results> = emptyList(),
)

data class Results(
    val name: UserName?,
    val location: UserLocation?,
    val picture: UserPicture?,

)