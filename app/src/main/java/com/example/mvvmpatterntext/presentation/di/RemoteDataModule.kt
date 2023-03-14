package com.example.mvvmpatterntext.presentation.di

import com.example.mvvmpatterntext.data.apis.IFaqApi
import com.example.mvvmpatterntext.data.repo.FAQDataSource
import com.example.mvvmpatterntext.data.repo.FAQDataSourceImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
class RemoteDataModule {

    @Provides
    fun provideFAQRemoteDataSource(iFaqApi: IFaqApi): FAQDataSource {
        return FAQDataSourceImpl(iFaqApi)
    }

}