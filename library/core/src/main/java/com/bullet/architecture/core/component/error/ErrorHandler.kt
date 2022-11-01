package com.bullet.architecture.core.component.error

import com.bullet.architecture.domain.entities.failure.Failure

interface ErrorHandler {

    fun parseFailure(failure: Failure)

}