package com.example.demo.service

import com.example.demo.domain.DependentServiceResult

interface DependentService {

    fun callDependentAPI(): DependentServiceResult
}