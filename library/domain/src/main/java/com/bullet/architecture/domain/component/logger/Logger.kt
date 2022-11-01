package com.bullet.architecture.domain.component.logger

import com.bullet.architecture.domain.component.logger.configuration.LoggerConfiguration

interface Logger {
    fun getConfiguration(): LoggerConfiguration

    fun setConfiguration(configuration: LoggerConfiguration)

    fun log(
        level: Level = Level.Debug,
        message: String? = null,
        throwable: Throwable? = null,
        configuration: LoggerConfiguration = getConfiguration()
    )
}