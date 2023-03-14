package com.example.mvvmpatterntext.presentation.di

import com.example.mvvmpatterntext.domain.repository.FaqRepository
import com.example.mvvmpatterntext.domain.useCase.FaqUseCase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent


@Module
@InstallIn(SingletonComponent::class)
class UseCaseModule {

    @Provides
    fun provideCheckLoginUseCase(faqRepository: FaqRepository): FaqUseCase {
        return FaqUseCase(faqRepository)
    }

}