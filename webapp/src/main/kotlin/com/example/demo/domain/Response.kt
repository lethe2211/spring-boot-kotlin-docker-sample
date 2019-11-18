package com.example.demo.domain

import com.fasterxml.jackson.annotation.JsonProperty

data class Response(
    @field:JsonProperty(value = "status") val status: String
)