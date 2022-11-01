package com.bullet.architecture.core.di

import com.bullet.architecture.core.BuildConfig
import com.bullet.architecture.core.component.device.LibDeviceInfo
import com.bullet.architecture.core.component.logger.AndroidLogger
import com.bullet.architecture.core.component.logger.configuration.DefaultLoggerConfiguration
import com.bullet.architecture.domain.component.device.DeviceInfo
import com.bullet.architecture.domain.component.device.UserAgent
import com.bullet.architecture.domain.component.device.UserAgentProvider
import com.bullet.architecture.domain.component.logger.Logger
import com.bullet.architecture.domain.component.logger.configuration.LoggerConfiguration
import org.koin.core.module.Module
import org.koin.dsl.module

val defaultLogger = module {
    factory<Logger> {
        AndroidLogger(configuration = get<LoggerConfiguration>())
    }
}

val defaultLoggerConfiguration = module {
    factory<LoggerConfiguration> {
        DefaultLoggerConfiguration(isEnabled = BuildConfig.DEBUG)
    }
}

val defaultUserAgent = module {
    single<UserAgentProvider> {
        UserAgent(deviceInfo = get<DeviceInfo>())
    }
}

val defaultDeviceInfo = module {
    single<DeviceInfo> {
        LibDeviceInfo()
    }
}

val defaultLoggerModule = listOf<Module>(defaultLoggerConfiguration, defaultLogger)
val defaultDeviceInfoModule = listOf<Module>(defaultDeviceInfo, defaultUserAgent)

val defaultDomainModule = defaultLoggerModule + defaultDeviceInfoModule
