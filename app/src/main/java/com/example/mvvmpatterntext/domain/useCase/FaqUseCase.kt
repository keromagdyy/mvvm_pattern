package com.example.mvvmpatterntext.domain.useCase

import com.example.mvipatterntext.data.model.faq.FAQModel
import com.example.mvvmpatterntext.data.model.faq.FAQSubModel
import com.example.mvvmpatterntext.domain.repository.FaqRepository

class FaqUseCase(private val faqRepository: FaqRepository) {
    suspend fun execute(): FAQModel {
        return faqRepository.faqFromApi()
    }
}