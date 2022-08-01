package com.example.data.entity

data class CharacterResponse(
    val info: InfoResponse,
    val results: List<Result>
)