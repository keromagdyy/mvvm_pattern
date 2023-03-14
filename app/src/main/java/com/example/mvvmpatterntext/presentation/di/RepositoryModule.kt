package com.example.mvvmpatterntext.presentation.di

import com.example.mvvmpatterntext.data.repo.FAQDataSource
import com.example.mvvmpatterntext.data.repo.FaqRepoImpl
import com.example.mvvmpatterntext.domain.repository.FaqRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent


@Module
@InstallIn(SingletonComponent::class)
class RepositoryModule {

    @Provides
    fun provideCheckLoginRepository(faqDataSource: FAQDataSource): FaqRepository {
        return FaqRepoImpl(faqDataSource)
    }

}