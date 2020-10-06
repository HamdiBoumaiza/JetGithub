package com.hb.jetgithub.data.datasource.remote

import com.hb.jetgithub.data.GithubService

class RemoteDataSourceImpl(private val api: GithubService) : RemoteDataSource {

    override suspend fun getListUsers() = api.getUsersList()
    override suspend fun getCurrentUser(username: String) = api.getUserInfo(username)
    override suspend fun getListRepos(username: String) = api.getListRepositories(username)
}

