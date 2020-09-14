package com.hb.jetgithub.data

import com.hb.jetgithub.data.models.GithubRepositoryResponse
import com.hb.jetgithub.data.models.GithubUserResponse
import com.hb.jetgithub.data.models.GithubUsersListResponse
import retrofit2.http.GET
import retrofit2.http.Path

interface GithubService {

    @GET("search/users?q=repos:>1")
    suspend fun getUsersList(): GithubUsersListResponse

    @GET("users/{username}")
    suspend fun getUserInfo(@Path("username") username: String): GithubUserResponse

    @GET("users/{user}/repos")
    suspend fun listRepositories(@Path("user") user: String?): List<GithubRepositoryResponse>

}
