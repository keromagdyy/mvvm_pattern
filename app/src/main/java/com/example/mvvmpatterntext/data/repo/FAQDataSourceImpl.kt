package com.example.mvvmpatterntext.data.repo

import com.example.mvipatterntext.data.model.faq.FAQModel
import com.example.mvvmpatterntext.data.apis.IFaqApi
import com.example.mvvmpatterntext.data.model.faq.FAQSubModel

class FAQDataSourceImpl(private val scannerApis: IFaqApi):
    FAQDataSource {
    override suspend fun getFaq(): FAQModel {
        return scannerApis.getFAQ()
    }

}