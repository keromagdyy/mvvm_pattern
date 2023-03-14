package com.example.mvvmpatterntext.data.repo

import com.example.mvipatterntext.data.model.faq.FAQModel

interface FAQDataSource {
    suspend fun getFaq(): FAQModel
}