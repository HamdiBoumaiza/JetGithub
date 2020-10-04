package com.hb.jetgithub.domain.usecases

interface BaseUseCaseWithRequest<in Request, out Type> {
    suspend operator fun invoke(request: Request): Type
}

interface BaseUseCase<out Type> {
    suspend operator fun invoke(): Type
}