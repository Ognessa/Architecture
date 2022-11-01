package com.bullet.architecture.domain.usecase

import com.bullet.architecture.domain.entities.Either
import com.bullet.architecture.domain.entities.failure.Failure

abstract class SyncUseCase<out Type : Any> : UseCase<Type> {

    abstract fun execute(param: UseCase.Params? = null): Either<Failure, Type>

    operator fun invoke(
        param: UseCase.Params? = null,
        onResult: (Either<Failure, Type>) -> Unit = {}
    ) = onResult(execute(param))

}