package com.hb.jetgithub.domain.usecases

import com.hb.jetgithub.data.AppResult
import com.hb.jetgithub.domain.models.GithubUsersListModel
import com.hb.jetgithub.domain.repository.AppRepository
import javax.inject.Inject


open class GetListUsersUseCase @Inject constructor(
    private val appRepository: AppRepository
) : BaseUseCase<AppResult<GithubUsersListModel>> {

    override suspend operator fun invoke() = appRepository.getListUsers()
}