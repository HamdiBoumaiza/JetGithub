package com.hb.jetgithub.domain.repository

import com.hb.jetgithub.data.AppResult
import com.hb.jetgithub.domain.models.GithubRepositoryModel
import com.hb.jetgithub.domain.models.GithubUserModel
import com.hb.jetgithub.domain.models.GithubUsersListModel


interface AppRepository {
    suspend fun getListUsers(): AppResult<GithubUsersListModel>
    suspend fun getListRepos(username: String): AppResult<List<GithubRepositoryModel>>
    suspend fun getCurrentUser(username: String): AppResult<GithubUserModel>
}