package com.example.mvvmpatterntext.presentation.ui.faq

import android.app.Application
import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.mvipatterntext.data.model.faq.FAQModel
import com.example.mvvmpatterntext.data.model.faq.FAQSubModel
import com.example.mvvmpatterntext.domain.useCase.FaqUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject


enum class FaqApiStatus { LOADING, ERROR, DONE }


@HiltViewModel
class FaqViewModel @Inject constructor(
    private val app: Application,
    private val faqUseCase: FaqUseCase,
) : ViewModel() {


    private val _statusFaq = MutableLiveData<FaqApiStatus>()
    val statusFaq: LiveData<FaqApiStatus>
        get() = _statusFaq

    private var _faq = MutableLiveData<FAQModel>()
    val faq: LiveData<FAQModel>
        get() = _faq



    init {
        getCustomers()
    }


    private fun getCustomers() {
        _statusFaq.postValue(FaqApiStatus.LOADING)
        viewModelScope.launch(Dispatchers.IO) {
            try {
                _statusFaq.postValue(FaqApiStatus.DONE)

                _faq.postValue(faqUseCase.execute())
                Log.d("getCustomerException", "getCustomers: ${faq}")

            } catch (e: Exception) {
                _statusFaq.postValue(FaqApiStatus.ERROR)
                Log.d("getCustomerException", "getCustomers: ${e.message}")
            }

        }
    }


}