package com.example.demo.repository.impl

import com.example.demo.configuration.DependentAPIRepositoryConfigurationProperties
import com.example.demo.domain.DependentAPIResponse
import com.example.demo.repository.DependentAPIRepository
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.boot.web.client.RestTemplateBuilder
import org.springframework.http.RequestEntity
import org.springframework.http.ResponseEntity
import org.springframework.stereotype.Repository
import org.springframework.web.client.RestTemplate
import org.springframework.web.client.exchange
import java.net.URI

@Repository
class DependentAPIRepositoryImpl(
    private val restTemplateBuilder: RestTemplateBuilder,
    private val configurationProperties: DependentAPIRepositoryConfigurationProperties
) : DependentAPIRepository {

    private val restTemplate: RestTemplate = restTemplateBuilder.build()

    override fun fetchResponse(): DependentAPIResponse {
        val requestEntity: RequestEntity<Void> = RequestEntity
            .get(URI(configurationProperties.rootUri))
            .header("Content-Type", "application/json")
            .build()
        val result: ResponseEntity<DependentAPIResponse> = restTemplate.exchange(requestEntity)
        logger.info(result.body.toString())
        return result.body ?: throw IllegalStateException()
    }

    companion object {
        val logger: Logger = LoggerFactory.getLogger(this::class.java)
    }
}