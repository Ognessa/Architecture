package com.bullet.architecture.domain.usecase

interface UseCase<out Result> where Result : Any {
    open class Params
}