package com.bullet.architecture.data.network.configuration

import com.bullet.architecture.data.network.configuration.convertor.ConverterFactory
import com.bullet.architecture.data.network.configuration.convertor.KotlinConverterFactory
import com.bullet.architecture.data.network.configuration.interceptor.utils.token.TokenProvider

sealed class NetworkConfiguration {
    abstract val server: String

    open val timeout: Long = 30L * 1000

    open val withLogs = true
    open val withAuth = false

    open val converterFactory: ConverterFactory = KotlinConverterFactory()

    abstract class AuthConfiguration(val tokenProvider: TokenProvider) : NetworkConfiguration() {
        override val withAuth: Boolean = true
    }
}