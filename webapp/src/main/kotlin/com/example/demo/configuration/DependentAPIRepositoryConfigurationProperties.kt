package com.example.demo.configuration

import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.context.annotation.Configuration

@Configuration
@ConfigurationProperties(value = "dependent-api")
class DependentAPIRepositoryConfigurationProperties {
    lateinit var rootUri: String
}