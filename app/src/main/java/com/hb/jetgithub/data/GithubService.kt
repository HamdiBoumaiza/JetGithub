package com.hb.jetgithub.data

import com.hb.jetgithub.data.models.GithubRepositoryResponse
import com.hb.jetgithub.data.models.GithubUserResponse
import com.hb.jetgithub.data.models.GithubUsersListResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path

interface GithubService {

    @GET("search/users?q=repos:>1")
    suspend fun getUsersList(): Response<GithubUsersListResponse>

    @GET("users/{username}")
    suspend fun getUserInfo(@Path("username") username: String):Response<GithubUserResponse>

    @GET("users/{user}/repos")
    suspend fun getListRepositories(@Path("user") user: String?): Response<List<GithubRepositoryResponse>>

}
