package com.example.demo.domain

data class DependentServiceResult(
    val status: String
) {

    companion object {
        fun of(dependentAPIResponse: DependentAPIResponse): DependentServiceResult {
            return DependentServiceResult(
                status = dependentAPIResponse.status
            )
        }
    }
}