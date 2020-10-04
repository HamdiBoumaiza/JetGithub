package com.hb.jetgithub.di

import com.hb.jetgithub.domain.repository.AppRepository
import dagger.Provides
import dagger.hilt.EntryPoint
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent

@EntryPoint
@InstallIn(ApplicationComponent::class)
interface RepositoryModule {

    @Provides
    fun provideAppRepository(): AppRepository
}
