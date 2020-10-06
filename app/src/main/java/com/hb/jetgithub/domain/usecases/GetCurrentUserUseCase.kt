package com.hb.jetgithub.domain.usecases

import com.hb.jetgithub.data.AppResult
import com.hb.jetgithub.domain.models.GithubUserModel
import com.hb.jetgithub.domain.repository.AppRepository
import javax.inject.Inject


open class GetCurrentUserUseCase @Inject constructor(
    private val appRepository: AppRepository
) : BaseUseCaseWithRequest<String, AppResult<GithubUserModel>> {
    override suspend operator fun invoke(request: String) = appRepository.getCurrentUser(request)
}