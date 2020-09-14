package com.hb.jetgithub.di

import com.facebook.stetho.okhttp3.StethoInterceptor
import com.hb.jetgithub.BuildConfig
import com.hb.jetgithub.data.GithubService
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object NetworkModule {

    @Provides
    @Singleton
    fun provideRetrofit(okHttpClient: OkHttpClient): Retrofit {
        return Retrofit.Builder()
            .client(okHttpClient)
            .baseUrl("https://api.github.com/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    const val TOME_OUT: Long = 30

    @Provides
    @Singleton
    fun provideOkHttpClient(): OkHttpClient {
        val builder = OkHttpClient.Builder()
        builder
            .connectTimeout(TOME_OUT, TimeUnit.SECONDS)
            .readTimeout(TOME_OUT, TimeUnit.SECONDS)
            .writeTimeout(TOME_OUT, TimeUnit.SECONDS)
        if (BuildConfig.DEBUG) builder.addInterceptor(StethoInterceptor())
        return builder.build()
    }


    @Provides
    @Singleton
    fun provideGithubService(retrofit: Retrofit): GithubService {
        return retrofit.create(GithubService::class.java)
    }
}
