package com.example.demo.service.impl

import com.example.demo.domain.DependentServiceResult
import com.example.demo.repository.DependentAPIRepository
import com.example.demo.service.DependentService
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.stereotype.Service

@Service
class DependentServiceImpl(
    private val dependentAPIRepository: DependentAPIRepository
) : DependentService {

    override fun callDependentAPI(): DependentServiceResult {
        val result = dependentAPIRepository.fetchResponse()
        logger.info(result.toString())
        return DependentServiceResult.of(result)
    }

    companion object {
        val logger: Logger = LoggerFactory.getLogger(this::class.java)
    }
}