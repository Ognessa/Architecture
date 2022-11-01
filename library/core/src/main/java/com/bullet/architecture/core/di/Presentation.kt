package com.bullet.architecture.core.di

import com.bullet.architecture.core.component.error.DefaultFailureHandler
import com.bullet.architecture.core.component.error.ErrorHandler
import com.bullet.architecture.domain.component.logger.Logger
import org.koin.dsl.module

val defaultPresentation = module {
    factory<ErrorHandler> { DefaultFailureHandler(logger = get<Logger>()) }
}