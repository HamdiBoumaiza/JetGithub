package com.hb.jetgithub.data.datasource.remote

import com.hb.jetgithub.data.models.GithubRepositoryResponse
import com.hb.jetgithub.data.models.GithubUserResponse
import com.hb.jetgithub.data.models.GithubUsersListResponse
import retrofit2.Response


interface RemoteDataSource {

    suspend fun getListUsers(): Response<GithubUsersListResponse>
    suspend fun getListRepos(username: String): Response<List<GithubRepositoryResponse>>
    suspend fun getCurrentUser(username: String): Response<GithubUserResponse>
}