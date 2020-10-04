package com.hb.jetgithub.domain.usecases

import com.hb.jetgithub.domain.models.GithubUsersListModel
import com.hb.jetgithub.domain.repository.AppRepository
import retrofit2.Response
import javax.inject.Inject


open class GetListUsersUseCase (
    private val appRepository: AppRepository
) : BaseUseCase<Response<GithubUsersListModel>> {

    override suspend operator fun invoke() = appRepository.getListUsers()
}