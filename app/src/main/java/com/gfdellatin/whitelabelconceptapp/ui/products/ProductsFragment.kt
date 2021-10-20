package com.gfdellatin.whitelabelconceptapp.ui.products

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.gfdellatin.whitelabelconceptapp.R
import com.gfdellatin.whitelabelconceptapp.databinding.FragmentProductsBinding


class ProductsFragment : Fragment() {

    private var _binding: FragmentProductsBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentProductsBinding.inflate(inflater, container, false)
        return inflater.inflate(R.layout.fragment_products, container, false)
    }
}