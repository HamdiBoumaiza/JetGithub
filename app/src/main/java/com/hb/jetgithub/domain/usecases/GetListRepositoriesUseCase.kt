package com.hb.jetgithub.domain.usecases

import com.hb.jetgithub.data.AppResult
import com.hb.jetgithub.domain.models.GithubRepositoryModel
import com.hb.jetgithub.domain.repository.AppRepository
import javax.inject.Inject


open class GetListRepositoriesUseCase @Inject constructor(
    private val appRepository: AppRepository
) : BaseUseCaseWithRequest<String, AppResult<List<GithubRepositoryModel>>> {
    override suspend operator fun invoke(request: String) = appRepository.getListRepos(request)
}