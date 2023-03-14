package com.example.mvvmpatterntext.presentation.ui.faq

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.mvvmpatterntext.R
import com.example.mvvmpatterntext.data.model.faq.FAQSubModel
import com.example.mvvmpatterntext.databinding.FragmentFaqBinding
import com.example.mvvmpatterntext.presentation.ui.MainActivity

class FaqFragment : Fragment() {
    lateinit var binding : FragmentFaqBinding

    var adapter = FAQAdapter()

    lateinit var faqViewModel: FaqViewModel
    var list= ArrayList<FAQSubModel>()


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentFaqBinding.inflate(inflater,container, false)

        val layoutManager =
            LinearLayoutManager(requireContext(), LinearLayoutManager.VERTICAL, false)
        binding.recyclerView.layoutManager = layoutManager

        binding.recyclerView.adapter = adapter

        faqViewModel = (activity as MainActivity).faqViewModel
        observeFaq()

        return binding.root
    }

    fun observeFaq() {

        faqViewModel.faq.observe(viewLifecycleOwner) {

            list = it.data.FAQ
            Log.d("detailsViewModel", "onCreateView: ${list}")

            adapter.setData(list, requireContext())
            adapter.notifyDataSetChanged()
        }

    }
}