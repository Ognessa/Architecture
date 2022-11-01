package com.bullet.architecture.domain.entities.failure

sealed class ServerError : Failure.FeatureFailure() {
    object ServerCommon : ServerError()
}