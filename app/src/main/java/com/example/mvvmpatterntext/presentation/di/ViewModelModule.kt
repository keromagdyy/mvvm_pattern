package com.example.mvvmpatterntext.presentation.di

import android.app.Application
import com.example.mvvmpatterntext.domain.useCase.FaqUseCase
import com.example.mvvmpatterntext.presentation.ui.faq.FaqViewModel
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
class ViewModelModule {

    @Provides
    fun provideLoginViewModel(app: Application, faqUseCase: FaqUseCase): FaqViewModel {
        return FaqViewModel(app,faqUseCase)
    }

}