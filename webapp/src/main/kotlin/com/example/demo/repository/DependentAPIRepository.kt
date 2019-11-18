package com.example.demo.repository

import com.example.demo.domain.DependentAPIResponse

interface DependentAPIRepository {

    fun fetchResponse(): DependentAPIResponse
}