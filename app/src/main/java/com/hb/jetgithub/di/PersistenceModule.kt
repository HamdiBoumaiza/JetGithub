package com.hb.jetgithub.di

import android.app.Application
import androidx.room.Room
import com.hb.jetgithub.data.datasource.local.AppDatabase
import com.hb.jetgithub.data.datasource.local.AppDao
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object PersistenceModule {

    @Provides
    @Singleton
    fun provideAppDatabase(application: Application): AppDatabase {
        return Room
            .databaseBuilder(
              application,
              AppDatabase::class.java,
              "com.hb.jetgithub"
            )
            .fallbackToDestructiveMigration()
            .build()
    }

    @Provides
    @Singleton
    fun providePosterDao(appDatabase: AppDatabase): AppDao {
        return appDatabase.posterDao()
    }
}