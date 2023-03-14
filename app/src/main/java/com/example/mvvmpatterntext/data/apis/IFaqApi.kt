package com.example.mvvmpatterntext.data.apis

import com.example.mvipatterntext.data.model.faq.FAQModel
import com.example.mvvmpatterntext.common.ConstantLinks
import com.example.mvvmpatterntext.data.model.faq.FAQSubModel
import retrofit2.http.GET

interface IFaqApi {
    @GET(ConstantLinks.APP_FAQ)
    suspend fun getFAQ () : FAQModel
}