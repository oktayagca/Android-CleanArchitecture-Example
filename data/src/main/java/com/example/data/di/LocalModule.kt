package com.example.data.di

import com.example.data.remote.ApiService
import com.example.data.remote.source.RemoteDataSource
import com.example.data.repository.RepositoryImplementation
import com.example.domain.repository.IRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class LocalModule {

    @Singleton
    @Provides
    fun provideRemoteDataSource(
        apiService: ApiService
    ) : RemoteDataSource = RemoteDataSource(apiService)

    @Singleton
    @Provides
    fun provideRepository(
        remoteDataSource: RemoteDataSource
    ): IRepository {
        return RepositoryImplementation(remoteDataSource)
    }

}