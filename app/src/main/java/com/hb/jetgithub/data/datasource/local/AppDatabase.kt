package com.hb.jetgithub.data.datasource.local

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.hb.jetgithub.data.models.GithubRepositoryResponse
import com.hb.jetgithub.data.models.GithubUserResponse
import com.hb.jetgithub.data.models.GithubUsersListResponse

@Database(
  entities = [
    GithubUserResponse::class,
    GithubRepositoryResponse::class,
    GithubUsersListResponse::class], version = 1, exportSchema = true
)
@TypeConverters(UserTypeConverter::class)
abstract class AppDatabase : RoomDatabase() {

    abstract fun appDao(): AppDao
}
