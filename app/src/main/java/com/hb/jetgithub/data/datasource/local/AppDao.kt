package com.hb.jetgithub.data.datasource.local

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.hb.jetgithub.data.models.GithubRepositoryResponse
import com.hb.jetgithub.data.models.GithubUserResponse

@Dao
interface AppDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertListRepos(repositories: List<GithubRepositoryResponse>)

    @Query("SELECT * FROM GithubRepositoryResponse WHERE id = :id")
    fun getRepository(id: Int): GithubRepositoryResponse

    @Query("SELECT * FROM GithubRepositoryResponse")
    suspend fun getListRepository(): List<GithubRepositoryResponse>


    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertUser(posters: GithubUserResponse)

    @Query("SELECT * FROM GithubUserResponse")
    suspend fun getUser(): GithubUserResponse
}
