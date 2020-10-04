package com.hb.jetgithub.data.datasource

import com.hb.jetgithub.data.AppResult
import com.hb.jetgithub.data.GithubService
import com.hb.jetgithub.data.models.GithubRepositoryResponse

class AppDataSourceImpl(private val api: GithubService) : AppDataSource {

    override suspend fun getListUsers() = api.getUsersList()
    override suspend fun getListRepos(username : String) = api.getListRepositories(username)
}

