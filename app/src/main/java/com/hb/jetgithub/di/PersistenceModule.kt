package com.hb.jetgithub.di

import android.app.Application
import androidx.room.Room
import com.google.gson.Gson
import com.hb.jetgithub.data.datasource.local.AppDao
import com.hb.jetgithub.data.datasource.local.AppDatabase
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
            .databaseBuilder(application, AppDatabase::class.java, "com.hb.jetgithub")
            .fallbackToDestructiveMigration()
            .build()
    }

    @Provides
    @Singleton
    fun providePosterDao(appDatabase: AppDatabase): AppDao {
        return appDatabase.appDao()
    }

    @Singleton
    @Provides
    fun provideGson(): Gson = Gson()
}