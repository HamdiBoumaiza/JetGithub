package com.hb.jetgithub.di

import com.hb.jetgithub.data.GithubService
import com.hb.jetgithub.data.datasource.remote.RemoteDataSourceImpl
import com.hb.jetgithub.data.datasource.local.AppDao
import com.hb.jetgithub.data.repository.AppRepositoryImpl
import com.hb.jetgithub.domain.repository.AppRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent

@Module
@InstallIn(ApplicationComponent::class)
object RepositoryModule {

    @Provides
    fun provideAppRepository(appDao: AppDao, githubService: GithubService): AppRepository {
        return AppRepositoryImpl(RemoteDataSourceImpl(githubService), appDao)
    }
}
