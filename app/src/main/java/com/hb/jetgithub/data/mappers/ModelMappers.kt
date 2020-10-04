package com.hb.jetgithub.data.mappers

import com.hb.jetgithub.data.models.GithubRepositoryResponse
import com.hb.jetgithub.data.models.GithubUserResponse
import com.hb.jetgithub.data.models.GithubUsersListResponse
import com.hb.jetgithub.domain.models.GithubRepositoryModel
import com.hb.jetgithub.domain.models.GithubUserModel
import com.hb.jetgithub.domain.models.GithubUsersListModel

fun GithubUsersListResponse.mapToDomainModel() = GithubUsersListModel(
    totalCount ?: 0L,
    incompleteResults ?: false,
    items?.map { it.mapToDomainModel() } ?: emptyList()
)


fun GithubRepositoryResponse.mapToDomainModel() = GithubRepositoryModel(
    owner?.mapToDomainModel() ?: GithubUserModel(),
    id ?: 0,
    name ?: "",
    description ?: "",
    htmlUrl ?: ""
)


fun GithubUserResponse.mapToDomainModel() = GithubUserModel(
    id ?: 0L,
    login ?: "",
    avatarUrl ?: "",
    htmlUrl ?: "",
    followersUrl ?: "",
    reposUrl ?: "",
    name ?: "",
    company ?: "",
    blog ?: "",
    location ?: "",
    email ?: "",
    bio ?: "",
    publicRepos ?: 0,
    publicGists ?: 0,
    followers ?: 0,
    following ?: 0
)