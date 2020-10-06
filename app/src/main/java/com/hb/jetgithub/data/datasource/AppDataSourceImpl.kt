package com.hb.jetgithub.data.datasource

import com.hb.jetgithub.data.GithubService

class AppDataSourceImpl(private val api: GithubService) : AppDataSource {

    override suspend fun getListUsers() = api.getUsersList()
    override suspend fun getCurrentUser(username: String) = api.getUserInfo(username)
    override suspend fun getListRepos(username: String) = api.getListRepositories(username)
}

