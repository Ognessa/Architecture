package com.bullet.architecture.data.network.configuration.convertor

import retrofit2.Converter

interface ConverterFactory {
    val converterFactory: Converter.Factory
}