package com.example.mvvmpatterntext.data.repo

import com.example.mvipatterntext.data.model.faq.FAQModel
import com.example.mvvmpatterntext.data.model.faq.FAQSubModel
import com.example.mvvmpatterntext.domain.repository.FaqRepository

class FaqRepoImpl(private val faqDataSource: FAQDataSource) :
    FaqRepository {
    override suspend fun faqFromApi(): FAQModel {
        return faqDataSource.getFaq()
    }
}