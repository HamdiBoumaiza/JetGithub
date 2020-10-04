package com.hb.jetgithub.data.datasource

import com.hb.jetgithub.data.models.GithubRepositoryResponse
import com.hb.jetgithub.data.models.GithubUsersListResponse
import retrofit2.Response


interface AppDataSource {

    suspend fun getListUsers(): Response<GithubUsersListResponse>
    suspend fun getListRepos(username: String): Response<List<GithubRepositoryResponse>>

}