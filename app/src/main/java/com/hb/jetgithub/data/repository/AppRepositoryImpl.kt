package com.hb.jetgithub.data.repository


import com.hb.jetgithub.data.AppResult
import com.hb.jetgithub.data.datasource.remote.RemoteDataSource
import com.hb.jetgithub.data.datasource.local.AppDao
import com.hb.jetgithub.data.mappers.mapToDomainModel
import com.hb.jetgithub.domain.models.GithubRepositoryModel
import com.hb.jetgithub.domain.models.GithubUserModel
import com.hb.jetgithub.domain.models.GithubUsersListModel
import com.hb.jetgithub.domain.repository.AppRepository


class AppRepositoryImpl(
    private val remoteDataSource: RemoteDataSource,
    private val appDao: AppDao
) : AppRepository {

    override suspend fun getListUsers(): AppResult<GithubUsersListModel> {
        val result = remoteDataSource.getListUsers()
        return if (result.isSuccessful) {
            AppResult.Success(result.body()?.mapToDomainModel() ?: GithubUsersListModel())
        } else {
            AppResult.Error(result.errorBody().toString())
        }
    }

    override suspend fun getListRepos(username: String): AppResult<List<GithubRepositoryModel>> {
        val listReposDao = appDao.getListRepository()
        return if (listReposDao.isEmpty()) {
            val result = remoteDataSource.getListRepos(username)
            if (result.isSuccessful) {
                result.body()?.let { appDao.insertListRepos(it) }
                AppResult.Success(result.body()?.map { it.mapToDomainModel() } ?: emptyList())
            } else {
                AppResult.Error(result.errorBody().toString())
            }
        } else {
            AppResult.Success(listReposDao.map { it.mapToDomainModel() })
        }
    }

    override suspend fun getCurrentUser(username: String): AppResult<GithubUserModel> {
        val currentUser = appDao.getUser()
        return if (currentUser == null) {
            val result = remoteDataSource.getCurrentUser(username)
            if (result.isSuccessful) {
                result.body()?.let { appDao.insertUser(it) }
                AppResult.Success(result.body()?.mapToDomainModel() ?: GithubUserModel())
            } else {
                AppResult.Error(result.errorBody().toString())
            }
        } else {
            AppResult.Success(currentUser.mapToDomainModel())
        }
    }
}