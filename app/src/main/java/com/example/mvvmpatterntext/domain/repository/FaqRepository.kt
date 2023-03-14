package com.example.mvvmpatterntext.domain.repository

import com.example.mvipatterntext.data.model.faq.FAQModel

interface FaqRepository {
    suspend fun faqFromApi(): FAQModel
}
